package xyz.gamars;

import org.bukkit.plugin.PluginLogger;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import xyz.gamars.listeners.PlayerDeathListener;

import java.util.logging.Logger;

public final class LifeLink extends JavaPlugin {

    public static final Logger LOGGER = PluginLogger.getLogger("Plugin1");
    private PluginManager pluginManager = getServer().getPluginManager();

    @Override
    public void onEnable() {
        // Plugin startup logic

        pluginManager.registerEvents(new PlayerDeathListener(), this);

        LOGGER.info("Hello World");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        LOGGER.info("Shutting down.");
    }
}
