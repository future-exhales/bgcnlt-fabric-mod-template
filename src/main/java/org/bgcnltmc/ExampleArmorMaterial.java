package org.bgcnltmc;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.*;

import java.util.Map;

public class ExampleArmorMaterial {
    public static final int BASE_DURABILITY = 15; // LEATHER = 5, COPPER = 11, CHAINMAIL = 15, IRON = 15, GOLD = 7, DIAMOND = 33, NETHERITE = 37
    public static final String ARMOR_NAME = "example"; // Change the name the game refers to your armor as. Easily you can just find+replace "Example"
    public static final TagKey<Item> REPAIRS_EXAMPLE_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(BGCNLTMod.MOD_ID, "repairs_example_armor"));
    // change out "example" on line above

    public static final ResourceKey<EquipmentAsset> EXAMPLE_ARMOR_MATERIAL_KEY = ResourceKey.create(
            EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(BGCNLTMod.MOD_ID, ARMOR_NAME));
    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 3,            // LEATHER = 1, COPPER = 1, CHAINMAIL = 1, IRON = 2, GOLD = 1, DIAMOND/NETHERITE = 3
                    ArmorType.CHESTPLATE, 8,        // LEATHER = 2, COPPER = 3, CHAINMAIL = 4, IRON = 5, GOLD = 6, DIAMOND/NETHERITE = 6
                    ArmorType.LEGGINGS, 6,          // LEATHER = 3, COPPER = 4, CHAINMAIL = 5, IRON = 6, GOLD = 5, DIAMOND/NETHERITE = 8
                    ArmorType.BOOTS, 3              // LEATHER = 1, COPPER = 2, CHAINMAIL = 2, IRON = 2, GOLD = 2, DIAMOND/NETHERITE = 3
            ),
            5,                                       // (ENCHANTABILITY) LEATHER = 15, COPPER = 8, CHAINMAIL = 12, IRON = 9, GOLD = 25, DIAMOND = 10, NETHERITE = 15
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,                                   // (TOUGHNESS) DIAMOND = 2.0F, NETHERITE = 3.0F, ALL OTHERS = 0.0F
            0.0F,                                   // (KNOCKBACK RESISTANCE) NETHERITE = 0.1F, ALL OTHERS = 0.0F
            REPAIRS_EXAMPLE_ARMOR,
            EXAMPLE_ARMOR_MATERIAL_KEY
    );
}
