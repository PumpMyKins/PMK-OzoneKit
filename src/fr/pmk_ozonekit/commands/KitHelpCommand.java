package fr.pmk_ozonekit.commands;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class KitHelpCommand implements ISubCommand {
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		sender.sendMessage("*--*  /kit help pour plus d'info  *--*");
		return true;
	}
}