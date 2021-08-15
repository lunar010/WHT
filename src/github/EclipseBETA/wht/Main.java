package github.EclipseBETA.wht;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import github.EclipseBETA.wht.commands.WBT;
import github.EclipseBETA.wht.commands.WHT;

public class Main extends JavaPlugin{
	
	@Override
	public void onEnable() {
		new WBT(this);
		new WHT(this);
		Bukkit.broadcastMessage("&aHello, World!");
	}
	
	@Override
	public void onDisable() {
		Bukkit.broadcastMessage("&cBye, World..");
	}
	
}
