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
		
		TextComponent rangement = new TextComponent("§a /kit rangement ("+KitChecker.checkUUID(sender, "rangement", false)+")");
		TextComponent armor = new TextComponent("§a /kit armor ("+KitChecker.checkUUID(sender, "armor", false)+")");
		TextComponent botania = new TextComponent("§a /kit botania ("+KitChecker.checkUUID(sender, "botania", false)+")");
		TextComponent builder = new TextComponent("§a /kit builder ("+KitChecker.checkUUID(sender, "builder", false)+")");
		TextComponent enchanteur = new TextComponent("§a /kit enchanteur ("+KitChecker.checkUUID(sender, "enchanteur", false)+")");
		TextComponent energy = new TextComponent("§a /kit energy ("+KitChecker.checkUUID(sender, "energy", false)+")");
		TextComponent mobfarm = new TextComponent("§a /kit mobfarm ("+KitChecker.checkUUID(sender, "mobfarm", false)+")");
		TextComponent questreward = new TextComponent("§a /kit questreward ("+KitChecker.checkUUID(sender, "questreward", false)+")");
		TextComponent tinker = new TextComponent("§a /kit tinker ("+KitChecker.checkUUID(sender, "tinker", false)+")");
		TextComponent xp = new TextComponent("§a /kit xp ("+KitChecker.checkUUID(sender, "xp", false)+")");
		TextComponent gratuit = new TextComponent("§a /kit gratuit ("+KitChecker.checkUUID(sender, "gratuit", false)+")");
		TextComponent vegan = new TextComponent("§a /kit vegan ("+KitChecker.checkUUID(sender, "vegan", false)+")");
		TextComponent fastfood = new TextComponent("§a /kit fastfood ("+KitChecker.checkUUID(sender, "fastfood", false)+")");


		
		
		//SET CLICK EVENT
		
		rangement.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit rangement"));
		armor.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit armor"));
		botania.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit botania"));
		builder.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit builder"));
		enchanteur.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit enchanteur"));
		energy.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit energy"));
		mobfarm.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit mobfarm"));
		questreward.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit questreward"));
		tinker.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit tinker"));
		xp.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit xp"));
		gratuit.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit gratuit"));
		vegan.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit vegan"));
		fastfood.setClickEvent(new ClickEvent(ClickEvent.Action.RUN_COMMAND, "/kit fastfood"));


		
		//SET HOVER EVENT
		
		rangement.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Rangement").create()));
		armor.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Armor").create()));
		botania.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Botania").create()));
		builder.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Builder").create()));
		enchanteur.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Enchanteur").create()));
		energy.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Energy").create()));
		mobfarm.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit MobFarm").create()));
		questreward.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit QuestReward").create()));
		tinker.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Tinker").create()));
		xp.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Xp").create()));
		gratuit.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit Gratuit").create()));
		vegan.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit vegan").create()));
		fastfood.setHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, new ComponentBuilder("§4 Prendre le kit fastfood").create()));


		sender.spigot().sendMessage(rangement);
		sender.spigot().sendMessage(armor);
		sender.spigot().sendMessage(botania);
		sender.spigot().sendMessage(builder);
		sender.spigot().sendMessage(enchanteur);
		sender.spigot().sendMessage(energy);
		sender.spigot().sendMessage(mobfarm);
		sender.spigot().sendMessage(questreward);
		sender.spigot().sendMessage(tinker);
		sender.spigot().sendMessage(xp);
		sender.spigot().sendMessage(gratuit);
		sender.spigot().sendMessage(vegan);
		sender.spigot().sendMessage(fastfood);


		
		return true;
	}

}
