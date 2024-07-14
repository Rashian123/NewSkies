
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.newskies.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.newskies.NewSkiesMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class NewSkiesModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, NewSkiesMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> NEW_SKIES = REGISTRY.register("new_skies",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.new_skies.new_skies")).icon(() -> new ItemStack(Blocks.AIR)).displayItems((parameters, tabData) -> {
				tabData.accept(NewSkiesModBlocks.SKY_DIRT.get().asItem());
				tabData.accept(NewSkiesModBlocks.SKY_GRASS.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_WOOD.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_LOG.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_PLANKS.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_STAIRS.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_SLAB.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_FENCE.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_FENCE_GATE.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_PRESSURE_PLATE.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_BUTTON.get().asItem());
				tabData.accept(NewSkiesModBlocks.BLUE_SKY_LEAVES.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_WOOD.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_LOG.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_PLANKS.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_LEAVES.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_STAIRS.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_SLAB.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_FENCE.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_FENCE_GATE.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_PRESSURE_PLATE.get().asItem());
				tabData.accept(NewSkiesModBlocks.WHITE_BUTTON.get().asItem());
				tabData.accept(NewSkiesModBlocks.GREENSTONE.get().asItem());
				tabData.accept(NewSkiesModBlocks.VAULT.get().asItem());
				tabData.accept(NewSkiesModItems.COIN.get());
			})

					.build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(NewSkiesModItems.SKY_VILLAGER_SPAWN_EGG.get());
		}
	}
}
