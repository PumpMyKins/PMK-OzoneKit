package fr.pmk_ozonekit.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.bukkit.entity.Player;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class KitChecker {
	
	public static ArrayList<File> getListFiles(String path) {

		File f = new File("plugins/kit/"+path);
		System.out.println(f);
		ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
		System.out.println(files.size());
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
				
				System.out.println("Root :" + kitx.getDocumentElement().getNodeName());

				NodeList nList = kitx.getElementsByTagName("player");
				boolean used = false;
				
				for (int temp = 0; temp < nList.getLength(); temp++) {
					
					Node nNode = nList.item(temp);
					
					if(nNode.getNodeType() == Node.ELEMENT_NODE) {
						
						Element eElement = (Element) nNode;
						
						String tempUUID = eElement.getAttribute("id");
						
						if (tempUUID == playerUUID) {
							
							used = true;
							System.out.println("UUID CORRESPONDANT");
							break;
						}
						
					}
				
				}
				if(used == false) {
					
					useKit(files.get(i).getName(), playerUUID);
					return true;
				}
				
				
			} catch (Exception e) {
		       e.printStackTrace();
			}
		}
		return false;
	}

	public static void useKit(String filename, String playerUUID) {
		
		//TODO XML FILE CHANGE
	}
	
	public static boolean onCheck(Player p,String kitname) {
		
		String kit = kitname;
		System.out.println(kit);
		int nbreKit = getListFiles(kit).size();
		if(nbreKit >= 1) {
			System.out.println("ACCESS TO LVL1 VERIFICATION");
			boolean access = checkUUID(p, kitname);
			if(access == true) {
				System.out.println("ACCESS TO LVL2 VERIFICATION");
				return true;
			}
			else {
				
				p.sendMessage("Kit Déjà utilisée");
			}
			
		}
		else {
		
			p.sendMessage("Aucune Kit acheté pour le moment.");
		}
		/* DEBUG */
			System.out.println(nbreKit);
			//System.out.println(access);
			System.out.println(kitname);
		/* DEBUG */
			
		return false;
	}
}
