package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitQuestReward implements ISubCommand{
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int lootChests = 7569;
		
		if(KitChecker.onCheck(sender, "questreward") == true) {
			
			sender.sendMessage("Voici votre kit :");
			ItemGiver.giveItem(sender, lootChests, 16);
		}
		
		return false;
		
	}
}
