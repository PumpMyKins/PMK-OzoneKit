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
		String kitname = "Builder";
		
		if(KitChecker.onCheck(sender, "builder") == true) {
			
			Inventory invKit = Bukkit.createInventory(null, 18, ChatColor.RED + "" + ChatColor.BOLD + kitname);
			
			sender.sendMessage("Voici votre kit Builder :");
			ItemGiver.giveItem(sender, builderWand, 1, invKit);
			ItemGiver.giveItem(sender, carpenterBlock, 64, invKit);
			ItemGiver.giveItem(sender, carpenterBlock, 64, invKit);
			ItemGiver.giveItem(sender, carpenterBlock, 64, invKit);
			ItemGiver.giveItem(sender, carpenterBlock, 64, invKit);
			ItemGiver.giveItem(sender, carpenterWedge, 64, invKit);
			ItemGiver.giveItem(sender, carpenterWedge, 64, invKit);
			ItemGiver.giveItem(sender, carpenterWedge, 64, invKit);
			ItemGiver.giveItem(sender, carpenterWedge, 64, invKit);
			ItemGiver.giveItem(sender, carpenterHammer, 1, invKit);
			ItemGiver.giveItem(sender, carpenterChisel, 1, invKit);
			ItemGiver.giveItem(sender, stoneBricks, 64, invKit);
			ItemGiver.giveItem(sender, stoneBricks, 64, invKit);
			ItemGiver.giveItem(sender, stoneBricks, 64, invKit);
			ItemGiver.giveItem(sender, stoneBricks, 64, invKit);
			ItemGiver.giveItem(sender, quartzBlock, 64, invKit);
			ItemGiver.giveItem(sender, quartzBlock, 64, invKit);
		}
		
		return false;
		
	}
}
