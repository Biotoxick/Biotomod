package net.mcreator.biotomod.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.Property;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.BlockState;

import net.mcreator.biotomod.item.ParallelicUpgradeItem;
import net.mcreator.biotomod.block.SkyoreminerupgradedBlock;
import net.mcreator.biotomod.block.SkyoreminertitaneBlock;
import net.mcreator.biotomod.block.SkyoreminerredstoneBlock;
import net.mcreator.biotomod.block.SkyoreminerquartzBlock;
import net.mcreator.biotomod.block.SkyoreminermithrilBlock;
import net.mcreator.biotomod.block.SkyoreminerlapisBlock;
import net.mcreator.biotomod.block.SkyoreminerironBlock;
import net.mcreator.biotomod.block.SkyoreminergoldBlock;
import net.mcreator.biotomod.block.SkyoremineremeraldBlock;
import net.mcreator.biotomod.block.SkyoreminerdiamondBlock;
import net.mcreator.biotomod.block.SkyoreminercoalBlock;
import net.mcreator.biotomod.block.SkyoreminerclayBlock;
import net.mcreator.biotomod.block.SkyoremineracientdebrisBlock;
import net.mcreator.biotomod.block.SkyoreminerBlock;
import net.mcreator.biotomod.block.SkuoreminerobsidianBlock;
import net.mcreator.biotomod.block.MithrilBlastFurnaceUpgradedBlock;
import net.mcreator.biotomod.block.MithrilBlastFurnaceBlock;
import net.mcreator.biotomod.block.ComnustionGeneratorBlock;
import net.mcreator.biotomod.block.CombustionGeneratorTier2Block;
import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class ParallelicUpgradeRightClickedOnBlockProcedure extends BiotomodModElements.ModElement {
	public ParallelicUpgradeRightClickedOnBlockProcedure(BiotomodModElements instance) {
		super(instance, 184);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				BiotomodMod.LOGGER.warn("Failed to load dependency entity for procedure ParallelicUpgradeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiotomodMod.LOGGER.warn("Failed to load dependency x for procedure ParallelicUpgradeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiotomodMod.LOGGER.warn("Failed to load dependency y for procedure ParallelicUpgradeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiotomodMod.LOGGER.warn("Failed to load dependency z for procedure ParallelicUpgradeRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiotomodMod.LOGGER.warn("Failed to load dependency world for procedure ParallelicUpgradeRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if ((((((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminerBlock.block.getDefaultState().getBlock())
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminercoalBlock.block.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminertitaneBlock.block.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminerclayBlock.block.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminerquartzBlock.block.getDefaultState()
						.getBlock()))
				|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoremineracientdebrisBlock.block.getDefaultState()
						.getBlock()))
				|| (((((((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoremineremeraldBlock.block.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminerdiamondBlock.block
								.getDefaultState().getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminerlapisBlock.block.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminergoldBlock.block.getDefaultState()
								.getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminerredstoneBlock.block
								.getDefaultState().getBlock()))
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminerironBlock.block.getDefaultState()
								.getBlock())))
				|| (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkyoreminermithrilBlock.block.getDefaultState()
						.getBlock())
						|| ((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == SkuoreminerobsidianBlock.block
								.getDefaultState().getBlock())))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), SkyoreminerupgradedBlock.block.getDefaultState(), 3);
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(ParallelicUpgradeItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == MithrilBlastFurnaceBlock.block.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = MithrilBlastFurnaceUpgradedBlock.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(ParallelicUpgradeItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
		if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == ComnustionGeneratorBlock.block.getDefaultState()
				.getBlock())) {
			{
				BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
				BlockState _bs = CombustionGeneratorTier2Block.block.getDefaultState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateContainer().getProperty(entry.getKey().getName());
					if (_property != null && _bs.get(_property) != null)
						try {
							_bs = _bs.with(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				TileEntity _te = world.getTileEntity(_bp);
				CompoundNBT _bnbt = null;
				if (_te != null) {
					_bnbt = _te.write(new CompoundNBT());
					_te.remove();
				}
				world.setBlockState(_bp, _bs, 3);
				if (_bnbt != null) {
					_te = world.getTileEntity(_bp);
					if (_te != null) {
						try {
							_te.read(_bso, _bnbt);
						} catch (Exception ignored) {
						}
					}
				}
			}
			if (world instanceof World && !world.isRemote()) {
				((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1);
			} else {
				((World) world).playSound(x, y, z,
						(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.use")),
						SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
			}
			if (entity instanceof PlayerEntity)
				((PlayerEntity) entity).closeScreen();
			if ((!((entity instanceof PlayerEntity) ? ((PlayerEntity) entity).abilities.isCreativeMode : false))) {
				if (entity instanceof PlayerEntity) {
					ItemStack _stktoremove = new ItemStack(ParallelicUpgradeItem.block, (int) (1));
					((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
							((PlayerEntity) entity).container.func_234641_j_());
				}
			}
		}
	}
}
