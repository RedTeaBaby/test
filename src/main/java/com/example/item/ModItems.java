package com.example.item;


import com.example.material.ReinforcedcrystalMaterial;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;





public class ModItems {
    public static final ArmorMaterial REINFORCEDCRYSTALMATERIAL = new ReinforcedcrystalMaterial();
    public static final ArmorMaterial Reinforcedcrystal = new ReinforcedcrystalMaterial();

    public static final Item REINFORCEDCRYSTAL = new reinforcedcrystal(new Item.Settings());

    public static final Item REINFORCEDCRYSTAL_HELMET = new ArmorItem(Reinforcedcrystal, ArmorItem.Type.HELMET, new Item.Settings().fireproof());

    public static final Item REINFORCEDCRYSTAL_CHESTPLATE = new ArmorItem(Reinforcedcrystal, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof());

    public static final Item REINFORCEDCRYSTAL_LEGGINGS = new ArmorItem(Reinforcedcrystal,ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof());

    public static final Item REINFORCEDCRYSTAL_BOOTS = new ArmorItem(Reinforcedcrystal, ArmorItem.Type.BOOTS, new Item.Settings().fireproof());

    public static void register() {
        Registry.register(Registries.ITEM, new Identifier("abode-mod", "reinforcedcrystal"), REINFORCEDCRYSTAL);
        Registry.register(Registries.ITEM, new Identifier("abode-mod", "reinforcedcrystal_helmet"), REINFORCEDCRYSTAL_HELMET);
        Registry.register(Registries.ITEM, new Identifier("abode-mod", "reinforcedcrystal_chestplate"), REINFORCEDCRYSTAL_CHESTPLATE);
        Registry.register(Registries.ITEM, new Identifier("abode-mod", "reinforcedcrystal_leggings"), REINFORCEDCRYSTAL_LEGGINGS);
        Registry.register(Registries.ITEM, new Identifier("abode-mod", "reinforcedcrystal_boots"), REINFORCEDCRYSTAL_BOOTS);
    }

//装备

  public static void  init() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(ModItems::ArmorMaterialToGroup);//将装备组放入物品栏

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems:: MaterialItemToGroup);//将材料组放入物品栏


    }

   private static void MaterialItemToGroup(FabricItemGroupEntries entries) {
       entries.add(REINFORCEDCRYSTAL);//材料组
    }

    public  static Item ArmorItem(ArmorMaterial REINFORCEDCRYSTALCRYSTAL, String name, EquipmentSlot chest, Item item){
        return Registry.register(Registries.ITEM,new Identifier("abode-mod",name),item);


    }
    public static void ArmorMaterialToGroup(FabricItemGroupEntries entries){
       entries.add(REINFORCEDCRYSTAL_CHESTPLATE);
       entries.add(REINFORCEDCRYSTAL_HELMET);
        entries.add(REINFORCEDCRYSTAL_LEGGINGS);
        entries.add(REINFORCEDCRYSTAL_BOOTS);//装备组


    }



    }

