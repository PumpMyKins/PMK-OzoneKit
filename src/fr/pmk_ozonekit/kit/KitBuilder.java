package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitBuilder implements ISubCommand{

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		if(KitChecker.onCheck(sender, "builder") == true) {
			
			sender.sendMessage("Voici votre kit :");
		}
		
		return false;
		
	}
}
