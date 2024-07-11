
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newskies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.newskies.block.WhiteWoodBlock;
import net.mcreator.newskies.block.WhiteStairsBlock;
import net.mcreator.newskies.block.WhiteSlabBlock;
import net.mcreator.newskies.block.WhitePressurePlateBlock;
import net.mcreator.newskies.block.WhitePlanksBlock;
import net.mcreator.newskies.block.WhiteLogBlock;
import net.mcreator.newskies.block.WhiteLeavesBlock;
import net.mcreator.newskies.block.WhiteFenceGateBlock;
import net.mcreator.newskies.block.WhiteFenceBlock;
import net.mcreator.newskies.block.WhiteButtonBlock;
import net.mcreator.newskies.block.VaultBlock;
import net.mcreator.newskies.block.SkyGrassBlock;
import net.mcreator.newskies.block.SkyDirtBlock;
import net.mcreator.newskies.block.GreenstoneBlock;
import net.mcreator.newskies.block.Blue_SkyWoodBlock;
import net.mcreator.newskies.block.Blue_SkyStairsBlock;
import net.mcreator.newskies.block.Blue_SkySlabBlock;
import net.mcreator.newskies.block.Blue_SkyPressurePlateBlock;
import net.mcreator.newskies.block.Blue_SkyPlanksBlock;
import net.mcreator.newskies.block.Blue_SkyLogBlock;
import net.mcreator.newskies.block.Blue_SkyLeavesBlock;
import net.mcreator.newskies.block.Blue_SkyFenceGateBlock;
import net.mcreator.newskies.block.Blue_SkyFenceBlock;
import net.mcreator.newskies.block.Blue_SkyButtonBlock;
import net.mcreator.newskies.NewSkiesMod;

public class NewSkiesModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK, NewSkiesMod.MODID);
	public static final DeferredHolder<Block, Block> SKY_DIRT = REGISTRY.register("sky_dirt", () -> new SkyDirtBlock());
	public static final DeferredHolder<Block, Block> SKY_GRASS = REGISTRY.register("sky_grass", () -> new SkyGrassBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_WOOD = REGISTRY.register("blue_sky_wood", () -> new Blue_SkyWoodBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_LOG = REGISTRY.register("blue_sky_log", () -> new Blue_SkyLogBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_PLANKS = REGISTRY.register("blue_sky_planks", () -> new Blue_SkyPlanksBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_LEAVES = REGISTRY.register("blue_sky_leaves", () -> new Blue_SkyLeavesBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_STAIRS = REGISTRY.register("blue_sky_stairs", () -> new Blue_SkyStairsBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_SLAB = REGISTRY.register("blue_sky_slab", () -> new Blue_SkySlabBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_FENCE = REGISTRY.register("blue_sky_fence", () -> new Blue_SkyFenceBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_FENCE_GATE = REGISTRY.register("blue_sky_fence_gate", () -> new Blue_SkyFenceGateBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_PRESSURE_PLATE = REGISTRY.register("blue_sky_pressure_plate", () -> new Blue_SkyPressurePlateBlock());
	public static final DeferredHolder<Block, Block> BLUE_SKY_BUTTON = REGISTRY.register("blue_sky_button", () -> new Blue_SkyButtonBlock());
	public static final DeferredHolder<Block, Block> WHITE_WOOD = REGISTRY.register("white_wood", () -> new WhiteWoodBlock());
	public static final DeferredHolder<Block, Block> WHITE_LOG = REGISTRY.register("white_log", () -> new WhiteLogBlock());
	public static final DeferredHolder<Block, Block> WHITE_PLANKS = REGISTRY.register("white_planks", () -> new WhitePlanksBlock());
	public static final DeferredHolder<Block, Block> WHITE_LEAVES = REGISTRY.register("white_leaves", () -> new WhiteLeavesBlock());
	public static final DeferredHolder<Block, Block> WHITE_STAIRS = REGISTRY.register("white_stairs", () -> new WhiteStairsBlock());
	public static final DeferredHolder<Block, Block> WHITE_SLAB = REGISTRY.register("white_slab", () -> new WhiteSlabBlock());
	public static final DeferredHolder<Block, Block> WHITE_FENCE = REGISTRY.register("white_fence", () -> new WhiteFenceBlock());
	public static final DeferredHolder<Block, Block> WHITE_FENCE_GATE = REGISTRY.register("white_fence_gate", () -> new WhiteFenceGateBlock());
	public static final DeferredHolder<Block, Block> WHITE_PRESSURE_PLATE = REGISTRY.register("white_pressure_plate", () -> new WhitePressurePlateBlock());
	public static final DeferredHolder<Block, Block> WHITE_BUTTON = REGISTRY.register("white_button", () -> new WhiteButtonBlock());
	public static final DeferredHolder<Block, Block> GREENSTONE = REGISTRY.register("greenstone", () -> new GreenstoneBlock());
	public static final DeferredHolder<Block, Block> VAULT = REGISTRY.register("vault", () -> new VaultBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
