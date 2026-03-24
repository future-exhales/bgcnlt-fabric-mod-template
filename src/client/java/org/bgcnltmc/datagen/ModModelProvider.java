package org.bgcnltmc.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import org.bgcnltmc.ModBlocks;
import org.bgcnltmc.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        for (int i = 0; i < ModBlocks.blocks.size(); i++) {
            blockStateModelGenerator.createTrivialCube(ModBlocks.blocks.get(i));
        }
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        for (int i = 0; i < ModItems.items.size(); i++) {
            itemModelGenerator.generateFlatItem(ModItems.items.get(i), ModelTemplates.FLAT_ITEM);
        }
    }

    @Override
    public String getName() {
        return "ModModelProvider";
    }
}