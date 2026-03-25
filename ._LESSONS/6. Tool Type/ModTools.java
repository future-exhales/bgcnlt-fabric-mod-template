package org.bgcnltmc;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;

public class ModTools {

    public static final Item EXAMPLE_SWORD = ModItems.register(
            "example_sword",
            Item::new,
            new Item.Properties().sword(ExampleToolMaterial.EXAMPLE_TOOL_MATERIAL, 1f, 1f)
    );
    public static final Item EXAMPLE_PICKAXE = ModItems.register(
            "example_pickaxe",
            Item::new,
            new Item.Properties().pickaxe(ExampleToolMaterial.EXAMPLE_TOOL_MATERIAL, 1f, 1f)
    );
    public static final Item EXAMPLE_AXE = ModItems.register(
            "example_axe",
            Item::new,
            new Item.Properties().axe(ExampleToolMaterial.EXAMPLE_TOOL_MATERIAL, 1f, 1f)
    );
    public static final Item EXAMPLE_SHOVEL = ModItems.register(
            "example_shovel",
            Item::new,
            new Item.Properties().shovel(ExampleToolMaterial.EXAMPLE_TOOL_MATERIAL, 1f, 1f)
    );
    public static final Item EXAMPLE_HOE = ModItems.register(
            "example_hoe",
            Item::new,
            new Item.Properties().hoe(ExampleToolMaterial.EXAMPLE_TOOL_MATERIAL, 1f, 1f)
    );

    public static void initialize() {

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
                .register((itemGroup) -> itemGroup.accept(ModTools.EXAMPLE_SWORD));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> itemGroup.accept(ModTools.EXAMPLE_PICKAXE));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> itemGroup.accept(ModTools.EXAMPLE_HOE));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> itemGroup.accept(ModTools.EXAMPLE_SHOVEL));
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
                .register((itemGroup) -> itemGroup.accept(ModTools.EXAMPLE_AXE));
    }

}