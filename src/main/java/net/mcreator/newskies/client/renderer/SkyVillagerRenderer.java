
package net.mcreator.newskies.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.VillagerModel;

import net.mcreator.newskies.entity.SkyVillagerEntity;

import com.mojang.blaze3d.vertex.PoseStack;

public class SkyVillagerRenderer extends MobRenderer<SkyVillagerEntity, VillagerModel<SkyVillagerEntity>> {
	public SkyVillagerRenderer(EntityRendererProvider.Context context) {
		super(context, new VillagerModel(context.bakeLayer(ModelLayers.VILLAGER)), 0.5f);
	}

	@Override
	protected void scale(SkyVillagerEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.9375f, 0.9375f, 0.9375f);
	}

	@Override
	public ResourceLocation getTextureLocation(SkyVillagerEntity entity) {
		return new ResourceLocation("new_skies:textures/entities/skyvillager.png");
	}
}
