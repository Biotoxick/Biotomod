package net.mcreator.biotomod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.biotomod.item.TeleporterBinderItem;
import net.mcreator.biotomod.block.TeleporterFrameBlock;
import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class TeleporterBinderRightClickedOnBlockProcedure extends BiotomodModElements.ModElement {
	public TeleporterBinderRightClickedOnBlockProcedure(BiotomodModElements instance) {
		super(instance, 61);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiotomodMod.LOGGER.warn("Failed to load dependency entity for procedure TeleporterBinderRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				BiotomodMod.LOGGER.warn("Failed to load dependency itemstack for procedure TeleporterBinderRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiotomodMod.LOGGER.warn("Failed to load dependency x for procedure TeleporterBinderRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiotomodMod.LOGGER.warn("Failed to load dependency y for procedure TeleporterBinderRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiotomodMod.LOGGER.warn("Failed to load dependency z for procedure TeleporterBinderRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiotomodMod.LOGGER.warn("Failed to load dependency world for procedure TeleporterBinderRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)
				.getItem() == new ItemStack(TeleporterBinderItem.block, (int) (1)).getItem())) {
			if (((world instanceof World ? (((World) world).getDimensionKey()) : World.OVERWORLD) == (World.OVERWORLD))) {
				if ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TeleporterFrameBlock.block.getDefaultState()
						.getBlock()))) {
					(itemstack).getOrCreateTag().putDouble("x", (entity.getPosX()));
					(itemstack).getOrCreateTag().putDouble("y", (entity.getPosY()));
					(itemstack).getOrCreateTag().putDouble("z", (entity.getPosZ()));
					if (world instanceof World && !world.isRemote()) {
						((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.comparator.click")),
								SoundCategory.NEUTRAL, (float) 2, (float) 1);
					} else {
						((World) world).playSound(x, y, z,
								(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.comparator.click")),
								SoundCategory.NEUTRAL, (float) 2, (float) 1, false);
					}
					((itemstack)).setDisplayName(new StringTextComponent((("Teleporter Binder - Linked to :") + "" + ("x :") + ""
							+ ((entity.getPosX())) + "" + ("y :") + "" + ((entity.getPosY())) + "" + ("z :") + "" + ((entity.getPosZ())))));
					(itemstack).getOrCreateTag().putBoolean("Linked", (true));
					if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
						((PlayerEntity) entity).sendStatusMessage(new StringTextComponent((("Teleporter Binder - Linked to :") + "" + ("x :") + ""
								+ ((entity.getPosX())) + "" + ("y :") + "" + ((entity.getPosY())) + "" + ("z :") + "" + ((entity.getPosZ())))),
								(false));
					}
				}
			} else {
				if (entity instanceof PlayerEntity && !entity.world.isRemote()) {
					((PlayerEntity) entity).sendStatusMessage(new StringTextComponent("\u00A7cYou may be use that in Overworld..."), (false));
				}
			}
		}
	}
}
