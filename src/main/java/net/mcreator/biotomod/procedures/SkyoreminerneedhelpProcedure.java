package net.mcreator.biotomod.procedures;

import net.minecraftforge.fml.network.NetworkHooks;

import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.network.PacketBuffer;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.Container;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.biotomod.gui.UpgradedskyoreminerguihelpGui;
import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.Map;

import io.netty.buffer.Unpooled;

@BiotomodModElements.ModElement.Tag
public class SkyoreminerneedhelpProcedure extends BiotomodModElements.ModElement {
	public SkyoreminerneedhelpProcedure(BiotomodModElements instance) {
		super(instance, 183);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiotomodMod.LOGGER.warn("Failed to load dependency entity for procedure Skyoreminerneedhelp!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiotomodMod.LOGGER.warn("Failed to load dependency x for procedure Skyoreminerneedhelp!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiotomodMod.LOGGER.warn("Failed to load dependency y for procedure Skyoreminerneedhelp!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiotomodMod.LOGGER.warn("Failed to load dependency z for procedure Skyoreminerneedhelp!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiotomodMod.LOGGER.warn("Failed to load dependency world for procedure Skyoreminerneedhelp!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Entity _ent = entity;
			if (_ent instanceof ServerPlayerEntity) {
				BlockPos _bpos = new BlockPos((int) x, (int) y, (int) z);
				NetworkHooks.openGui((ServerPlayerEntity) _ent, new INamedContainerProvider() {
					@Override
					public ITextComponent getDisplayName() {
						return new StringTextComponent("Upgradedskyoreminerguihelp");
					}

					@Override
					public Container createMenu(int id, PlayerInventory inventory, PlayerEntity player) {
						return new UpgradedskyoreminerguihelpGui.GuiContainerMod(id, inventory,
								new PacketBuffer(Unpooled.buffer()).writeBlockPos(_bpos));
					}
				}, _bpos);
			}
		}
	}
}
