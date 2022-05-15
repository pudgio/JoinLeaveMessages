package com.pudgio.dev.joinleavemessages;

import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.plugin.java.JavaPlugin;

import java.awt.*;

public final class JoinLeaveMessages extends JavaPlugin {

    @Override
    public void onEnable() {
        this.getConfig().options().copyDefaults();
        this.saveDefaultConfig();

        this.registerListeners();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    private void registerListeners() {
        this.getServer().getPluginManager().registerEvents(new PlayerListener(), this);
    }

}
