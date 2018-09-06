package fr.pmk_ozonekit.utils;

import org.bukkit.Server.*;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.entity.Player;

public class ItemGiver {

	public static boolean giveItem(Player playername,int item, int nombre) {
		
		String player = playername.getName();
		System.out.println(player);
		return playername.getServer().dispatchCommand(playername.getServer().getConsoleSender(), "give "+ player + " "+ item +" "+ nombre);
		
	}
	public static boolean giveItem(Player playername,int item, int nombre, int metadata) {
		
		String player = playername.getName();
		System.out.println(player);
		return playername.getServer().dispatchCommand(playername.getServer().getConsoleSender(), "give "+ player +" "+ item +" "+ nombre +" "+ metadata);
		
	}

}