package org.bgcnltmc.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import org.bgcnltmc.ModBlocks;
import org.bgcnltmc.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLanguageProvider extends FabricLanguageProvider {
    public ModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<HolderLookup.Provider> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(HolderLookup.Provider provider, TranslationBuilder translationBuilder) {
        for (int i = 0; i < ModItems.itemNames.size(); i++ ) {
            translationBuilder.add(ModItems.items.get(i).getDescriptionId(), ModItems.itemNames.get(i));
        }
        for (int i = 0; i < ModBlocks.blockNames.size(); i++ ) {
            translationBuilder.add(ModBlocks.blocks.get(i).getDescriptionId(), ModBlocks.blockNames.get(i));
        }
    }
}
