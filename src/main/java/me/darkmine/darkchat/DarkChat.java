package me.darkmine.darkchat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class DarkChat extends JavaPlugin {

    private static DarkChat instance;

    @Override
    public void onEnable() {

        instance = this;

        saveDefaultConfig();

        Bukkit.getConsoleSender().sendMessage("§8==============================");
        Bukkit.getConsoleSender().sendMessage("§aDarkChat §7успешно загружен!");
        Bukkit.getConsoleSender().sendMessage("§7Версия: §f1.0");
        Bukkit.getConsoleSender().sendMessage("§7Автор: §bSergey");
        Bukkit.getConsoleSender().sendMessage("§8==============================");

        // Здесь позже зарегистрируем команды и события

    }

    @Override
    public void onDisable() {

        Bukkit.getConsoleSender().sendMessage("§cDarkChat выключен.");

    }

    public static DarkChat getInstance() {
        return instance;
    }

}
