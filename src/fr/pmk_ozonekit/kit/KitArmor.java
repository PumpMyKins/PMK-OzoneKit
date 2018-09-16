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

public class KitArmor implements ISubCommand{

	
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
			
	int darkHelm = 5122;
	int darkPlate = 5123;
	int darkLeggings = 5124;
	int darkSteelBoots = 5125;
	String kitname ="Armure";
	
		if(KitChecker.onCheck(sender, "armor") == true) {
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			sender.sendMessage("Voici votre kit Armor :");
			
			ItemGiver.giveItem(sender, darkHelm, 1, invKit);
			ItemGiver.giveItem(sender, darkPlate, 1, invKit);
			ItemGiver.giveItem(sender, darkLeggings, 1, invKit);
			ItemGiver.giveItem(sender, darkSteelBoots, 1, invKit);
		
			sender.openInventory(invKit);
		}
	
		return false;
	}
	
}
