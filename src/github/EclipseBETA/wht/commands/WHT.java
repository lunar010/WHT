package github.EclipseBETA.wht.commands;

import github.EclipseBETA.wht.Main;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


public class WHT implements CommandExecutor{
	
	private Main plugin;
	
	public WHT(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("hello").setExecutor(this);
	}

	@Override
	public boolean onCommand(CommandSender executor, Command cmd, String label, String[] args)
	{
		if(!(executor instanceof Player)) { 
			return true; 
		} else if (cmd.getName().equalsIgnoreCase("hello")){ 
			executor.sendMessage("&aWhy hello there?"); 
		}
		return false;
	}
	
}
