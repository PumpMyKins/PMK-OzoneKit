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

public class KitStockage implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		String kitname = "stockage";
		
		if(KitChecker.onCheck(sender, "stockage") == true) {
			
			sender.sendMessage("Voici votre kit Stockage :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, 2099, 8, invKit);
			ItemGiver.giveItem(sender, 2097, 8, invKit);
			ItemGiver.giveItem(sender, 2103, 1, invKit);
			ItemGiver.giveItem(sender, 6789, 8,(byte) 3, invKit);
			ItemGiver.giveItem(sender, 6789, 8,(byte) 6, invKit);
			ItemGiver.giveItem(sender, 2248, 16, invKit);

			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
} 