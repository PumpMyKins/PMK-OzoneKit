package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

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
		
		if(KitChecker.onCheck(sender, "vegan") == true) {
			
			sender.sendMessage("Voici votre kit vegan :");
			
			ItemGiver.giveItem(sender, harvestcraftMixedsaladItem, 4);
			ItemGiver.giveItem(sender, harvestcraftFruitsaladItem, 2);
			ItemGiver.giveItem(sender, NaturaBerryMedley, 6);
			ItemGiver.giveItem(sender, harvestcraftVeggiestirfryItem, 3);
			ItemGiver.giveItem(sender, harvestcraftOldworldveggiesoupItem, 2);
			ItemGiver.giveItem(sender, harvestcraftVeggiestripsItem, 4);
			ItemGiver.giveItem(sender, harvestcraftRoastedrootveggiemedleyItem, 4);
			
			
		}
		
		return false;
		
	}
} 
