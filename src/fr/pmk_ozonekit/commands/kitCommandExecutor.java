package fr.pmk_ozonekit.commands;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class kitCommandExecutor implements CommandExecutor {
	

	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			
			Player p = (Player) sender;
			
			if(args.length < 1) {
				
				System.out.println("NoSubCommand");
				
				sender.sendMessage("$2Faites : $r$4$n/kit help");
				
			}else {
				
				String sub = args[0];
				
				System.out.println("SubCommand trouve "+ sub);
				for(SubData s : this.subCommandList) {
					
					String subCmd = s.getSubCommand();
					
					if(sub.equals(subCmd)) {
						
						System.out.println("Execute : " + s.getSubCommandExecutor().getClass().getName());
						return s.execute(p, cmd, getArgs(args));
					}
				}
				
				
			}
		}
		return true;
	}
	public kitCommandExecutor() {
		
		this.subCommandList = new ArrayList<>();
		
	}
	
	private List<SubData> subCommandList;
	
	public void addSubCommand(String sub, ISubCommand i) {
		
		this.subCommandList.add(new SubData(sub, i));
	
	}
	
	public List<SubData> getSubCommandList() {
		
		return subCommandList;
		
	}
	
	private static List<String> getArgs(String[] a) {
		
		List<String> l = new ArrayList<>();
		
		for (int i = 1; i < a.length; i++) {
			
			l.add(a[i]);
			
		}
		
		return l;
		
	}
	
}
