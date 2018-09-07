package fr.pmk_ozonekit.kit;


import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitMobFarm implements ISubCommand{
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int cursedEarth = 1623;
		int advancedItemCollector = 2576;
		int diamondSpike = 1626;
		int fan = 2404;
		
		if(KitChecker.onCheck(sender, "mobfarm") == true) {
			
			sender.sendMessage("Voici votre kit :");
			ItemGiver.giveItem(sender, cursedEarth, 4);
			ItemGiver.giveItem(sender, advancedItemCollector, 1);
			ItemGiver.giveItem(sender, diamondSpike, 4);
			ItemGiver.giveItem(sender, fan, 4);
		}
		
		return false;
		
	}
}
