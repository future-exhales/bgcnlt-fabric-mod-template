package org.bgcnltmc;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.ArrayList;

public class ModArmor {

    public static ArrayList<Item> armorItems = new ArrayList<Item>();
    public static ArrayList<String> armorItemNames = new ArrayList<String>();
    public static final Item EXAMPLE_HELMET = ModItems.register(
            "example_helmet",
            Item::new,
            new Item.Properties().humanoidArmor(ExampleArmorMaterial.INSTANCE, ArmorType.HELMET)
                    .durability(ArmorType.HELMET.getDurability(ExampleArmorMaterial.BASE_DURABILITY))
    );
    public static final Item EXAMPLE_CHESTPLATE = ModItems.register(
            "example_chestplate",
            Item::new,
            new Item.Properties().humanoidArmor(ExampleArmorMaterial.INSTANCE, ArmorType.CHESTPLATE)
                    .durability(ArmorType.CHESTPLATE.getDurability(ExampleArmorMaterial.BASE_DURABILITY))
    );

    public static final Item EXAMPLE_LEGGINGS = ModItems.register(
            "example_leggings",
            Item::new,
            new Item.Properties().humanoidArmor(ExampleArmorMaterial.INSTANCE, ArmorType.LEGGINGS)
                    .durability(ArmorType.LEGGINGS.getDurability(ExampleArmorMaterial.BASE_DURABILITY))
    );

    public static final Item EXAMPLE_BOOTS = ModItems.register(
            "example_boots",
            Item::new,
            new Item.Properties().humanoidArmor(ExampleArmorMaterial.INSTANCE, ArmorType.BOOTS)
                    .durability(ArmorType.BOOTS.getDurability(ExampleArmorMaterial.BASE_DURABILITY))
    );


    public static void initialize() {
        armorItems.add(EXAMPLE_BOOTS);
        armorItemNames.add("Example Boots");
        armorItems.add(EXAMPLE_LEGGINGS);
        armorItemNames.add("Example Leggings");
        armorItems.add(EXAMPLE_CHESTPLATE);
        armorItemNames.add("Example Chestplate");
        armorItems.add(EXAMPLE_HELMET);
        armorItemNames.add("Example Helmet");
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(ModArmor.EXAMPLE_BOOTS));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(ModArmor.EXAMPLE_LEGGINGS));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(ModArmor.EXAMPLE_CHESTPLATE));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(ModArmor.EXAMPLE_HELMET));
    }
}
