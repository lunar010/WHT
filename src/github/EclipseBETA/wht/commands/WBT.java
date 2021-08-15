package github.EclipseBETA.wht.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import github.EclipseBETA.wht.Main;

public class WBT implements CommandExecutor{
	
	public Main plugin;
	public WBT(Main plugin) {
		this.plugin = plugin;
		plugin.getCommand("bye").setExecutor(this);
	}
	
	@Override
	public boolean onCommand(CommandSender executor, Command cmd, String label, String[] args) {
		if(!(executor instanceof Player)) { 
			return true; 
		} else if (cmd.getName().equalsIgnoreCase("bye")){ 
			executor.sendMessage("&cWhy bye there?"); 
		}
		return false;
	}

}
