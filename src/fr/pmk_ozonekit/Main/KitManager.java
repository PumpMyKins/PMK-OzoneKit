package fr.pmk_ozonekit.Main;

import fr.pmk_ozonekit.commands.kitCommandExecutor;
import fr.pmk_ozonekit.commands.KitBuy;
import fr.pmk_ozonekit.commands.KitDelete;
import fr.pmk_ozonekit.commands.KitHelpCommand;
import fr.pmk_ozonekit.commands.KitListCommand;
import fr.pmk_ozonekit.kit.*;

public class KitManager {
	
	public static KitManager init() {
		
		return new KitManager();
	}
	
	private kitCommandExecutor kitCmd;
	private KitBuy kitbuycmd;
	private KitDelete kitdeletecmd;
	
	public KitManager() {
		
		kitCmd = new kitCommandExecutor();
		kitbuycmd = new KitBuy();
		kitdeletecmd = new KitDelete();
		
		MainKit.getInstance().getCommand("kit").setExecutor(kitCmd);
		
		kitCmd.addSubCommand("help", new KitHelpCommand());
		kitCmd.addSubCommand("list", new KitListCommand());
		
		kitCmd.addSubCommand("mobfarm", new KitMobFarm());
		kitCmd.addSubCommand("energy", new KitEnergy());
		kitCmd.addSubCommand("botania", new KitBotania());
		
		kitCmd.addSubCommand("stockage", new KitStockage());
		kitCmd.addSubCommand("armure", new KitArmure());
		kitCmd.addSubCommand("outils", new KitOutils());
		
		kitCmd.addSubCommand("fastfood", new KitFastFood());
		kitCmd.addSubCommand("vegan", new KitVegan());
		kitCmd.addSubCommand("gratuit", new KitGratuit());




		MainKit.getInstance().getCommand("pmk-buy-kit").setExecutor(kitbuycmd);
		MainKit.getInstance().getCommand("pmk-delete-kit").setExecutor(kitdeletecmd);
	}

	public kitCommandExecutor getKitCmd() {
		return kitCmd;
	}

	public void setKitCmd(kitCommandExecutor kitCmd) {
		this.kitCmd = kitCmd;
	}
	public KitBuy getKitbuycmd() {
		return kitbuycmd;
	}

	public void setKitbuycmd(KitBuy kitbuycmd) {
		this.kitbuycmd = kitbuycmd;
	}

	public KitDelete getKitdeletecmd() {
		return kitdeletecmd;
	}

	public void setKitdeletecmd(KitDelete kitdeletecmd) {
		this.kitdeletecmd = kitdeletecmd;
	}
}
