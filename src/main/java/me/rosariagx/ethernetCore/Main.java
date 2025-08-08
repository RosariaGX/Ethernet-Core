package me.rosariagx.ethernetCore;

import me.rosariagx.ethernetCore.Listeners.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {

        new PlayJoinEventListener(this);
    }

    @Override
    public void onDisable() {

    }
}
