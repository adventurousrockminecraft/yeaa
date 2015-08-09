package io.github.adventurousrockminecraft.yeaa;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBucketEmptyEvent;

public class MainListener implements Listener{

	public MainListener(Main plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}

	
	@EventHandler
	public void onBucketEmpty(PlayerBucketEmptyEvent event) {
		Player player = event.getPlayer();
		Block blockClicked = event.getBlockClicked();
		
		if (blockClicked.getType() == Material.GRASS) {
			player.sendMessage("YEEEAAAAAAAA!!!!!!!");
		} else {
			return;
		}
		
		
	}
	
	
}
