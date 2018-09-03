package fr.pmk_ozonekit.Main;

import org.bukkit.plugin.java.JavaPlugin;

public class MainKit extends JavaPlugin{

	private static MainKit instance;
	
	public void onEnable() {
			
			instance = this;
			
			KitManager.init();
	}
	public void onDisable() {
			
			
	}
	
	public static MainKit getInstance() {
		return instance;
	}
}
