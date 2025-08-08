package me.rosariagx.ethernetCore.Listeners;

import me.rosariagx.ethernetCore.Main;
import net.kyori.adventure.text.Component;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayJoinEventListener implements Listener {

    private Main plugin;

    public PlayJoinEventListener(Main plugin) {
        this.plugin = plugin;
        plugin.getServer().getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    private void PlayerJoin(PlayerJoinEvent e) {
        Player player = e.getPlayer();

        player.sendMessage(Component.text("Welcome to The Official Ethernet Test Deployment!!"));
    }

}
