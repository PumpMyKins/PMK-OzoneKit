package fr.pmk_ozonekit.utils;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.bukkit.entity.Player;
import org.bukkit.entity.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class KitChecker {
	
	public List<File> getListFiles(String path) {

		File f = new File(path);
		
		ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
		return files;
		
	}
	public int checkUUID(Player p) {
		
		
		String playerUUID = p.getUniqueId().toString();
		
		
		return 0;
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
		
		return true;
	}
}
