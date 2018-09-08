package fr.pmk_ozonekit.commands;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.utils.KitChecker;

public class KitListCommand implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		
		sender.sendMessage("§6§l[§r§2PumpMyKit§6§l] §r§2§oListe des kits §r§6§l[§r§2PumpMyKit§6§l]");
		sender.sendMessage("§a /kit rangement ("+KitChecker.checkUUID(sender, "rangement", false)+")");
		sender.sendMessage("§a /kit armor ("+KitChecker.checkUUID(sender, "armor", false)+")");
		sender.sendMessage("§a /kit botania ("+KitChecker.checkUUID(sender, "botania", false)+")");
		sender.sendMessage("§a /kit builder ("+KitChecker.checkUUID(sender, "builder", false)+")");
		sender.sendMessage("§a /kit enchanteur ("+KitChecker.checkUUID(sender, "enchanteur", false)+")");
		sender.sendMessage("§a /kit energy ("+KitChecker.checkUUID(sender, "energy", false)+")");
		sender.sendMessage("§a /kit mobfarm ("+KitChecker.checkUUID(sender, "mobfarm", false)+")");
		sender.sendMessage("§a /kit questreward ("+KitChecker.checkUUID(sender, "questreward", false)+")");
		sender.sendMessage("§a /kit tinker ("+KitChecker.checkUUID(sender, "tinker", false)+")");
		sender.sendMessage("§a /kit xp ("+KitChecker.checkUUID(sender, "xp", false)+")");
		sender.sendMessage("§a /kit gratuit ("+KitChecker.checkUUID(sender, "gratuit", false)+")");
		
		return true;
	}

}
