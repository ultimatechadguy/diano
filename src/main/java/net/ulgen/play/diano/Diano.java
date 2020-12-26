package net.ulgen.play.diano;

import org.bukkit.plugin.java.JavaPlugin;

public final class Diano extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("DiaNo is Ready!");

        getServer().getPluginManager().registerEvents(new OnBreakBlock(), this);
    }

    @Override
    public void onDisable() {
        System.out.println("Disabling DiaNo");
    }
}