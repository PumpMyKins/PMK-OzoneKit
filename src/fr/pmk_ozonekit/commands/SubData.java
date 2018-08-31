package fr.pmk_ozonekit.commands;

import fr.pmk_ozonekit.commands.ISubCommand;

import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.entity.Player;

public class SubData {
	
	private String subCommand;
	private ISubCommand iSubCommand;
	
	public SubData(String s, String p, ISubCommand i) {
		
		this(s,i);
	}

	public SubData(String s, ISubCommand i) {
		
		this.subCommand = s;
		this.iSubCommand = i;
	}

	public boolean execute(Player sender, Command cmd, List<String> args) {
		
		return this.iSubCommand.onSubCommand(sender, cmd, args);
	}
	
	
	//GETTER AND SETTER
	
	//ISUBCOMMAND 
	public ISubCommand getSubCommandExecutor() {
		return iSubCommand;
	}
	public void setSubCommandExecutor(ISubCommand iSubCommand) {
		this.iSubCommand = iSubCommand;
	}
	//SUBCOMMAND
	public String getSubCommand() {
		return subCommand;
	}
	public void setSubCommand(String subCommand) {
		this.subCommand = subCommand;
	}
}
