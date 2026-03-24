package org.bgcnltmc;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.bgcnltmc.datagen.ModEnglishLanguageProvider;
import org.bgcnltmc.datagen.ModModelProvider;
import org.bgcnltmc.datagen.ModBlockTagProvider;
import org.bgcnltmc.datagen.ModRecipeProvider;

public class MCFabricModDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(ModBlockTagProvider::new);
        pack.addProvider(ModEnglishLanguageProvider::new);;
        pack.addProvider(ModModelProvider::new);
        pack.addProvider(ModRecipeProvider::new);
	}
}
