package org.bgcnltmc;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {

	// REGULAR ITEM
	public static final Item EXAMPLE_ITEM = register("example_item", Item::new, new Item.Properties());
	// FOOD
	public static final Consumable LEVITATION_FOOD_CONSUMABLE_COMPONENT = Consumables.defaultFood()
			// The duration is in ticks, 20 ticks = 1 second
			.onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.LEVITATION, 6 * 20, 1), 1.0f))
			.build();
	public static final FoodProperties LEVITATION_FOOD_COMPONENT = new FoodProperties.Builder()
			.nutrition(3)
			.saturationModifier(1.3f)
			.alwaysEdible()
			.build();

	public static final Item EXAMPLE_FOOD = register("example_food", Item::new, new Item.Properties()
			.food(LEVITATION_FOOD_COMPONENT, LEVITATION_FOOD_CONSUMABLE_COMPONENT));

	// ARMOR

	public static final Item EXAMPLE_HELMET = register(
			"guidite_helmet",
			Item::new,
			new Item.Properties().humanoidArmor(ExampleArmorMaterial.INSTANCE, ArmorType.HELMET)
					.durability(ArmorType.HELMET.getDurability(ExampleArmorMaterial.BASE_DURABILITY))
	);
	public static final Item EXAMPLE_CHESTPLATE = register("guidite_chestplate",
			Item::new,
			new Item.Properties().humanoidArmor(ExampleArmorMaterial.INSTANCE, ArmorType.CHESTPLATE)
					.durability(ArmorType.CHESTPLATE.getDurability(ExampleArmorMaterial.BASE_DURABILITY))
	);

	public static final Item EXAMPLE_LEGGINGS = register(
			"guidite_leggings",
			Item::new,
			new Item.Properties().humanoidArmor(ExampleArmorMaterial.INSTANCE, ArmorType.LEGGINGS)
					.durability(ArmorType.LEGGINGS.getDurability(ExampleArmorMaterial.BASE_DURABILITY))
	);

	public static final Item EXAMPLE_BOOTS = register(
			"guidite_boots",
			Item::new,
			new Item.Properties().humanoidArmor(ExampleArmorMaterial.INSTANCE, ArmorType.BOOTS)
					.durability(ArmorType.BOOTS.getDurability(ExampleArmorMaterial.BASE_DURABILITY))
	);

	public static <T extends Item> T register(String name, Function<Item.Properties, T> itemFactory, Item.Properties settings) {
		// Create the item key.
		ResourceKey<Item> itemKey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(MCFabricMod.MOD_ID, name));

		// Create the item instance.
		T item = itemFactory.apply(settings.setId(itemKey));

		// Register the item.
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);

		return item;
	}

	public static void initialize() {
		// Get the event for modifying entries in the ingredients group.
		// And register an event handler that adds our suspicious item to the ingredients group.
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
				.register((itemGroup) -> itemGroup.accept(ModItems.EXAMPLE_ITEM));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
				.register((itemGroup) -> itemGroup.accept(ModItems.EXAMPLE_FOOD));
	}
}

/*
	NUTRITION/SATURATION VALUES
	STEAK = 8/1.6
	GOLDEN CARROT = 6/14.4

 */