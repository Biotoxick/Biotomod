package net.mcreator.biotomod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class PlatiniumHammerToolInHandTickProcedure extends BiotomodModElements.ModElement {
	public PlatiniumHammerToolInHandTickProcedure(BiotomodModElements instance) {
		super(instance, 81);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiotomodMod.LOGGER.warn("Failed to load dependency entity for procedure PlatiniumHammerToolInHandTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HASTE, (int) 200, (int) 1));
	}
}
