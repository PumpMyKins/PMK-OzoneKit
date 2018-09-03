package fr.pmk_ozonekit.utils;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

import org.bukkit.entity.Player;


public class KitChecker {
	
	public ArrayList<File> getListFiles(String path) {

		File f = new File(path);
		
		ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
		return files;
	}
	
	public boolean checkUUID(Player p, String kitname) {
		
		
		String playerUUID = p.getUniqueId().toString();
		int use = 0;
		ArrayList<File> files = getListFiles(kitname);
		for(int i = 0;i < files.size(); i++) {
	
			try {
				
				File fXmlFile = new File(files.get(i).getName());
				DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
				Document kitx = dBuilder.parse(fXmlFile);
				
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

	public void useKit(String filename, String playerUUID) {
		
		
	}
	
	public boolean onCheck(Player p,String kitname) {
		
		String kit = kitname;
		
		int nbreKit = getListFiles(kit).size();
		if(nbreKit >= 1) {
			boolean access = checkUUID(p, kitname);
			
		}
		else {
		
			
		}
		/* DEBUG */
			System.out.println(nbreKit);
			//System.out.println(access);
			System.out.println(kitname);
		/* DEBUG */
			
		return true;
	}
}
