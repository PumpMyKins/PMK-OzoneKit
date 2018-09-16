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

public class KitVegan implements ISubCommand{
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int harvestcraftMixedsaladItem = 6085; 
		int harvestcraftFruitsaladItem = 5850; 
		int NaturaBerryMedley = 4569; 
		int harvestcraftVeggiestirfryItem = 5908;
		int harvestcraftOldworldveggiesoupItem = 6141; 
		int harvestcraftVeggiestripsItem = 6343; 
		int harvestcraftRoastedrootveggiemedleyItem = 5958; 
		String kitname = "Vegan";
		if(KitChecker.onCheck(sender, "vegan") == true) {
			
			sender.sendMessage("Voici votre kit vegan :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, harvestcraftMixedsaladItem, 4, invKit);
			ItemGiver.giveItem(sender, harvestcraftFruitsaladItem, 2, invKit);
			ItemGiver.giveItem(sender, NaturaBerryMedley, 6, invKit);
			ItemGiver.giveItem(sender, harvestcraftVeggiestirfryItem, 3, invKit);
			ItemGiver.giveItem(sender, harvestcraftOldworldveggiesoupItem, 2, invKit);
			ItemGiver.giveItem(sender, harvestcraftVeggiestripsItem, 4, invKit);
			ItemGiver.giveItem(sender, harvestcraftRoastedrootveggiemedleyItem, 4, invKit);
			ItemGiver.giveItem(sender, 31, 32, 1, invKit);
			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
} 
