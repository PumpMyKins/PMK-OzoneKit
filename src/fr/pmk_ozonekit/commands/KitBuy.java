package fr.pmk_ozonekit.commands;


import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Node;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class KitBuy implements CommandExecutor{

	public boolean onCommand(CommandSender sender, Command cmd, String label,  String[] args) {
			
		if(sender instanceof ConsoleCommandSender) {
			
			String kitname = args[0];
			String transaction = args[1];
			String buyeruuid = args[2];
			String multi = args[3];
			String newFileName = "plugins/kit/"+kitname+"/"+transaction+".xml";
			try {
				
				DocumentBuilderFactory kitFactory = DocumentBuilderFactory.newInstance();
				DocumentBuilder kitBuilder = kitFactory.newDocumentBuilder();
				
				Document kit = kitBuilder.newDocument();
				Element rootElement = kit.createElement("kit");
				kit.appendChild(rootElement);
				if(multi == "false") {
					
					Node buyername = kit.getFirstChild();
					Element buyerElement = kit.createElement("buyer");
					buyerElement.setAttribute("uuid", buyeruuid);
					buyername.appendChild(buyerElement);
				}
				TransformerFactory transformerFactory = TransformerFactory.newInstance();
				Transformer transformer = transformerFactory.newTransformer();
				DOMSource source = new DOMSource(kit);
				StreamResult result = new StreamResult(new File(newFileName));
				
				transformer.transform(source, result);
				
				System.out.println("File SAVED!");
				
			} catch (ParserConfigurationException pce) {
				pce.printStackTrace();
			
			} catch (TransformerException tfe) {
				tfe.printStackTrace();
			
			}
			
			if(multi == "true") {
				Bukkit.broadcastMessage("ß6ßl[ßrß2PumpMyKitß6ßl]ßr");
				Bukkit.broadcastMessage("ß6ßl[ßrß2PumpMyKitß6ßl]ßrß2 Un kit ßrß4ßl"+kitname+"ßrß2 a √©t√© achet√© !! Faites /kit!!");
				Bukkit.broadcastMessage("ß6ßl[ßrß2PumpMyKitß6ßl]ßrß2 Un kit ßrß4ßl"+kitname+"ßrß2 a √©t√© achet√© !! Faites /kit!!");
				Bukkit.broadcastMessage("ß6ßl[ßrß2PumpMyKitß6ßl]ßrß4ßl ATTENTION UNE FOIS L'INVENTAIRE FERMER VOUS NE POURREZ PAS LE REOUVRIR !");
				Bukkit.broadcastMessage("ß6ßl[ßrß2PumpMyKitß6ßl]ßr");
			}
		}
		return false;
	}	
}
