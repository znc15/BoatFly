package com.wenkrang.boatfly.command;

import com.wenkrang.boatfly.BoatFly;
import com.wenkrang.boatfly.Entity.plane;
import com.wenkrang.boatfly.lib.SpigotConsoleColors;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Boat;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.util.Vector;

import java.util.ArrayList;
import java.util.List;

import static com.wenkrang.boatfly.Data.MainData.IsShutDown;

public class bf implements CommandExecutor {
    /**
     * 向传入的CommandSender对象发送帮助信息
     *
     * @param sender CommandSender对象，用于发送消息
     */
    public static void gethelp(CommandSender sender) {
        sender.sendMessage("§7[!]  §4飞船 - BoatFly §7正在运行");
        sender.sendMessage(" §4| §7help  帮助列表");
        sender.sendMessage(" §4| §7getbook  获取配方");
        sender.sendMessage(" §4| §7作者:Wenkrang");
    }

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (strings.length == 0) {
            gethelp(commandSender);
        } else {
            if (true) { //Debug

                if (strings[0].equalsIgnoreCase("help")) {
                    gethelp(commandSender);
                }
                if (strings[0].equalsIgnoreCase("getbook")) {
                    if (commandSender instanceof Player) {
                        Player player = (Player) commandSender;
                        ItemStack itemStack0 = new ItemStack(Material.WRITABLE_BOOK);
                        ItemMeta itemMeta0 = itemStack0.getItemMeta();
                        itemMeta0.setDisplayName("§9§lBoatFly§r-飞船配方");
                        ArrayList<String> lore0 = new ArrayList<>();
                        lore0.add("§7这是关于飞船的配方，§7§m飞船可以让你上天");
                        lore0.add("§7里面似乎蕴含着强大的力量♂");
                        lore0.add("");
                        lore0.add("§6§l右键§6打开");
                        itemMeta0.setLore(lore0);
                        itemStack0.setItemMeta(itemMeta0);
                        player.getInventory().addItem(itemStack0);
                    }
                }


            } else {

                commandSender.sendMessage(SpigotConsoleColors.DARK_RED + "[-] " + SpigotConsoleColors.RESET + "阿巴阿巴");

            }


        }
        return true;
    }


}
