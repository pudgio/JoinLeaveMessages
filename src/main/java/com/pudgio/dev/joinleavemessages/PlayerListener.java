package com.pudgio.dev.joinleavemessages;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerBedLeaveEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

import static net.md_5.bungee.api.ChatColor.DARK_RED;

public class PlayerListener implements Listener {

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(DARK_RED + event.getPlayer().getName() + " has entered the Underworld");
    }

    @EventHandler
    public void PlayerQuitEvent(PlayerQuitEvent event) {
        event.setQuitMessage(DARK_RED + event.getPlayer().getName() + " has left the Underworld");
    }
}
