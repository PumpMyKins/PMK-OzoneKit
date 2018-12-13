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

public class KitGratuit implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		String kitname = "gratuit";
		
		if(KitChecker.onCheck(sender, "gratuit") == true) {
			
			sender.sendMessage("Voici votre kit gratuit :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, 364, 6, invKit);
			ItemGiver.giveItem(sender, 351, 12,(byte) 15, invKit);
			ItemGiver.giveItem(sender, 50, 8, invKit);
			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
} 
