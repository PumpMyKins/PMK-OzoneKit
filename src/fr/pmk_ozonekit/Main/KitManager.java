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
		
		kitCmd.addSubCommand("rangement", new KitRangement());
		kitCmd.addSubCommand("armor", new KitArmor());
		kitCmd.addSubCommand("botania", new KitBotania());
		
		kitCmd.addSubCommand("builder", new KitBuilder());
		kitCmd.addSubCommand("enchanteur", new KitEnchanteur());
		kitCmd.addSubCommand("energy", new KitEnergy());		

		kitCmd.addSubCommand("mobfarm", new KitMobFarm());
		kitCmd.addSubCommand("questreward", new KitQuestReward());
		kitCmd.addSubCommand("tinker", new KitTinker());
		
		kitCmd.addSubCommand("xp", new KitXp());
		
		kitCmd.addSubCommand("gratuit", new KitGratuit1());
		kitCmd.addSubCommand("gratuit2", new KitGratuit2());
		
		kitCmd.addSubCommand("vegan", new KitVegan());
		kitCmd.addSubCommand("fastfood", new KitFastFood());


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
