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

public class KitBotania implements ISubCommand{
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int manaPool = 585;
		int manaSpreader = 584;
		int velocityLens = 4345; //1
		int floralFertiliser = 4351;
		int blackerLotus = 4434; //1
		int overgrowthSeeds = 4442;
		String kitname ="Botania";
		
		if(KitChecker.onCheck(sender, "botania") == true) {
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			sender.sendMessage("Voici votre kit Botania :");
			ItemGiver.giveItem(sender, manaPool, 1, invKit);
			ItemGiver.giveItem(sender, manaSpreader, 2, invKit);
			ItemGiver.giveItem(sender, velocityLens, 2, 1, invKit);
			ItemGiver.giveItem(sender, floralFertiliser, 64, invKit);
			ItemGiver.giveItem(sender, blackerLotus, 16, 1, invKit);
			ItemGiver.giveItem(sender, overgrowthSeeds, 8, invKit);
		
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
	
}
