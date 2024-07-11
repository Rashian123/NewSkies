
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.newskies.init;

import net.neoforged.neoforge.event.village.VillagerTradesEvent;
import net.neoforged.neoforge.common.BasicItemListing;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class NewSkiesModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == NewSkiesModVillagerProfessions.BANKER.get()) {
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.GOLD_INGOT),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.IRON_INGOT, 2),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.COPPER_INGOT, 3),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(2).add(new BasicItemListing(new ItemStack(Items.DIAMOND),

					new ItemStack(NewSkiesModItems.COIN.get(), 5), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.EMERALD),

					new ItemStack(NewSkiesModItems.COIN.get(), 7), 10, 5, 0.05f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.NETHERITE_INGOT),

					new ItemStack(NewSkiesModItems.COIN.get(), 10), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.OAK_LOG, 5),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.SPRUCE_LOG, 5),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.BIRCH_LOG, 5),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.JUNGLE_LOG, 5),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.ACACIA_LOG, 5),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.DARK_OAK_LOG, 5),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.MANGROVE_LOG, 5),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Blocks.CHERRY_LOG, 5),

					new ItemStack(NewSkiesModItems.COIN.get()), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Blocks.SUGAR_CANE),

					new ItemStack(NewSkiesModItems.COIN.get(), 3), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.EXPERIENCE_BOTTLE),

					new ItemStack(NewSkiesModItems.COIN.get(), 10), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.NETHER_WART),

					new ItemStack(NewSkiesModItems.COIN.get(), 5), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.NETHER_STAR),

					new ItemStack(NewSkiesModItems.COIN.get(), 20), 10, 5, 0.05f));
		}
	}
}
