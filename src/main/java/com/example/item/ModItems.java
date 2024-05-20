package com.example.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;



public class ModItems  {
    public static final Item REINFORCEDCRYSTAL_CRYSTAL = MaterialItem("reinforcedcrystal_crystal",new Item(new FabricItemSettings()));
//材料
    public static final Item REINFORCEDCRYSTAL_CHESTPLATE = ArmorItem(REINFORCEDCRYSTAL_CRYSTAL,"reinforcedcrystal_chestplate", EquipmentSlot.CHEST, new Item(new FabricItemSettings()));//注册物品

    public static final Item REINFORCEDCRYSTAL_HELMET =ArmorItem(REINFORCEDCRYSTAL_CRYSTAL, "reinforcedcrystal_helmet", EquipmentSlot.HEAD, new Item(new FabricItemSettings()));

    public static final Item REINFORCEDCRYSTAL_LEGGINGS = ArmorItem(REINFORCEDCRYSTAL_CRYSTAL, "reinforcedcrystal_leggings",EquipmentSlot.LEGS,new Item(new FabricItemSettings()));

    public static final Item REINFORCEDCRYSTAL_BOOTS =ArmorItem(REINFORCEDCRYSTAL_CRYSTAL, "reinforcedcrystal_boots", EquipmentSlot.FEET, new Item(new FabricItemSettings()));
//装备


    public static void  init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems:: ArmorItemToGroup);//将装备组放入物品栏
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INVENTORY).register(ModItems:: MaterialItemToGroup);//将材料组放入物品栏


    }

    private static void MaterialItemToGroup(FabricItemGroupEntries entries) {
        entries.add(REINFORCEDCRYSTAL_CRYSTAL);//材料组
    }

    public  static Item ArmorItem(Item reinforcedcrystalIngot, String name, EquipmentSlot chest, Item item){
        return Registry.register(Registries.ITEM,new Identifier("abode-mod",name),item);


    }
    public static void ArmorItemToGroup(FabricItemGroupEntries entries){
        entries.add(REINFORCEDCRYSTAL_CHESTPLATE);
        entries.add(REINFORCEDCRYSTAL_HELMET);
        entries.add(REINFORCEDCRYSTAL_LEGGINGS);
        entries.add(REINFORCEDCRYSTAL_BOOTS);//装备组


    }
    public  static Item MaterialItem(String name,Item item){
        return Registry.register(Registries.ITEM,new Identifier("abode-mod",name),item);

    }
}
