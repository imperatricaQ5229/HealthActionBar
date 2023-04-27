package com.imperatrica.damage;

import cn.nukkit.plugin.PluginBase;
import com.imperatrica.damage.listener.EventListener;

public class Main extends PluginBase {

    public void onEnable() {
        this.getLogger().info("§aEnabled");
        this.getServer().getPluginManager().registerEvents(new EventListener(this), this);
        this.saveDefaultConfig();

    }
        public void onDisable() {
        this.getLogger().info("§cDisabled");
    }
}
