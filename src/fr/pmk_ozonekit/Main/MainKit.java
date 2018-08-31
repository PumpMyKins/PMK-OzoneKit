package fr.pmk_ozonekit.Main;

import fr.pmk_ozonekit.commands.KitHelpCommand;
import org.bukkit.command.*;
import org.bukkit.plugin.java.JavaPlugin;

public class MainKit extends JavaPlugin{

	private static MainKit instance;
	
	public void onEnable() {
			
			instance = this;
	}
	public void onDisable() {
			
			
	}
	
	public static MainKit getInstance() {
		return instance;
	}
}
