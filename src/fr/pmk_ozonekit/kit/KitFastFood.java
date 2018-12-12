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

public class KitFastFood implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {

		String kitname = "fastfood";
		
		if(KitChecker.onCheck(sender, "fastfood") == true) {
			
			sender.sendMessage("Voici votre kit fastfood :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, 6177, 16, invKit);
			ItemGiver.giveItem(sender, 6442, 16, invKit);
			ItemGiver.giveItem(sender, 6160, 16, invKit);
			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
} 
