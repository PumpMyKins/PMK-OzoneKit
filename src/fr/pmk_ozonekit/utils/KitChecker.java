package fr.pmk_ozonekit.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.bukkit.entity.Player;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;



public class KitChecker {
	
	public static ArrayList<File> getListFiles(String path) {

		File f = new File("plugins/kit/"+path);
		ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
		return files;
	}
	
	public static int checkUUID(Player p, String kitname, boolean usekit) {
		
		ArrayList<File> files = getListFiles(kitname);
		int canUse = files.size(); 
		String playerUUID = p.getUniqueId().toString();
		boolean isSingle = true;
		boolean canTook = false;
		for(int i = 0;i < files.size(); i++) {
	
			try {
				
				File fXmlFile = new File(files.get(i).getName());
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document kitx = dBuilder.parse("plugins/kit/"+kitname+"/"+fXmlFile);
				
				kitx.getDocumentElement().normalize();
				
				NodeList nList = kitx.getElementsByTagName("player");
				NodeList bList = kitx.getElementsByTagName("buyer");
				if(bList.getLength() < 1) {
					isSingle = false;
				}
				boolean used = false;
				
				for (int temp = 0; temp < nList.getLength(); temp++) {
					
					Node nNode = nList.item(temp);
					
					if(nNode.getNodeType() == Node.ELEMENT_NODE) {
						
						Element eElement = (Element) nNode;
						
						String tempUUID = eElement.getAttribute("id");
						if (tempUUID.equals(playerUUID)) {
							
							canUse--;
							used = true;
							break;
						}

						
					}
				
				}
				if(isSingle = true) {
					for (int temp = 0; temp < nList.getLength(); temp++) {
						
						Node nNode = bList.item(temp);
						
						if(nNode.getNodeType() == Node.ELEMENT_NODE) {
							
							Element eElement = (Element) nNode;
							
							String tempUUID = eElement.getAttribute("id");
							if (tempUUID.equals(playerUUID)) {
								
								canTook = true;
							}

							
						}
					
					}
				}
				if(usekit == true) {
					if(used == false) {
						if(isSingle == false || isSingle == true && canTook == true) {
							
						useKit(files.get(i).getName(), playerUUID, kitname);
						return 5555;
						
						}
					}
				}
				
				
			} catch (Exception e) {
		       e.printStackTrace();
			}
		}
		return canUse;
	}

	public static void useKit(String filename, String playerUUID, String kitname) {
		
		try {
			
			String filepath ="plugins/kit/"+kitname+"/"+filename;
			DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
			Document kit = docBuilder.parse(filepath);
			
			Node kittyname = kit.getFirstChild();
			
			Element player = kit.createElement("player");
			player.setAttribute("id", playerUUID);
			kittyname.appendChild(player);
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
			Transformer transformer = transformerFactory.newTransformer();
			DOMSource source = new DOMSource(kit);
			StreamResult result = new StreamResult(new File(filepath));
			transformer.transform(source, result);;
			
			
		}catch (ParserConfigurationException pce) {
			pce.printStackTrace();
		} catch (TransformerException tfe) {
			tfe.printStackTrace();
	   	} catch (IOException ioe) {
			ioe.printStackTrace();
	   	} catch (SAXException sae) {
			sae.printStackTrace();
	   	}
	}
	
	public static boolean onCheck(Player p,String kitname) {
		
		String kit = kitname;
		int nbreKit = getListFiles(kit).size();
		if(nbreKit >= 1) {
			if(checkUUID(p, kitname, true) == 5555) {
				return true;
			}
			else {
				
				p.sendMessage("§6§l[§r§2PumpMyKit§6§l]§r§4 Kit "+ kitname + " déjà utilisé "  );
			}
			
		}
		else {
		
			p.sendMessage("§6§l[§r§2PumpMyKit§6§l] §r§2§o Aucune kit "+ kitname +" acheté pour le moment ");
		}
		return false;
	}
}
