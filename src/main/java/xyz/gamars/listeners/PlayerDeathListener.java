package xyz.gamars.listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {

/*    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (player != event.getEntity()) {
                player.damage(9001);
            }
        }
    }*/

    @EventHandler
    public void deathCheck(EntityDamageEvent event) {
        if (event.getEntity() instanceof Player) {
            Player player = ((Player) event.getEntity()).getPlayer();
            if (event.getDamage() >= player.getHealth()) {
                for (Player onlinePlayers : Bukkit.getOnlinePlayers()) {
                    onlinePlayers.setHealth(0.0);
                }
                Bukkit.getServer().broadcastMessage(ChatColor.AQUA + player.getDisplayName() + " died and ruined it for everyone else...");
            }
        }
    }

    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        event.setDeathMessage("");
    }



}
