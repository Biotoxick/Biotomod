package net.mcreator.biotomod.procedures;

import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.DirectionProperty;
import net.minecraft.block.BlockState;

import net.mcreator.biotomod.block.SkyoreminerupgradedBlock;
import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class RfdrainsouthProcedure extends BiotomodModElements.ModElement {
	public RfdrainsouthProcedure(BiotomodModElements instance) {
		super(instance, 209);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiotomodMod.LOGGER.warn("Failed to load dependency x for procedure Rfdrainsouth!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiotomodMod.LOGGER.warn("Failed to load dependency y for procedure Rfdrainsouth!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiotomodMod.LOGGER.warn("Failed to load dependency z for procedure Rfdrainsouth!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiotomodMod.LOGGER.warn("Failed to load dependency world for procedure Rfdrainsouth!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		double south = 0;
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (property != null)
						return _bs.get(property);
					return Direction.getFacingFromAxisDirection(
							_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
							Direction.AxisDirection.POSITIVE);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.SOUTH)) {
			if ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)))).getBlock() == SkyoreminerupgradedBlock.block.getDefaultState()
					.getBlock()))) {
				if (((new Object() {
					public double getValue(IWorld world, BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "rf")) < 400000)) {
					if ((new Object() {
						public boolean canExtractEnergy(IWorld world, BlockPos pos) {
							AtomicBoolean _retval = new AtomicBoolean(false);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
										.ifPresent(capability -> _retval.set(capability.canExtract()));
							return _retval.get();
						}
					}.canExtractEnergy(world, new BlockPos((int) x, (int) y, (int) (z - 1))))) {
						if (((new Object() {
							public int getEnergyStored(IWorld world, BlockPos pos) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> _retval.set(capability.getEnergyStored()));
								return _retval.get();
							}
						}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) (z - 1)))) > 501)) {
							south = (double) (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) 20000));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) (z - 1)));
								int _amount = (int) (south);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.NORTH)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								int _amount = (int) (south);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
						}
					}
				}
			}
		}
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (property != null)
						return _bs.get(property);
					return Direction.getFacingFromAxisDirection(
							_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
							Direction.AxisDirection.POSITIVE);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.NORTH)) {
			if ((!((world.getBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)))).getBlock() == SkyoreminerupgradedBlock.block.getDefaultState()
					.getBlock()))) {
				if (((new Object() {
					public double getValue(IWorld world, BlockPos pos, String tag) {
						TileEntity tileEntity = world.getTileEntity(pos);
						if (tileEntity != null)
							return tileEntity.getTileData().getDouble(tag);
						return -1;
					}
				}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "rf")) < 400000)) {
					if ((new Object() {
						public boolean canExtractEnergy(IWorld world, BlockPos pos) {
							AtomicBoolean _retval = new AtomicBoolean(false);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
										.ifPresent(capability -> _retval.set(capability.canExtract()));
							return _retval.get();
						}
					}.canExtractEnergy(world, new BlockPos((int) x, (int) y, (int) (z + 1))))) {
						if (((new Object() {
							public int getEnergyStored(IWorld world, BlockPos pos) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> _retval.set(capability.getEnergyStored()));
								return _retval.get();
							}
						}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) (z + 1)))) > 501)) {
							south = (double) (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) (z + 1)), (int) 20000));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) (z + 1)));
								int _amount = (int) (south);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								int _amount = (int) (south);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.SOUTH)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
						}
					}
				}
			}
		}
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (property != null)
						return _bs.get(property);
					return Direction.getFacingFromAxisDirection(
							_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
							Direction.AxisDirection.POSITIVE);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.WEST)) {
			if (((new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "rf")) < 400000)) {
				if ((!((world.getBlockState(new BlockPos((int) (x + 1), (int) y, (int) z))).getBlock() == SkyoreminerupgradedBlock.block
						.getDefaultState().getBlock()))) {
					if ((new Object() {
						public boolean canExtractEnergy(IWorld world, BlockPos pos) {
							AtomicBoolean _retval = new AtomicBoolean(false);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
										.ifPresent(capability -> _retval.set(capability.canExtract()));
							return _retval.get();
						}
					}.canExtractEnergy(world, new BlockPos((int) (x + 1), (int) y, (int) z)))) {
						if (((new Object() {
							public int getEnergyStored(IWorld world, BlockPos pos) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> _retval.set(capability.getEnergyStored()));
								return _retval.get();
							}
						}.getEnergyStored(world, new BlockPos((int) (x + 1), (int) y, (int) z))) > 501)) {
							south = (double) (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos((int) (x + 1), (int) y, (int) z), (int) 20000));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) y, (int) z));
								int _amount = (int) (south);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								int _amount = (int) (south);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
						}
					}
				}
			}
		}
		if (((new Object() {
			public Direction getDirection(BlockPos pos) {
				try {
					BlockState _bs = world.getBlockState(pos);
					DirectionProperty property = (DirectionProperty) _bs.getBlock().getStateContainer().getProperty("facing");
					if (property != null)
						return _bs.get(property);
					return Direction.getFacingFromAxisDirection(
							_bs.get((EnumProperty<Direction.Axis>) _bs.getBlock().getStateContainer().getProperty("axis")),
							Direction.AxisDirection.POSITIVE);
				} catch (Exception e) {
					return Direction.NORTH;
				}
			}
		}.getDirection(new BlockPos((int) x, (int) y, (int) z))) == Direction.EAST)) {
			if (((new Object() {
				public double getValue(IWorld world, BlockPos pos, String tag) {
					TileEntity tileEntity = world.getTileEntity(pos);
					if (tileEntity != null)
						return tileEntity.getTileData().getDouble(tag);
					return -1;
				}
			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "rf")) < 400000)) {
				if ((!((world.getBlockState(new BlockPos((int) (x - 1), (int) y, (int) z))).getBlock() == SkyoreminerupgradedBlock.block
						.getDefaultState().getBlock()))) {
					if ((new Object() {
						public boolean canExtractEnergy(IWorld world, BlockPos pos) {
							AtomicBoolean _retval = new AtomicBoolean(false);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
										.ifPresent(capability -> _retval.set(capability.canExtract()));
							return _retval.get();
						}
					}.canExtractEnergy(world, new BlockPos((int) (x - 1), (int) y, (int) z)))) {
						if (((new Object() {
							public int getEnergyStored(IWorld world, BlockPos pos) {
								AtomicInteger _retval = new AtomicInteger(0);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> _retval.set(capability.getEnergyStored()));
								return _retval.get();
							}
						}.getEnergyStored(world, new BlockPos((int) (x - 1), (int) y, (int) z))) > 501)) {
							south = (double) (new Object() {
								public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null)
										_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
												.ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
									return _retval.get();
								}
							}.extractEnergySimulate(world, new BlockPos((int) (x - 1), (int) y, (int) z), (int) 20000));
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) (x - 1), (int) y, (int) z));
								int _amount = (int) (south);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.WEST)
											.ifPresent(capability -> capability.extractEnergy(_amount, false));
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								int _amount = (int) (south);
								if (_ent != null)
									_ent.getCapability(CapabilityEnergy.ENERGY, Direction.EAST)
											.ifPresent(capability -> capability.receiveEnergy(_amount, false));
							}
						}
					}
				}
			}
		}
	}
}
