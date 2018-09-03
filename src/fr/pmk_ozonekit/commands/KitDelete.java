package fr.pmk_ozonekit.commands;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;

public class KitDelete implements CommandExecutor {
	
	public boolean onCommand(CommandSender sender, Command cmd, String label,  String[] args) {
		
		if(sender instanceof ConsoleCommandSender) {
			
			String kitname = args[0];
			String transaction = args[1];
			String filename = "plugins/kit/"+kitname+"/"+transaction+".xml";
			Path cible = Paths.get(filename);
			
			try {
				
				Files.delete(cible);
				System.out.println("File Deleted Successfully");
			} catch (NoSuchFileException x) {
			    System.err.format("%s: no such" + " file or directory%n", cible);
			} catch (DirectoryNotEmptyException x) {
			    System.err.format("%s not empty%n", cible);
			} catch (IOException x) {
			    // File permission problems are caught here.
			    System.err.println(x);
			}
		}

		return true;
	}
}
