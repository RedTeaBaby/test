package com.example.item;


import com.example.item.ModItems;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

import net.minecraft.util.Identifier;

public class ModItems  {
    public static final Item BLACKTEA = new Item(new FabricItemSettings());//注册物品

    public static void  init() {
        Registry.register(Registries.ITEM, new Identifier("abode", "blacktea"),BLACKTEA);//将物品写入注册表
                ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content ->
                        content.add(BLACKTEA));//放入创造物品栏

    }


    }
