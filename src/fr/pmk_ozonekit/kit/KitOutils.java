package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;
import net.md_5.bungee.api.ChatColor;

public class KitOutils implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {

		String kitname = "outils";
		
		if(KitChecker.onCheck(sender, "outils") == true) {
			
			sender.sendMessage("Voici votre kit Outils :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, 5605, 1, invKit);
			ItemGiver.giveItem(sender, 5603, 1, invKit);
			ItemGiver.giveItem(sender, 352, 64, invKit);
			ItemGiver.giveItem(sender, 352, 64, invKit);
			ItemGiver.giveItem(sender, 352, 64, invKit);
			ItemGiver.giveItem(sender, 352, 64, invKit);
			ItemGiver.giveItem(sender, 352, 64, invKit);
			ItemGiver.giveItem(sender, 352, 64, invKit);
			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
} 
