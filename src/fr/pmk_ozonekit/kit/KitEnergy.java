package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitEnergy implements ISubCommand{
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int solarPanel = 2680;
		int capacitorBank = 1495;
		int energyConduit = 5091;
		
		if(KitChecker.onCheck(sender, "energy") == true) {
			
			sender.sendMessage("Voici votre kit :");
			
			ItemGiver.giveItem(sender, solarPanel, 4);
			ItemGiver.giveItem(sender, capacitorBank, 4, 2);
			ItemGiver.giveItem(sender, energyConduit, 32);
			
		}
		
		return false;
		
	}
} 
