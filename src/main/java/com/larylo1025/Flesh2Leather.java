package com.larylo1025;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.FurnaceRecipe;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

public class Flesh2Leather extends JavaPlugin {
    @Override
    public void onEnable() {
        Bukkit.addRecipe(new FurnaceRecipe(new NamespacedKey(this, "leather"),
                new ItemStack(Material.LEATHER), Material.ROTTEN_FLESH,
                1.0f, 200));
    }
}
