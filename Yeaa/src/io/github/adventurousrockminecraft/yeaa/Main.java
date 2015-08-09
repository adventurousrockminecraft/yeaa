package io.github.adventurousrockminecraft.yeaa;

import java.util.logging.Logger;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	public void onEnable() {
		new MainListener(this);
		Logger.getLogger("Yeaa! is starting!");
	}
	
	public void onDisable() {
		Logger.getLogger("Yeaa! is turning off!");
	}
	
	
}
