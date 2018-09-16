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

public class KitTinker implements ISubCommand{

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		int glowstoneIngot = 4909; //3
		int searedBricks = 1733; //2
		int smelteryDrain = 1733; //1
		int smelteryTank = 1735;
		int smelteryController = 1733;
		int searedFaucet =1737; //1
		String kitname ="Kit Tinker";
		if(KitChecker.onCheck(sender, "tinker") == true) {
			
			Inventory invKit = Bukkit.createInventory(null, 9, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			sender.sendMessage("Voici votre kit Tinker :");
			ItemGiver.giveItem(sender, glowstoneIngot, 16, 3, invKit);
			ItemGiver.giveItem(sender, searedBricks, 32, 2, invKit);
			ItemGiver.giveItem(sender, smelteryDrain, 4, 1, invKit);
			ItemGiver.giveItem(sender, smelteryTank, 1, invKit);
			ItemGiver.giveItem(sender, smelteryController, 1, invKit);
			ItemGiver.giveItem(sender, searedFaucet, 4, 1, invKit);
			
			sender.openInventory(invKit);
		}
		
		return false;
		
	}
}
