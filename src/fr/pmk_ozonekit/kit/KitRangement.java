package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitRangement implements ISubCommand {
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int drawers = 2689;
		int diamondDrawerUpgrade = 7112;
		int compressedChest = 891;
		int enderChest = 3055;
		int enderTank = 3055; //4096
		int alchemicalBag = 6730;
		
		if(KitChecker.onCheck(sender, "rangement") == true) {
			
			sender.sendMessage("Voici votre kit Rangement :");
			ItemGiver.giveItem(sender, drawers, 16);
			ItemGiver.giveItem(sender, diamondDrawerUpgrade, 16, 5);
			ItemGiver.giveItem(sender, compressedChest, 4);
			ItemGiver.giveItem(sender, enderChest, 2);
			ItemGiver.giveItem(sender, enderTank, 2, 4096);
			ItemGiver.giveItem(sender, alchemicalBag, 2);
			
		}
		
		
		return false;
	}
}
