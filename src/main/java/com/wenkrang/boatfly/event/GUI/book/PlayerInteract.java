package com.wenkrang.boatfly.event.GUI.book;

import com.wenkrang.boatfly.Entity.plane;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.bukkit.block.BlockFace.NORTH;


public class PlayerInteract implements Listener {
    public static boolean isBelow1_20_2() {
        String fullVersion = Bukkit.getServer().getVersion();
        Pattern pattern = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)");
        Matcher matcher = pattern.matcher(fullVersion);

        if (matcher.find()) {
            int majorVersion = Integer.parseInt(matcher.group(1));
            int minorVersion = Integer.parseInt(matcher.group(2));
            int patchVersion = Integer.parseInt(matcher.group(3));

            // 检查是否低于1.20.2
            return (majorVersion < 1 ||
                    (majorVersion == 1 && minorVersion < 20) ||
                    (majorVersion == 1 && minorVersion == 20 && patchVersion < 2));
        } else {
            // 如果无法解析版本号，则认为不是预期的格式，返回 true 表示可能低于1.20.2
            return true;
        }
    }

    public static Location getOffsetForFace(BlockFace face) {
        double dx = 0.0, dy = 0.0, dz = 0.0;
        switch (face) {
            case NORTH_WEST:
                dx = -0.5;
                dz = -0.5;
                break;
            case NORTH_EAST:
                dx = 0.5;
                dz = -0.5;
                break;
            case SOUTH_WEST:
                dx = -0.5;
                dz = 0.5;
                break;
            case SOUTH_EAST:
                dx = 0.5;
                dz = 0.5;
                break;
            // ... 其他斜向面的处理 ...
        }
        return new Location(null, dx, dy, dz); // 返回一个只有偏移量的Location对象
    }
    public static Location calculateParticleLocation(Location blockLocation, BlockFace face) {
        switch (face) {
            case NORTH:
                return blockLocation.clone().add(0.5, 0.5, 0);
            case SOUTH:
                return blockLocation.clone().add(0.5, 0.5, 1);
            case WEST:
                return blockLocation.clone().add(0, 0.5, 0.5);
            case EAST:
                return blockLocation.clone().add(1, 0.5, 0.5);
            case UP:
                return blockLocation.clone().add(0.5, 1, 0.5);
            case DOWN:
                return blockLocation.clone().add(0.5, 0, 0.5);
            default:
                // 对于其他斜向面，需要额外计算偏移量
                // 例如对于NORTH_EAST等方向，可以通过向量运算获得准确位置
                // 这里假设你已经有一个名为getOffsetForFace的函数完成这项工作
                return blockLocation.clone().add(getOffsetForFace(face));
        }
    }

    @EventHandler
    public static void OnPlayer (PlayerInteractEvent event) {
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
        if (event.getPlayer().getInventory().getItemInMainHand().equals(itemStack0)) {
            if (event.getAction().equals(Action.RIGHT_CLICK_AIR) || event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (Objects.equals(event.getHand(), EquipmentSlot.HAND)) {
                    Main.Show(event.getPlayer());
                }
            }
        }

        if (isBelow1_20_2()) {
            if (event.getAction().equals(Action.RIGHT_CLICK_BLOCK)) {
                if (event.getHand().equals(EquipmentSlot.HAND)) {
                    if (event.getPlayer().getInventory().getItemInMainHand().hasItemMeta() &&
                        event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("§9§l飞§r船")) {
                        Block clickedBlock = event.getClickedBlock();
                        Location location = calculateParticleLocation(clickedBlock.getLocation(), event.getBlockFace());
                        plane.getplane(location);
                        if (!event.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
                            event.getPlayer().getInventory().setItemInMainHand(null);
                        }
                        event.setCancelled(true);
                    }
                    if (event.getPlayer().getInventory().getItemInMainHand().hasItemMeta() &&
                            event.getPlayer().getInventory().getItemInMainHand().getItemMeta().getDisplayName().equalsIgnoreCase("§9§l货运§r飞船")) {
                        Block clickedBlock = event.getClickedBlock();
                        Location location = calculateParticleLocation(clickedBlock.getLocation(), event.getBlockFace());
                        plane.getplanelevetwo(location);
                        if (!event.getPlayer().getGameMode().equals(GameMode.CREATIVE)) {
                            event.getPlayer().getInventory().setItemInMainHand(null);
                        }
                        event.setCancelled(true);
                    }
                }
            }
        }
    }
}
