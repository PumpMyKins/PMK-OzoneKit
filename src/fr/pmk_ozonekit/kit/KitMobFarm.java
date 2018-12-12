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

public class KitMobFarm implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		
		String kitname = "mobfarm";
		
		if(KitChecker.onCheck(sender, "mobfarm") == true) {
			
			sender.sendMessage("Voici votre kit MobFarm :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, 1534, 8, invKit);
			ItemGiver.giveItem(sender, 1791, 8, invKit);
			ItemGiver.giveItem(sender, 1538, 4, invKit);
			ItemGiver.giveItem(sender, 1787, 2, invKit);
			ItemGiver.giveItem(sender, 1535, 1, invKit);
			ItemGiver.giveItem(sender, 5457, 16, invKit);

			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
} 
