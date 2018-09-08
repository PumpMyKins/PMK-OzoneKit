package fr.pmk_ozonekit.commands;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class KitListCommand implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		
		sender.sendMessage("§6§l[§r§2PumpMyKit§6§l] §r§2§oListe des kits §r§6§l[§r§2PumpMyKit§6§l]");
		sender.sendMessage("§a /kit help");
		sender.sendMessage("§a /kit list");
		sender.sendMessage("§a /kit rangement");
		sender.sendMessage("§a /kit armor");
		sender.sendMessage("§a /kit botania");
		sender.sendMessage("§a /kit builder");
		sender.sendMessage("§a /kit enchanteur");
		sender.sendMessage("§a /kit energy");
		sender.sendMessage("§a /kit mobfarm");
		sender.sendMessage("§a /kit questreward");
		sender.sendMessage("§a /kit tinker");
		sender.sendMessage("§a /kit xp");
		sender.sendMessage("§a /kit gratuit");
		
		return true;
	}

}
