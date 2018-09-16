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

public class KitRangement implements ISubCommand {
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int drawers = 2689;
		int diamondDrawerUpgrade = 7112;
		int compressedChest = 891;
		int enderChest = 3055;
		int enderTank = 3055; //4096
		int alchemicalBag = 6730;
		String kitname ="Rangement";
		
		if(KitChecker.onCheck(sender, "rangement") == true) {
			
			Inventory invKit = Bukkit.createInventory(null, 8, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			sender.sendMessage("Voici votre kit Rangement :");
			ItemGiver.giveItem(sender, drawers, 16, invKit);
			ItemGiver.giveItem(sender, diamondDrawerUpgrade, 16, 5, invKit);
			ItemGiver.giveItem(sender, compressedChest, 4, invKit);
			ItemGiver.giveItem(sender, enderChest, 2, invKit);
			ItemGiver.giveItem(sender, enderTank, 2, 4096, invKit);
			ItemGiver.giveItem(sender, alchemicalBag, 2, invKit);
			
			sender.openInventory(invKit);
			
		}
		
		
		return false;
	}
}
