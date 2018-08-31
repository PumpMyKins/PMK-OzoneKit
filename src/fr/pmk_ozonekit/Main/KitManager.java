package fr.pmk_ozonekit.Main;

import fr.pmk_ozonekit.commands.ISubCommand;
import fr.pmk_ozonekit.commands.kitCommandExecutor;
import fr.pmk_ozonekit.commands.kitHelpCommand;
import fr.pmk_ozonekit.kit.KitRangement;

public class KitManager {
	
	private kitCommandExecutor kitCmd;
	
	public KitManager() {
		
		kitCmd = new kitCommandExecutor();
		
		MainKit.getInstance().getCommand("kit").setExecutor(kitCmd);
		
		kitCmd.addSubCommand("help", new kitHelpCommand());
		kitCmd.addSubCommand("rangement", new KitRangement());
	}
}
