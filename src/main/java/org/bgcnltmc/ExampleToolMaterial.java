package org.bgcnltmc;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.ToolMaterial;

public class ExampleToolMaterial {
    public static final ToolMaterial EXAMPLE_TOOL_MATERIAL = new ToolMaterial(
            BlockTags.INCORRECT_FOR_WOODEN_TOOL,
            455,
            5.0F,
            1.5F,
            22,
            ExampleArmorMaterial.REPAIRS_EXAMPLE_ARMOR
    );
}
