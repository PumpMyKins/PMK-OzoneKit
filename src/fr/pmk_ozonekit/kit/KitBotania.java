package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitBotania implements ISubCommand{
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int manaPool = 585;
		int manaSpreader = 584;
		int velocityLens = 4345; //1
		int floralFertiliser = 4351;
		int daybloom = 583 ;
		int nightshade = 583;
		int overgrowthSeeds = 4442;
		int floatingPureDaisy = 630;
		
		if(KitChecker.onCheck(sender, "botania") == true) {
			
			sender.sendMessage("Voici votre kit Botania :");
			ItemGiver.giveItem(sender, manaPool, 1);
			ItemGiver.giveItem(sender, manaSpreader, 2);
			ItemGiver.giveItem(sender, velocityLens, 2, 1);
			ItemGiver.giveItem(sender, floralFertiliser, 64);
			/*ItemGiver.giveItem(sender, daybloom, );
			ItemGiver.giveItem(sender, nightshade, );*/
			ItemGiver.giveItem(sender, overgrowthSeeds, 8);
			ItemGiver.giveItem(sender, floatingPureDaisy, 2);
		}
		
		return false;
		
	}
	
}
