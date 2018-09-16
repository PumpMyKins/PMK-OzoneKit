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
		String kitname = "Enchanteur";
		if(KitChecker.onCheck(sender, "enchanteur") == true) {
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			sender.sendMessage("Voici votre kit Enchanteur :");
			ItemGiver.giveItem(sender, disenchantementTable, 1, invKit);
			ItemGiver.giveItem(sender, experienceObelisk, 1, invKit);
			ItemGiver.giveItem(sender, typesettingTable, 1, invKit);
			ItemGiver.giveItem(sender, monocle, 1, invKit);
			ItemGiver.giveItem(sender, printingPress, 1, invKit);
			ItemGiver.giveItem(sender, printingPressChase, 1, invKit);
			ItemGiver.giveItem(sender, inkSac, 64, invKit);
			int xp = sender.getLevel();
			sender.setLevel(xp + 100);
			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
}
