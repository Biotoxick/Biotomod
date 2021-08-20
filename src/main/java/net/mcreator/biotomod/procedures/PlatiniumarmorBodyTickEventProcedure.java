package net.mcreator.biotomod.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.biotomod.item.PlatiniumarmorItem;
import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class PlatiniumarmorBodyTickEventProcedure extends BiotomodModElements.ModElement {
	public PlatiniumarmorBodyTickEventProcedure(BiotomodModElements instance) {
		super(instance, 83);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiotomodMod.LOGGER.warn("Failed to load dependency entity for procedure PlatiniumarmorBodyTickEvent!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.RESISTANCE, (int) 200, (int) 1));
		if ((((((entity instanceof LivingEntity)
				? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 3))
				: ItemStack.EMPTY).getItem() == new ItemStack(PlatiniumarmorItem.helmet, (int) (1)).getItem())
				&& (((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 1))
						: ItemStack.EMPTY).getItem() == new ItemStack(PlatiniumarmorItem.legs, (int) (1)).getItem()))
				&& (((entity instanceof LivingEntity)
						? ((LivingEntity) entity).getItemStackFromSlot(EquipmentSlotType.fromSlotTypeAndIndex(EquipmentSlotType.Group.ARMOR, (int) 0))
						: ItemStack.EMPTY).getItem() == new ItemStack(PlatiniumarmorItem.boots, (int) (1)).getItem()))) {
			entity.getPersistentData().putBoolean("Can Fly", (true));
			if (entity instanceof PlayerEntity) {
				((PlayerEntity) entity).abilities.allowFlying = ((entity.getPersistentData().getBoolean("Can Fly")) == (true));
				((PlayerEntity) entity).sendPlayerAbilities();
			}
		} else {
			entity.getPersistentData().putBoolean("Can Fly", (false));
		}
	}
}
