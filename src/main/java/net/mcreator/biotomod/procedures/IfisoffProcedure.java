package net.mcreator.biotomod.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;

import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class IfisoffProcedure extends BiotomodModElements.ModElement {
	public IfisoffProcedure(BiotomodModElements instance) {
		super(instance, 296);
	}

	public static boolean executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiotomodMod.LOGGER.warn("Failed to load dependency x for procedure Ifisoff!");
			return false;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiotomodMod.LOGGER.warn("Failed to load dependency y for procedure Ifisoff!");
			return false;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiotomodMod.LOGGER.warn("Failed to load dependency z for procedure Ifisoff!");
			return false;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiotomodMod.LOGGER.warn("Failed to load dependency world for procedure Ifisoff!");
			return false;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			public boolean getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "isOn")) == (false))) {
			return (true);
		}
		return (false);
	}
}
