package com.wenkrang.boatfly.event.GUI.book;

import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class Click implements Listener {
    @EventHandler
    public static void OnPlayer (InventoryClickEvent event) {
        if (event.getView().getTitle().equalsIgnoreCase("飞船配方主页")) {

            if (event.getRawSlot() == 9) {
                Inventory inventory = Bukkit.createInventory(null, 27, "飞船配方-飞船");
                ItemStack itemStack0 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
                ItemMeta itemMeta0 = itemStack0.getItemMeta();
                itemMeta0.setDisplayName(" ");
                itemStack0.setItemMeta(itemMeta0);
                ItemStack itemStack1 = new ItemStack(Material.OAK_SIGN);
                ItemMeta itemMeta1 = itemStack1.getItemMeta();
                itemMeta1.setDisplayName("§9§l返回§r主页");
                itemStack1.setItemMeta(itemMeta1);
                ItemStack itemStack2 = new ItemStack(Material.CONDUIT);
                ItemMeta itemMeta2 = itemStack2.getItemMeta();
                itemStack2.setItemMeta(itemMeta2);
                ItemStack itemStack3 = new ItemStack(Material.BEACON);
                ItemMeta itemMeta3 = itemStack3.getItemMeta();
                itemStack3.setItemMeta(itemMeta3);
                ItemStack itemStack4 = new ItemStack(Material.END_CRYSTAL);
                ItemMeta itemMeta4 = itemStack4.getItemMeta();
                itemStack4.setItemMeta(itemMeta4);
                ItemStack itemStack5 = new ItemStack(Material.CRAFTING_TABLE);
                ItemMeta itemMeta5 = itemStack5.getItemMeta();
                itemMeta5.setDisplayName("§9§l工作台§r合成");
                ArrayList<String> lore5 = new ArrayList<>();
                lore5.add("§7该物品使用§7§l工作台§7合成，请");
                lore5.add("§7按照配方§7§l§n有序合成");
                itemMeta5.setLore(lore5);
                itemStack5.setItemMeta(itemMeta5);
                ItemStack itemStack6 = new ItemStack(Material.SADDLE);
                ItemMeta itemMeta6 = itemStack6.getItemMeta();
                itemStack6.setItemMeta(itemMeta6);
                ItemStack itemStack7 = new ItemStack(Material.BEEHIVE);
                ItemMeta itemMeta7 = itemStack7.getItemMeta();
                itemMeta7.setDisplayName("§9§l发动机§r模块");
                ArrayList<String> lore7 = new ArrayList<>();
                lore7.add("§7这是飞船的§7§l发动机模块§7,是整个飞船§7§l§n最重要§7的");
                lore7.add("§7模块，用§7§l强大的材料§7制成");
                itemMeta7.setLore(lore7);
                itemStack7.setItemMeta(itemMeta7);
                ItemStack itemStack8 = new ItemStack(Material.DISPENSER);
                ItemMeta itemMeta8 = itemStack8.getItemMeta();
                itemMeta8.setDisplayName("§c§l攻击§r模块");
                ArrayList<String> lore8 = new ArrayList<>();
                lore8.add("§7飞机的攻击模块，可以发射");
                lore8.add("§7TNT和弓箭");
                itemMeta8.setLore(lore8);
                itemStack8.setItemMeta(itemMeta8);
                ItemStack itemStack9 = new ItemStack(Material.OAK_BOAT);
                ItemMeta itemMeta9 = itemStack9.getItemMeta();
                itemMeta9.setDisplayName("§9§l飞§r船");
                ArrayList<String> lore9 = new ArrayList<>();
                lore9.add("§7这是BoatFly§7§l§n最重要的物品§7,是一");
                lore9.add("§7个很快地§7§l交通工具§7,可以让§7§l§o玩家§7自");
                lore9.add("§7由地去探索这个§7§l世界");
                lore9.add("");
                lore9.add("§6放下船§6§l后§6，§6§l§n右键§6上船");
                lore9.add("§6在§6§l船上§6,按§f§l§o§nShift§6打开面板");
                itemMeta9.setLore(lore9);
                itemStack9.setItemMeta(itemMeta9);
                ItemStack itemStack10 = new ItemStack(Material.NETHERITE_INGOT);
                ItemMeta itemMeta10 = itemStack10.getItemMeta();
                itemStack10.setItemMeta(itemMeta10);
                ItemStack itemStack11 = new ItemStack(Material.REDSTONE);
                ItemMeta itemMeta11 = itemStack11.getItemMeta();
                itemStack11.setItemMeta(itemMeta11);
                inventory.setItem(0, itemStack0);
                inventory.setItem(1, itemStack1);
                inventory.setItem(2, itemStack0);
                inventory.setItem(3, itemStack2);
                inventory.setItem(4, itemStack3);
                inventory.setItem(5, itemStack4);
                inventory.setItem(6, itemStack0);
                inventory.setItem(7, itemStack0);
                inventory.setItem(8, itemStack0);
                inventory.setItem(10, itemStack5);
                inventory.setItem(12, itemStack6);
                inventory.setItem(13, itemStack7);
                inventory.setItem(14, itemStack8);
                inventory.setItem(16, itemStack9);
                inventory.setItem(21, itemStack10);
                inventory.setItem(22, itemStack11);
                inventory.setItem(23, itemStack10);
                event.getWhoClicked().openInventory(inventory);

                if (event.isRightClick() && event.getWhoClicked().getGameMode().equals(GameMode.CREATIVE)) {
                    event.getWhoClicked().getInventory().addItem(itemStack9);
                    event.getWhoClicked().closeInventory();
                }
            }
            if (event.getRawSlot() == 10) {
                Inventory inventory = Bukkit.createInventory(null, 27, "飞船配方-发动机模块");
                ItemStack itemStack0 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
                ItemMeta itemMeta0 = itemStack0.getItemMeta();
                itemMeta0.setDisplayName(" ");
                itemStack0.setItemMeta(itemMeta0);
                ItemStack itemStack1 = new ItemStack(Material.OAK_SIGN);
                ItemMeta itemMeta1 = itemStack1.getItemMeta();
                itemMeta1.setDisplayName("§9§l返回§r主页");
                itemStack1.setItemMeta(itemMeta1);
                ItemStack itemStack2 = new ItemStack(Material.CONDUIT);
                ItemMeta itemMeta2 = itemStack2.getItemMeta();
                itemStack2.setItemMeta(itemMeta2);
                ItemStack itemStack3 = new ItemStack(Material.REDSTONE);
                ItemMeta itemMeta3 = itemStack3.getItemMeta();
                itemStack3.setItemMeta(itemMeta3);
                ItemStack itemStack4 = new ItemStack(Material.END_CRYSTAL);
                ItemMeta itemMeta4 = itemStack4.getItemMeta();
                itemStack4.setItemMeta(itemMeta4);
                ItemStack itemStack5 = new ItemStack(Material.CRAFTING_TABLE);
                ItemMeta itemMeta5 = itemStack5.getItemMeta();
                itemMeta5.setDisplayName("§9§l工作台§r合成");
                ArrayList<String> lore5 = new ArrayList<>();
                lore5.add("§7该物品使用§7§l工作台§7合成，请");
                lore5.add("§7按照配方§7§l§n有序合成");
                itemMeta5.setLore(lore5);
                itemStack5.setItemMeta(itemMeta5);
                ItemStack itemStack6 = new ItemStack(Material.FURNACE);
                ItemMeta itemMeta6 = itemStack6.getItemMeta();
                itemStack6.setItemMeta(itemMeta6);
                ItemStack itemStack7 = new ItemStack(Material.BLAST_FURNACE);
                ItemMeta itemMeta7 = itemStack7.getItemMeta();
                itemStack7.setItemMeta(itemMeta7);
                ItemStack itemStack8 = new ItemStack(Material.BEEHIVE);
                ItemMeta itemMeta8 = itemStack8.getItemMeta();
                itemMeta8.setDisplayName("§9§l发动机§r模块");
                ArrayList<String> lore8 = new ArrayList<>();
                lore8.add("§7这是飞船的§7§l发动机模块§7,是整个飞船§7§l§n最重要§7的");
                lore8.add("§7模块，用§7§l强大的材料§7制成");
                itemMeta8.setLore(lore8);
                itemStack8.setItemMeta(itemMeta8);
                ItemStack itemStack9 = new ItemStack(Material.DIAMOND_BLOCK);
                ItemMeta itemMeta9 = itemStack9.getItemMeta();
                itemStack9.setItemMeta(itemMeta9);
                ItemStack itemStack10 = new ItemStack(Material.NETHER_STAR);
                ItemMeta itemMeta10 = itemStack10.getItemMeta();
                itemStack10.setItemMeta(itemMeta10);
                inventory.setItem(0, itemStack0);
                inventory.setItem(1, itemStack1);
                inventory.setItem(2, itemStack0);
                inventory.setItem(3, itemStack2);
                inventory.setItem(4, itemStack3);
                inventory.setItem(5, itemStack4);
                inventory.setItem(6, itemStack0);
                inventory.setItem(7, itemStack0);
                inventory.setItem(8, itemStack0);
                inventory.setItem(10, itemStack5);
                inventory.setItem(12, itemStack6);
                inventory.setItem(13, itemStack7);
                inventory.setItem(14, itemStack6);
                inventory.setItem(16, itemStack8);
                inventory.setItem(21, itemStack9);
                inventory.setItem(22, itemStack10);
                inventory.setItem(23, itemStack9);
                event.getWhoClicked().openInventory(inventory);

                if (event.isRightClick() && event.getWhoClicked().getGameMode().equals(GameMode.CREATIVE)) {
                    event.getWhoClicked().getInventory().addItem(itemStack8);
                    event.getWhoClicked().closeInventory();
                }
            }
            if (event.getRawSlot() == 11) {
                Inventory inventory = Bukkit.createInventory(null, 27, "飞船配方-攻击模块");
                ItemStack itemStack0 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
                ItemMeta itemMeta0 = itemStack0.getItemMeta();
                itemMeta0.setDisplayName(" ");
                itemStack0.setItemMeta(itemMeta0);
                ItemStack itemStack1 = new ItemStack(Material.OAK_SIGN);
                ItemMeta itemMeta1 = itemStack1.getItemMeta();
                itemMeta1.setDisplayName("§9§l返回§r主页");
                itemStack1.setItemMeta(itemMeta1);
                ItemStack itemStack2 = new ItemStack(Material.END_CRYSTAL);
                ItemMeta itemMeta2 = itemStack2.getItemMeta();
                itemStack2.setItemMeta(itemMeta2);
                ItemStack itemStack3 = new ItemStack(Material.NETHER_STAR);
                ItemMeta itemMeta3 = itemStack3.getItemMeta();
                itemStack3.setItemMeta(itemMeta3);
                ItemStack itemStack4 = new ItemStack(Material.TARGET);
                ItemMeta itemMeta4 = itemStack4.getItemMeta();
                itemStack4.setItemMeta(itemMeta4);
                ItemStack itemStack5 = new ItemStack(Material.CRAFTING_TABLE);
                ItemMeta itemMeta5 = itemStack5.getItemMeta();
                itemMeta5.setDisplayName("§9§l工作台§r合成");
                ArrayList<String> lore5 = new ArrayList<>();
                lore5.add("§7该物品使用§7§l工作台§7合成，请");
                lore5.add("§7按照配方§7§l§n有序合成");
                itemMeta5.setLore(lore5);
                itemStack5.setItemMeta(itemMeta5);
                ItemStack itemStack6 = new ItemStack(Material.OBSERVER);
                ItemMeta itemMeta6 = itemStack6.getItemMeta();
                itemStack6.setItemMeta(itemMeta6);
                ItemStack itemStack7 = new ItemStack(Material.NETHERITE_SWORD);
                ItemMeta itemMeta7 = itemStack7.getItemMeta();
                itemStack7.setItemMeta(itemMeta7);
                ItemStack itemStack8 = new ItemStack(Material.DISPENSER);
                ItemMeta itemMeta8 = itemStack8.getItemMeta();
                itemMeta8.setDisplayName("§c§l攻击§r模块");
                ArrayList<String> lore8 = new ArrayList<>();
                lore8.add("§7飞机的攻击模块，可以发射");
                lore8.add("§7TNT和弓箭");
                itemMeta8.setLore(lore8);
                itemStack8.setItemMeta(itemMeta8);
                ItemStack itemStack9 = new ItemStack(Material.DIAMOND_BLOCK);
                ItemMeta itemMeta9 = itemStack9.getItemMeta();
                itemStack9.setItemMeta(itemMeta9);
                ItemStack itemStack10 = new ItemStack(Material.REDSTONE);
                ItemMeta itemMeta10 = itemStack10.getItemMeta();
                itemStack10.setItemMeta(itemMeta10);
                inventory.setItem(0, itemStack0);
                inventory.setItem(1, itemStack1);
                inventory.setItem(2, itemStack0);
                inventory.setItem(3, itemStack2);
                inventory.setItem(4, itemStack3);
                inventory.setItem(5, itemStack4);
                inventory.setItem(6, itemStack0);
                inventory.setItem(7, itemStack0);
                inventory.setItem(8, itemStack0);
                inventory.setItem(10, itemStack5);
                inventory.setItem(12, itemStack6);
                inventory.setItem(13, itemStack7);
                inventory.setItem(14, new ItemStack(Material.DISPENSER));
                inventory.setItem(16, itemStack8);
                inventory.setItem(21, itemStack9);
                inventory.setItem(22, itemStack10);
                inventory.setItem(23, itemStack9);

                event.getWhoClicked().openInventory(inventory);

                if (event.isRightClick() && event.getWhoClicked().getGameMode().equals(GameMode.CREATIVE)) {
                    event.getWhoClicked().getInventory().addItem(itemStack8);
                    event.getWhoClicked().closeInventory();
                }
            }
            if (event.getRawSlot() == 12) {
                Inventory inventory = Bukkit.createInventory(null, 27, "飞船配方-货运箱子");
                ItemStack itemStack0 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
                ItemMeta itemMeta0 = itemStack0.getItemMeta();
                itemMeta0.setDisplayName(" ");
                itemStack0.setItemMeta(itemMeta0);
                ItemStack itemStack1 = new ItemStack(Material.OAK_SIGN);
                ItemMeta itemMeta1 = itemStack1.getItemMeta();
                itemMeta1.setDisplayName("§9§l返回§r主页");
                itemStack1.setItemMeta(itemMeta1);
                ItemStack itemStack2 = new ItemStack(Material.SHULKER_SHELL);
                ItemMeta itemMeta2 = itemStack2.getItemMeta();
                itemStack2.setItemMeta(itemMeta2);
                ItemStack itemStack3 = new ItemStack(Material.IRON_TRAPDOOR);
                ItemMeta itemMeta3 = itemStack3.getItemMeta();
                itemStack3.setItemMeta(itemMeta3);
                ItemStack itemStack4 = new ItemStack(Material.CRAFTING_TABLE);
                ItemMeta itemMeta4 = itemStack4.getItemMeta();
                itemMeta4.setDisplayName("§9§l工作台§r合成");
                ArrayList<String> lore4 = new ArrayList<>();
                lore4.add("§7该物品使用§7§l工作台§7合成，请");
                lore4.add("§7按照配方§7§l§n有序合成");
                itemMeta4.setLore(lore4);
                itemStack4.setItemMeta(itemMeta4);
                ItemStack itemStack5 = new ItemStack(Material.HONEY_BLOCK);
                ItemMeta itemMeta5 = itemStack5.getItemMeta();
                itemStack5.setItemMeta(itemMeta5);
                ItemStack itemStack6 = new ItemStack(Material.CHEST);
                ItemMeta itemMeta6 = itemStack6.getItemMeta();
                itemStack6.setItemMeta(itemMeta6);
                ItemStack itemStack7 = new ItemStack(Material.SLIME_BLOCK);
                ItemMeta itemMeta7 = itemStack7.getItemMeta();
                itemStack7.setItemMeta(itemMeta7);
                ItemStack itemStack8 = new ItemStack(Material.CHEST);
                ItemMeta itemMeta8 = itemStack8.getItemMeta();
                itemMeta8.setDisplayName("§9§l货运§r箱子");
                ArrayList<String> lore8 = new ArrayList<>();
                lore8.add("§7这是专门用于§7§l货运飞船§7的箱子，虽然看起来一样，");
                lore8.add("§7但实际上就是§7§l一样§7的（");
                itemMeta8.setLore(lore8);
                itemStack8.setItemMeta(itemMeta8);
                ItemStack itemStack9 = new ItemStack(Material.NETHERITE_INGOT);
                ItemMeta itemMeta9 = itemStack9.getItemMeta();
                itemStack9.setItemMeta(itemMeta9);
                ItemStack itemStack10 = new ItemStack(Material.CAULDRON);
                ItemMeta itemMeta10 = itemStack10.getItemMeta();
                itemStack10.setItemMeta(itemMeta10);
                inventory.setItem(0, itemStack0);
                inventory.setItem(1, itemStack1);
                inventory.setItem(2, itemStack0);
                inventory.setItem(3, itemStack2);
                inventory.setItem(4, itemStack3);
                inventory.setItem(5, itemStack2);
                inventory.setItem(6, itemStack0);
                inventory.setItem(7, itemStack0);
                inventory.setItem(8, itemStack0);
                inventory.setItem(10, itemStack4);
                inventory.setItem(12, itemStack5);
                inventory.setItem(13, itemStack6);
                inventory.setItem(14, itemStack7);
                inventory.setItem(16, itemStack8);
                inventory.setItem(21, itemStack9);
                inventory.setItem(22, itemStack10);
                inventory.setItem(23, itemStack9);

                event.getWhoClicked().openInventory(inventory);
                if (event.isRightClick() && event.getWhoClicked().getGameMode().equals(GameMode.CREATIVE)) {
                    event.getWhoClicked().getInventory().addItem(itemStack8);
                    event.getWhoClicked().closeInventory();
                }
            }
            if (event.getRawSlot() == 13) {
                Inventory inventory = Bukkit.createInventory(null, 27, "飞船配方-货运飞船");
                ItemStack itemStack0 = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
                ItemMeta itemMeta0 = itemStack0.getItemMeta();
                itemMeta0.setDisplayName(" ");
                itemStack0.setItemMeta(itemMeta0);
                ItemStack itemStack1 = new ItemStack(Material.OAK_SIGN);
                ItemMeta itemMeta1 = itemStack1.getItemMeta();
                itemMeta1.setDisplayName("§9§l返回§r主页");
                itemStack1.setItemMeta(itemMeta1);
                ItemStack itemStack2 = new ItemStack(Material.CHEST);
                ItemMeta itemMeta2 = itemStack2.getItemMeta();
                itemMeta2.setDisplayName("§9§l货运§r箱子");
                ArrayList<String> lore2 = new ArrayList<>();
                lore2.add("§7这是专门用于§7§l货运飞船§7的箱子，虽然看起来一样，");
                lore2.add("§7但实际上就是§7§l一样§7的（");
                itemMeta2.setLore(lore2);
                itemStack2.setItemMeta(itemMeta2);
                ItemStack itemStack3 = new ItemStack(Material.CRAFTING_TABLE);
                ItemMeta itemMeta3 = itemStack3.getItemMeta();
                itemMeta3.setDisplayName("§9§l工作台§r合成");
                ArrayList<String> lore3 = new ArrayList<>();
                lore3.add("§7该物品使用§7§l工作台§7合成，请");
                lore3.add("§7按照配方§7§l§n有序合成");
                itemMeta3.setLore(lore3);
                itemStack3.setItemMeta(itemMeta3);
                ItemStack itemStack4 = new ItemStack(Material.OAK_CHEST_BOAT);
                ItemMeta itemMeta4 = itemStack4.getItemMeta();
                itemMeta4.setDisplayName("§9§l货运§r飞船");
                ArrayList<String> lore4 = new ArrayList<>();
                lore4.add("§7这是BoatFly§7§l§n最重要的物品§7,是一");
                lore4.add("§7个很快地§7§l交通工具§7,可以让§7§l§o玩家§7自");
                lore4.add("§7由地去探索这个§7§l世界");
                lore4.add("§7这艘飞船不仅可以§l载人§r§7，还可以§l§n运货");
                lore4.add("");
                lore4.add("§6放下船§6§l后§6，§6§l§n右键§6上船");
                lore4.add("§6在§6§l船上§6,按§f§l§o§nShift§6打开面板");
                itemMeta4.setLore(lore4);
                itemStack4.setItemMeta(itemMeta4);
                ItemStack itemStack5 = new ItemStack(Material.CAMPFIRE);
                ItemMeta itemMeta5 = itemStack5.getItemMeta();
                itemStack5.setItemMeta(itemMeta5);
                ItemStack itemStack6 = new ItemStack(Material.NETHERITE_INGOT);
                ItemMeta itemMeta6 = itemStack6.getItemMeta();
                itemStack6.setItemMeta(itemMeta6);
                ItemStack itemStack9 = new ItemStack(Material.OAK_BOAT);
                ItemMeta itemMeta9 = itemStack9.getItemMeta();
                itemMeta9.setDisplayName("§9§l飞§r船");
                ArrayList<String> lore9 = new ArrayList<>();
                lore9.add("§7这是BoatFly§7§l§n最重要的物品§7,是一");
                lore9.add("§7个很快地§7§l交通工具§7,可以让§7§l§o玩家§7自");
                lore9.add("§7由地去探索这个§7§l世界");
                lore9.add("");
                lore9.add("§6放下船§6§l后§6，§6§l§n右键§6上船");
                lore9.add("§6在§6§l船上§6,按§f§l§o§nShift§6打开面板");
                itemMeta9.setLore(lore9);
                itemStack9.setItemMeta(itemMeta9);
                inventory.setItem(0, itemStack0);
                inventory.setItem(1, itemStack1);
                inventory.setItem(2, itemStack0);
                inventory.setItem(4, itemStack2);
                inventory.setItem(6, itemStack0);
                inventory.setItem(7, itemStack0);
                inventory.setItem(8, itemStack0);
                inventory.setItem(10, itemStack3);
                inventory.setItem(13, itemStack9);
                inventory.setItem(16, itemStack4);
                inventory.setItem(21, itemStack5);
                inventory.setItem(22, itemStack6);
                inventory.setItem(23, itemStack5);

                event.getWhoClicked().openInventory(inventory);

                if (event.isRightClick() && event.getWhoClicked().getGameMode().equals(GameMode.CREATIVE)) {
                    event.getWhoClicked().getInventory().addItem(itemStack4);
                    event.getWhoClicked().closeInventory();
                }
            }
        }
    }
}
