package org.bgcnltmc;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ExampleToolMaterial {
    public static final ToolMaterial EXAMPLE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            455,        // (DURABILITY) Wood = 59, Stone = 131, Copper = 190, Iron = 250, Diamond = 1561, Gold = 32, Netherite = 2031
            5.0F,       // (SPEED) Wood = 2.0F, Stone = 4.0F, Copper = 5.0F, Iron = 6.0F, Diamond = 8.0F, Gold = 12.0F, Netherite = 9.0F
            1.5F,       // (ATTACK DAMAGE BONUS) Wood = 0.0F, Stone = 1.0F, Copper = 1.0F, Iron = 2.0F, Diamond = 3.0F, Gold = 0.0F, Netherite = 4.0F
            22,         // (ENCHANTABILITY) Wood = 15, Stone = 5, Copper = 13, Iron = 14, Diamond = 10, Gold = 22, Netherite = 15
            ExampleArmorMaterial.REPAIRS_EXAMPLE_ARMOR
    );
}