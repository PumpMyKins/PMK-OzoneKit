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

public class KitEnergy implements ISubCommand{
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int solarPanel = 228;
		int energyConduit = 5455;
		String kitname = "energy";
		
		if(KitChecker.onCheck(sender, "energy") == true) {
			
			sender.sendMessage("Voici votre kit Energy :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, solarPanel, 4, invKit);
			ItemGiver.giveItem(sender, energyConduit, 16,(byte) 1, invKit);
			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
} 
