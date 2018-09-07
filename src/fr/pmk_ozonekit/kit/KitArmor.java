package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitArmor implements ISubCommand{

	
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
			
	int darkHelm = 5122;
	int darkPlate = 5123;
	int darkLeggings = 5124;
	int darkSteelBoots = 5125;
	
		if(KitChecker.onCheck(sender, "armor") == true) {
			
			sender.sendMessage("Voici votre kit Armor :");
			
			ItemGiver.giveItem(sender, darkHelm, 1);
			ItemGiver.giveItem(sender, darkPlate, 1);
			ItemGiver.giveItem(sender, darkLeggings, 1);
			ItemGiver.giveItem(sender, darkSteelBoots, 1);
		}
	
		return false;
	}
	
}
