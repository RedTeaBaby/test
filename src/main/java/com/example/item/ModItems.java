package com.example.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems  {
    public static final Item REINFORCEDCRYSTAL_CHESTPLATE = registerItem("reinforcedcrystal_chestplate",new Item(new FabricItemSettings()));//注册物品

    public static final Item REINFORCEDCRYSTAL_HELMET =registerItem("reinforcedcrystal_helmet",new Item(new FabricItemSettings()));

    public static final Item REINFORCEDCRYSTAL_LEGGINGS = registerItem("reinforcedcrystal_leggings",new Item(new FabricItemSettings()));

    public static final Item REINFORCEDCRYSTAL_BOOTS = registerItem("reinforcedcrystal_boots",new Item(new FabricItemSettings()));


    public static void  init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems:: registerItemToGroup);//放入创造物品栏


    }
    public  static Item registerItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier("abode",name),item);


    }
    public static void registerItemToGroup(FabricItemGroupEntries entries){
        entries.add(REINFORCEDCRYSTAL_CHESTPLATE);
        entries.add(REINFORCEDCRYSTAL_HELMET);
        entries.add(REINFORCEDCRYSTAL_LEGGINGS);
        entries.add(REINFORCEDCRYSTAL_BOOTS);

    }

    }
