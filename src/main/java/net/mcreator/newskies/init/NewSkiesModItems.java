
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newskies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;
import net.neoforged.bus.api.IEventBus;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.newskies.item.CoinItem;
import net.mcreator.newskies.NewSkiesMod;

public class NewSkiesModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, NewSkiesMod.MODID);
	public static final DeferredHolder<Item, Item> SKY_DIRT = block(NewSkiesModBlocks.SKY_DIRT);
	public static final DeferredHolder<Item, Item> SKY_GRASS = block(NewSkiesModBlocks.SKY_GRASS);
	public static final DeferredHolder<Item, Item> BLUE_SKY_WOOD = block(NewSkiesModBlocks.BLUE_SKY_WOOD);
	public static final DeferredHolder<Item, Item> BLUE_SKY_LOG = block(NewSkiesModBlocks.BLUE_SKY_LOG);
	public static final DeferredHolder<Item, Item> BLUE_SKY_PLANKS = block(NewSkiesModBlocks.BLUE_SKY_PLANKS);
	public static final DeferredHolder<Item, Item> BLUE_SKY_LEAVES = block(NewSkiesModBlocks.BLUE_SKY_LEAVES);
	public static final DeferredHolder<Item, Item> BLUE_SKY_STAIRS = block(NewSkiesModBlocks.BLUE_SKY_STAIRS);
	public static final DeferredHolder<Item, Item> BLUE_SKY_SLAB = block(NewSkiesModBlocks.BLUE_SKY_SLAB);
	public static final DeferredHolder<Item, Item> BLUE_SKY_FENCE = block(NewSkiesModBlocks.BLUE_SKY_FENCE);
	public static final DeferredHolder<Item, Item> BLUE_SKY_FENCE_GATE = block(NewSkiesModBlocks.BLUE_SKY_FENCE_GATE);
	public static final DeferredHolder<Item, Item> BLUE_SKY_PRESSURE_PLATE = block(NewSkiesModBlocks.BLUE_SKY_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> BLUE_SKY_BUTTON = block(NewSkiesModBlocks.BLUE_SKY_BUTTON);
	public static final DeferredHolder<Item, Item> WHITE_WOOD = block(NewSkiesModBlocks.WHITE_WOOD);
	public static final DeferredHolder<Item, Item> WHITE_LOG = block(NewSkiesModBlocks.WHITE_LOG);
	public static final DeferredHolder<Item, Item> WHITE_PLANKS = block(NewSkiesModBlocks.WHITE_PLANKS);
	public static final DeferredHolder<Item, Item> WHITE_LEAVES = block(NewSkiesModBlocks.WHITE_LEAVES);
	public static final DeferredHolder<Item, Item> WHITE_STAIRS = block(NewSkiesModBlocks.WHITE_STAIRS);
	public static final DeferredHolder<Item, Item> WHITE_SLAB = block(NewSkiesModBlocks.WHITE_SLAB);
	public static final DeferredHolder<Item, Item> WHITE_FENCE = block(NewSkiesModBlocks.WHITE_FENCE);
	public static final DeferredHolder<Item, Item> WHITE_FENCE_GATE = block(NewSkiesModBlocks.WHITE_FENCE_GATE);
	public static final DeferredHolder<Item, Item> WHITE_PRESSURE_PLATE = block(NewSkiesModBlocks.WHITE_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> WHITE_BUTTON = block(NewSkiesModBlocks.WHITE_BUTTON);
	public static final DeferredHolder<Item, Item> GREENSTONE = block(NewSkiesModBlocks.GREENSTONE);
	public static final DeferredHolder<Item, Item> VAULT = block(NewSkiesModBlocks.VAULT);
	public static final DeferredHolder<Item, Item> COIN = REGISTRY.register("coin", () -> new CoinItem());
	public static final DeferredHolder<Item, Item> SKY_VILLAGER_SPAWN_EGG = REGISTRY.register("sky_villager_spawn_egg", () -> new DeferredSpawnEggItem(NewSkiesModEntities.SKY_VILLAGER, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	public static void register(IEventBus bus) {
		REGISTRY.register(bus);
	}

	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
