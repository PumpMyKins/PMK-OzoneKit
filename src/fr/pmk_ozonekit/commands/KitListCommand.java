package fr.pmk_ozonekit.commands;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

import fr.pmk_ozonekit.utils.KitChecker;
import net.md_5.bungee.api.chat.ClickEvent;
import net.md_5.bungee.api.chat.ComponentBuilder;
import net.md_5.bungee.api.chat.HoverEvent;
import net.md_5.bungee.api.chat.TextComponent;

public class KitListCommand implements ISubCommand {

	@Override
	public boolean onSubCommand(Player sender, Command cmd, List<String> args) {
		
		
		sender.sendMessage("§6§l[§r§2PumpMyKit§6§l] §r§2§oListe des kits §r§6§l[§r§2PumpMyKit§6§l]");
		sender.sendMessage("");
		sender.sendMessage("§6§l[§r§2PumpMyKit§6§l] §r§4Entre parenthèse se trouve le nombre d'utilisation disponibles.");
		sender.sendMessage("");
		
		//SET TEXT COMPONENT
		
		TextComponent stockage = new TextComponent("§a /kit stockage ("+KitChecker.checkUUID(sender, "stockage", false)+")");
		TextComponent armure = new TextComponent("§a /kit armure ("+KitChecker.checkUUID(sender, "armure", false)+")");
		TextComponent botania = new TextComponent("§a /kit botania ("+KitChecker.checkUUID(sender, "botania", false)+")");
		TextComponent outils = new TextComponent("§a /kit Builder ("+KitChecker.checkUUID(sender, "Builder", false)+")");
		TextComponent energy = new TextComponent("§a /kit energy ("+KitChecker.checkUUID(sender, "energy", false)+")");
		TextComponent mobfarm = new TextComponent("§a /kit mobfarm ("+KitChecker.checkUUID(sender, "mobfarm", false)+")");
		TextComponent gratuit = new TextComponent("§a /kit gratuit ("+KitChecker.checkUUID(sender, "gratuit", false)+")");
		TextComponent vegan = new TextComponent("§a /kit vegan ("+KitChecker.checkUUID(sender, "vegan", false)+")");
		TextComponent fastfood = new TextComponent("§a /kit fastfood ("+KitChecker.checkUUID(sender, "fastfood", false)+")");


		
		
		//SET CLICK EVENT
		
		stockage.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit stockage"));
		armure.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit armure"));
		botania.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit botania"));
		outils.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit outils"));
		energy.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit energy"));
		mobfarm.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit mobfarm"));
		gratuit.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit gratuit"));
		vegan.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit vegan"));
		fastfood.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit fastfood"));


		
		//SET HOVER EVENT
		
		stockage.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit stockage").create()));
		armure.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit armure").create()));
		botania.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Botania").create()));
		outils.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit outils").create()));
		energy.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Energy").create()));
		mobfarm.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit MobFarm").create()));
		gratuit.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Gratuit").create()));
		vegan.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit vegan").create()));
		fastfood.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit fastfood").create()));


		sender.spigot().sendMessage(stockage);
		sender.spigot().sendMessage(armure);
		sender.spigot().sendMessage(botania);
		sender.spigot().sendMessage(outils);
		sender.spigot().sendMessage(energy);
		sender.spigot().sendMessage(mobfarm);
		sender.spigot().sendMessage(gratuit);
		sender.spigot().sendMessage(vegan);
		sender.spigot().sendMessage(fastfood);


		
		return true;
	}

}
