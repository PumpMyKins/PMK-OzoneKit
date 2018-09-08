package fr.pmk_ozonekit.commands;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class KitHelpCommand implements ISubCommand {
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		sender.sendMessage("§6§l[§r§2PumpMyKit§6§l] §r§2§oListe des Commandes §r§6§l[§r§2PumpMyKit§6§l]");
		sender.sendMessage("§2 /kit list");
		
		return true;
	}
}
