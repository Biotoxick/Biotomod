package net.mcreator.biotomod.procedures;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.container.Slot;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.function.Supplier;
import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class PortableteleporteritemMakeItemGlowProcedure extends BiotomodModElements.ModElement {
	public PortableteleporteritemMakeItemGlowProcedure(BiotomodModElements instance) {
		super(instance, 70);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiotomodMod.LOGGER.warn("Failed to load dependency entity for procedure PortableteleporteritemMakeItemGlow!");
			return false;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((((new Object() {
			public ItemStack getItemStack(int sltid) {
				Entity _ent = entity;
				if (_ent instanceof ServerPlayerEntity) {
					Container _current = ((ServerPlayerEntity) _ent).openContainer;
					if (_current instanceof Supplier) {
						Object invobj = ((Supplier) _current).get();
						if (invobj instanceof Map) {
							return ((Slot) ((Map) invobj).get(sltid)).getStack();
						}
					}
				}
				return ItemStack.EMPTY;
			}
		}.getItemStack((int) (0))).getOrCreateTag().getBoolean("Linked")) == (true))) {
			return (true);
		}
		return (false);
	}
}
