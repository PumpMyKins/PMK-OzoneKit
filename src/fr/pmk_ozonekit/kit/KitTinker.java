package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitTinker implements ISubCommand{

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int glowstoneIngot = 4909; //3
		int searedBricks = 1733; //2
		int smelteryDrain = 1733; //1
		int smelteryTank = 1735;
		int smelteryController = 1733;
		int searedFaucet =1737; //1
		
		if(KitChecker.onCheck(sender, "tinker") == true) {
			
			sender.sendMessage("Voici votre kit Tinker :");
			ItemGiver.giveItem(sender, glowstoneIngot, 16, 3);
			ItemGiver.giveItem(sender, searedBricks, 32, 2);
			ItemGiver.giveItem(sender, smelteryDrain, 4, 1);
			ItemGiver.giveItem(sender, smelteryTank, 1);
			ItemGiver.giveItem(sender, smelteryController, 1);
			ItemGiver.giveItem(sender, searedFaucet, 4, 1);
			
		}
		
		return false;
		
	}
}
