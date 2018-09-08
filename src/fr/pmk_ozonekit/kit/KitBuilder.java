package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitBuilder implements ISubCommand{

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int builderWand = 5199;
		int carpenterBlock = 1315;
		int carpenterWedge = 1330;
		int carpenterHammer = 4842;
		int carpenterChisel = 4843;
		int stoneBricks = 98;
		int quartzBlock =155;
		
		if(KitChecker.onCheck(sender, "builder") == true) {
			
			sender.sendMessage("Voici votre kit Builder :");
			ItemGiver.giveItem(sender, builderWand, 1);
			ItemGiver.giveItem(sender, carpenterBlock, 256);
			ItemGiver.giveItem(sender, carpenterBlock, 256);
			ItemGiver.giveItem(sender, carpenterBlock, 256);
			ItemGiver.giveItem(sender, carpenterBlock, 256);
			ItemGiver.giveItem(sender, carpenterWedge, 256);
			ItemGiver.giveItem(sender, carpenterWedge, 256);
			ItemGiver.giveItem(sender, carpenterWedge, 256);
			ItemGiver.giveItem(sender, carpenterWedge, 256);
			ItemGiver.giveItem(sender, carpenterHammer, 1);
			ItemGiver.giveItem(sender, carpenterChisel, 1);
			ItemGiver.giveItem(sender, stoneBricks, 256);
			ItemGiver.giveItem(sender, stoneBricks, 256);
			ItemGiver.giveItem(sender, stoneBricks, 256);
			ItemGiver.giveItem(sender, stoneBricks, 256);
			ItemGiver.giveItem(sender, quartzBlock, 128);
			ItemGiver.giveItem(sender, quartzBlock, 128);
		}
		
		return false;
		
	}
}
