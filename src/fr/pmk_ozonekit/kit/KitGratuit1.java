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

public class KitGratuit1 implements ISubCommand{

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		String kitname = "Gratuit 1";
		
		if(KitChecker.onCheck(sender, "gratuit") == true) {
			
			Inventory invKit = Bukkit.createInventory(null, 18, ChatColor.RED + "" + ChatColor.BOLD + kitname);

			
			sender.sendMessage("Voici votre kit gratuit :");
			int xp = sender.getLevel();
			sender.setLevel(xp + 20);
			ItemGiver.giveItem(sender, 364, 16, invKit);
			
			sender.openInventory(invKit);
			
		}
		
		return false;
		
	}
}
