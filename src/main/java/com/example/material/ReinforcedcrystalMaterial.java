package com.example.material;

import com.example.item.ModItems;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
//盔甲效果--按照Wiki给的模板写的，抛开数据平衡不谈，暂时没能找到问题

public class ReinforcedcrystalMaterial implements ArmorMaterial {
    private static final int[] BASE_DURABILITY = new int[] {13, 15, 16, 11};
    private static final int[] PROTECTION_VALUES = new int[] {5, 6, 8, 4};


    public int method_7696(EquipmentSlot slot) {
        return BASE_DURABILITY[slot.getEntitySlotId()] * 30;
    }

    public int method_7697(EquipmentSlot slot) {
        return PROTECTION_VALUES[slot.getEntitySlotId()]* 40;
    }


    public int getDurability(ArmorItem.Type type) {
        return 0;
    }


    public int getProtection(ArmorItem.Type type) {
        return 4;
    }


    public int getEnchantability() {
        return 1;
    }


    public SoundEvent getEquipSound() {
        return SoundEvents.ITEM_ARMOR_EQUIP_IRON;
    }


    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(ModItems.REINFORCEDCRYSTAL);
    }


    public String getName() {
        // Must be all lowercase
        return "name";
    }


    public float getToughness() {
        return 2.0F;
    }


    public float getKnockbackResistance() {
        return 0.2F;
    }

}
