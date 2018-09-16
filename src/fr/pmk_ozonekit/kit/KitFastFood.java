package fr.pmk_ozonekit.kit;

import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.utils.ItemGiver;
import fr.pmk_ozonekit.utils.KitChecker;
import net.md_5.bungee.api.ChatColor;

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
		String kitname = "FastFood";
		
		if(KitChecker.onCheck(sender, "fastfood") == true) {
			
			sender.sendMessage("Voici votre kit fastfood :");
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			ItemGiver.giveItem(sender, harvestcrafthotwingsItem, 4, invKit);
			ItemGiver.giveItem(sender, harvestcraftheartybreakfastItem, 1, invKit);
			ItemGiver.giveItem(sender, harvestcrafthamburgerItem, 2, invKit);
			ItemGiver.giveItem(sender, harvestcraftzombiejerkyItem, 8, invKit);
			ItemGiver.giveItem(sender, harvestcraftchickenparmasanItem, 3, invKit);
			ItemGiver.giveItem(sender, harvestcraftmcpamItem, 2, invKit);
			ItemGiver.giveItem(sender, harvestcraftturkeycookedItem, 2, invKit);
			
			sender.openInventory(invKit);
			
		}
		
		return false;
		
	}
} 
