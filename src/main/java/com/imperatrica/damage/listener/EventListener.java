package com.imperatrica.damage.listener;

import cn.nukkit.Player;
import cn.nukkit.entity.Entity;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.entity.EntityDamageByEntityEvent;
import com.imperatrica.damage.Main;

public class EventListener implements Listener {
    Main main;

    public EventListener(Main main) {
        this.main = main;

    }




    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent event) {


        if (event.getDamager() instanceof Player) {
            Entity entity = event.getEntity();
            Player damager = (Player) event.getDamager();
            String health = main.getConfig().getString("Message").replaceAll("%health%", String.valueOf(entity.getHealth()));


            damager.sendActionBar(health);

        }
    }
}