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
	
	public static boolean checkUUID(Player p, String kitname) {
		
		
		String playerUUID = p.getUniqueId().toString();
		ArrayList<File> files = getListFiles(kitname);
		for(int i = 0;i < files.size(); i++) {
	
			try {
				
				File fXmlFile = new File(files.get(i).getName());
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document kitx = dBuilder.parse("plugins/kit/"+kitname+"/"+fXmlFile);
				
				kitx.getDocumentElement().normalize();

				NodeList nList = kitx.getElementsByTagName("player");
				boolean used = false;
				
				for (int temp = 0; temp < nList.getLength(); temp++) {
					
					Node nNode = nList.item(temp);
					
					if(nNode.getNodeType() == Node.ELEMENT_NODE) {
						
						Element eElement = (Element) nNode;
						
						String tempUUID = eElement.getAttribute("id");
						if (tempUUID.equals(playerUUID)) {
							
							used = true;
							break;
						}
						
					}
				
				}
				if(used == false) {
					
					useKit(files.get(i).getName(), playerUUID, kitname);
					return true;
				}
				
				
			} catch (Exception e) {
		       e.printStackTrace();
			}
		}
		return false;
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
			boolean access = checkUUID(p, kitname);
			if(access == true) {
				return true;
			}
			else {
				
				p.sendMessage("§6§l[§r§2PumpMyKit§6§l]§4 Kit déjà utilisé §r §6§l[§r§2PumpMyKit§6§l]");
			}
			
		}
		else {
		
			p.sendMessage("Aucune Kit achet� pour le moment.");
		}
		return false;
	}
}
