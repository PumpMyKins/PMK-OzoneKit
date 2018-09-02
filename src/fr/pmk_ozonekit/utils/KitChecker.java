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
	
	public int checkUUID(Player p, String kitname) {
		
		
		String playerUUID = p.getUniqueId().toString();
		int used = 0;
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
				
				for (int temp = 0;temp < nList.getLength(); temp++) {
					
					Node nNode = nList.item(temp);
					
					if(nNode.getNodeType() == Node.ELEMENT_NODE) {
						
						Element eElement = (Element) nNode;
						
						String tempUUID = eElement.getAttribute("id");
						
						if (tempUUID == playerUUID) {
							
							used++;
						}
					}
				}
			} catch (Exception e) {
		       e.printStackTrace();
			}
		}
		return used;
	}
	
	public boolean onCheck(String kitname) {
		
		String kit = kitname;
		
		boolean access = false;
		int nbreKit = getListFiles(kit).size();
		
		if(nbreKit < 1) {
			
			access = false;
		}
		else {
		
			
		}
		/* DEBUG */
			System.out.println(nbreKit);
			System.out.println(access);
			System.out.println(kitname);
		/* DEBUG */
			
		return true;
	}
}
