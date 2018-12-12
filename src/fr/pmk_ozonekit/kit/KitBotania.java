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

public class KitBotania implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		String kitname = "botania";
		
		if(KitChecker.onCheck(sender, "botania") == true) {
			
			sender.sendMessage("Voici votre kit Botania :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, 4662, 1, invKit);
			ItemGiver.giveItem(sender, 4599, 1, invKit);
			ItemGiver.giveItem(sender, 575, 1, invKit);
			ItemGiver.giveItem(sender, 574, 1, invKit);
			ItemGiver.giveItem(sender, 4685, 6,(byte) 1, invKit);
			ItemGiver.giveItem(sender, 4701, 1, invKit);
			ItemGiver.giveItem(sender, 4693, 4, invKit);

			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
} 
