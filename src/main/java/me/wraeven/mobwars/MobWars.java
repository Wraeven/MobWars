package me.wraeven.mobwars;

import org.bukkit.plugin.java.JavaPlugin;

public final class MobWars extends JavaPlugin {
    private static MobWars instance;
    @Override
    public void onEnable() {
        // Plugin startup logic
        instance = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        instance = null;
    }
    public static MobWars getInstance() {return instance;}
}
