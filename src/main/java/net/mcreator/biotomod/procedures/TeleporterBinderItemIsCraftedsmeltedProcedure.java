package net.mcreator.biotomod.procedures;

import net.minecraft.item.ItemStack;

import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class TeleporterBinderItemIsCraftedsmeltedProcedure extends BiotomodModElements.ModElement {
	public TeleporterBinderItemIsCraftedsmeltedProcedure(BiotomodModElements instance) {
		super(instance, 63);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				BiotomodMod.LOGGER.warn("Failed to load dependency itemstack for procedure TeleporterBinderItemIsCraftedsmelted!");
			return;
		}
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		(itemstack).getOrCreateTag().putBoolean("Linked", (false));
	}
}
