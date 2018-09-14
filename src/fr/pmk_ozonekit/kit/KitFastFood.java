package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;

public class KitFastFood implements ISubCommand{
	
	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int harvestcrafthotwingsItem = 5912;// x4
		int harvestcraftheartybreakfastItem = 5869;// x1
		int harvestcrafthamburgerItem = 5828; //x2
		int harvestcraftzombiejerkyItem = 5843; //x8
		int harvestcraftchickenparmasanItem = 5855;// x3(modifié)
		int harvestcraftmcpamItem = 6223; //x2
		int harvestcraftturkeycookedItem = 6288; //x2
		
		if(KitChecker.onCheck(sender, "fastfood") == true) {
			
			sender.sendMessage("Voici votre kit fastfood :");
			
			ItemGiver.giveItem(sender, harvestcrafthotwingsItem, 4);
			ItemGiver.giveItem(sender, harvestcraftheartybreakfastItem, 1);
			ItemGiver.giveItem(sender, harvestcrafthamburgerItem, 2);
			ItemGiver.giveItem(sender, harvestcraftzombiejerkyItem, 8);
			ItemGiver.giveItem(sender, harvestcraftchickenparmasanItem, 3);
			ItemGiver.giveItem(sender, harvestcraftmcpamItem, 2);
			ItemGiver.giveItem(sender, harvestcraftturkeycookedItem, 2);
			
		}
		
		return false;
		
	}
} 
