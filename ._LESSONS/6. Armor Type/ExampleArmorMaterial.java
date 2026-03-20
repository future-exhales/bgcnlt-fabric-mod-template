package org.bgcnltmc;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

public class ExampleArmorMaterial {
    public static final int BASE_DURABILITY = 15;
    public static final String ARMOR_NAME = "example";
    public static final TagKey<Item> REPAIRS_EXAMPLE_ARMOR = TagKey.create(BuiltInRegistries.ITEM.key(), Identifier.fromNamespaceAndPath(BGCNLTMod.MOD_ID, "repairs_example_armor"));

    public static final ResourceKey<EquipmentAsset> EXAMPLE_ARMOR_MATERIAL_KEY = ResourceKey.create(
            EquipmentAssets.ROOT_ID, Identifier.fromNamespaceAndPath(BGCNLTMod.MOD_ID, ARMOR_NAME));

    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 8,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 3
            ),
            5,
            SoundEvents.ARMOR_EQUIP_IRON,
            0.0F,
            0.0F,
            REPAIRS_EXAMPLE_ARMOR,
            EXAMPLE_ARMOR_MATERIAL_KEY
    );
}
