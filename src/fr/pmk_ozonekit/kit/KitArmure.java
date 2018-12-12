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

public class KitArmure implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {

		String kitname = "armure";
		
		if(KitChecker.onCheck(sender, "armure") == true) {
			
			sender.sendMessage("Voici votre kit Armure :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, 4179, 1,(byte) 1, invKit);
			ItemGiver.giveItem(sender, 4164, 1, invKit);
			ItemGiver.giveItem(sender, 4506, 1, invKit);
			ItemGiver.giveItem(sender, 4507, 1, invKit);
			ItemGiver.giveItem(sender, 4508, 1, invKit);
			ItemGiver.giveItem(sender, 4509, 1, invKit);


			sender.openInventory(invKit);
		}
		
		return false;
		
	}
} 
