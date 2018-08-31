package fr.pmk_ozonekit.Main;

import fr.pmk_ozonekit.commands.kitCommandExecutor;
import fr.pmk_ozonekit.commands.KitHelpCommand;
import fr.pmk_ozonekit.commands.KitListCommand;
import fr.pmk_ozonekit.kit.*;

public class KitManager {
	
	private kitCommandExecutor kitCmd;
	
	public KitManager() {
		
		kitCmd = new kitCommandExecutor();
		
		MainKit.getInstance().getCommand("kit").setExecutor(kitCmd);
		
		kitCmd.addSubCommand("help", new KitHelpCommand());
		kitCmd.addSubCommand("list", new KitListCommand());
		
		kitCmd.addSubCommand("rangement", new KitRangement());
		kitCmd.addSubCommand("armor", new KitArmor());
		kitCmd.addSubCommand("botania", new KitBotania());
		
		kitCmd.addSubCommand("builder", new KitBuilder());
		kitCmd.addSubCommand("enchanteur", new KitEnchanteur());
		kitCmd.addSubCommand("energy", new KitEnergy());		

		kitCmd.addSubCommand("mobfarm", new KitMobFarm());
		kitCmd.addSubCommand("questreward", new KitQuestReward());
		kitCmd.addSubCommand("tinker", new KitTinker());
		
		
		kitCmd.addSubCommand("gratuit1", new KitGratuit1());
		kitCmd.addSubCommand("gratuit2", new KitGratuit2());

	}

	public kitCommandExecutor getKitCmd() {
		return kitCmd;
	}

	public void setKitCmd(kitCommandExecutor kitCmd) {
		this.kitCmd = kitCmd;
	}
}
