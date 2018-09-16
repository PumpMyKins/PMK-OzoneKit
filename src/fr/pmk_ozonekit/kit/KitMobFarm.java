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

public class KitMobFarm implements ISubCommand{
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int cursedEarth = 1623;
		int advancedItemCollector = 2576;
		int diamondSpike = 1626;
		int fan = 2404;
		String kitname = "MobFarm";
		if(KitChecker.onCheck(sender, "mobfarm") == true) {
			
			Inventory invKit = Bukkit.createInventory(null, 8, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			sender.sendMessage("Voici votre kit MobFarm :");
			ItemGiver.giveItem(sender, cursedEarth, 4, invKit);
			ItemGiver.giveItem(sender, advancedItemCollector, 1, invKit);
			ItemGiver.giveItem(sender, diamondSpike, 4, invKit);
			ItemGiver.giveItem(sender, fan, 4, invKit);
		
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
}
