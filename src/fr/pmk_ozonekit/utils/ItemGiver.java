package fr.pmk_ozonekit.utils;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class ItemGiver {

	@SuppressWarnings("deprecation")
	public static boolean giveItem(Player playername,int item, int nombre, Inventory inv) {
		
		ItemStack itemToGive = new ItemStack(Material.getMaterial(item), nombre,(short)0,(byte)0);
	    invSetter(itemToGive, inv);
		return true;
	}
	@SuppressWarnings("deprecation")
	public static boolean giveItem(Player playername,int item, int nombre, int metadata, Inventory inv) {
		
		ItemStack itemToGive = new ItemStack(Material.getMaterial(item), nombre,(short)0,(byte)metadata);
		invSetter(itemToGive, inv);
		return true;
	}
	public static boolean invSetter(ItemStack item, Inventory inv) {
		
		inv.setItem(inv.firstEmpty() ,item);
		
		return true;
	}

}