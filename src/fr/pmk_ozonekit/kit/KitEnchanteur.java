package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitEnchanteur implements ISubCommand{

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int disenchantementTable = 1433;
		int experienceObelisk = 1526;
		int typesettingTable = 920;
		int monocle = 4544; //2
		int printingPress = 921;
		int printingPressChase = 4540;
		int inkSac = 351;
		
		if(KitChecker.onCheck(sender, "enchantement") == true) {
			
			sender.sendMessage("Voici votre kit Enchanteur :");
			ItemGiver.giveItem(sender, disenchantementTable, 1);
			ItemGiver.giveItem(sender, experienceObelisk, 1);
			ItemGiver.giveItem(sender, typesettingTable, 1);
			ItemGiver.giveItem(sender, monocle, 1);
			ItemGiver.giveItem(sender, printingPress, 1);
			ItemGiver.giveItem(sender, printingPressChase, 1);
			ItemGiver.giveItem(sender, inkSac, 64);
			int xp = sender.getLevel();
			sender.setLevel(xp + 100);
			
		}
		
		return false;
		
	}
}
