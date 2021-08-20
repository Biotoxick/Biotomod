package net.mcreator.biotomod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.energy.CapabilityEnergy;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.biotomod.item.PlatiniumItem;
import net.mcreator.biotomod.item.MithrilIngotItem;
import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class BiotableUpdateTickProcedure extends BiotomodModElements.ModElement {
	public BiotableUpdateTickProcedure(BiotomodModElements instance) {
		super(instance, 122);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiotomodMod.LOGGER.warn("Failed to load dependency x for procedure BiotableUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiotomodMod.LOGGER.warn("Failed to load dependency y for procedure BiotableUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiotomodMod.LOGGER.warn("Failed to load dependency z for procedure BiotableUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiotomodMod.LOGGER.warn("Failed to load dependency world for procedure BiotableUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((new Object() {
			public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
				return _retval.get();
			}
		}.extractEnergySimulate(world, new BlockPos((int) (x + 1), (int) y, (int) z), (int) 500)) >= 500)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x + 1), (int) y, (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (((new Object() {
			public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
				return _retval.get();
			}
		}.extractEnergySimulate(world, new BlockPos((int) (x - 1), (int) y, (int) z), (int) 500)) >= 500)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) (x - 1), (int) y, (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (((new Object() {
			public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
				return _retval.get();
			}
		}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) (z - 1)), (int) 500)) >= 500)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) (z - 1)));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (((new Object() {
			public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
				return _retval.get();
			}
		}.extractEnergySimulate(world, new BlockPos((int) x, (int) y, (int) (z + 1)), (int) 500)) >= 500)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) (z + 1)));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (((new Object() {
			public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
				return _retval.get();
			}
		}.extractEnergySimulate(world, new BlockPos((int) x, (int) (y + 1), (int) z), (int) 500)) >= 500)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) (y + 1), (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (((new Object() {
			public int extractEnergySimulate(IWorld world, BlockPos pos, int _amount) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.extractEnergy(_amount, true)));
				return _retval.get();
			}
		}.extractEnergySimulate(world, new BlockPos((int) x, (int) (y - 1), (int) z), (int) 500)) >= 500)) {
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) (y - 1), (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.extractEnergy(_amount, false));
			}
			{
				TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
				int _amount = (int) 500;
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
		}
		if (((new Object() {
			public ItemStack getItemStack(BlockPos pos, int sltid) {
				AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null) {
					_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
						_retval.set(capability.getStackInSlot(sltid).copy());
					});
				}
				return _retval.get();
			}
		}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Items.DIAMOND, (int) (1)).getItem())) {
			if (((new Object() {
				public ItemStack getItemStack(BlockPos pos, int sltid) {
					AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
					TileEntity _ent = world.getTileEntity(pos);
					if (_ent != null) {
						_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
							_retval.set(capability.getStackInSlot(sltid).copy());
						});
					}
					return _retval.get();
				}
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(MithrilIngotItem.block, (int) (1))
					.getItem())) {
				if (((new Object() {
					public ItemStack getItemStack(BlockPos pos, int sltid) {
						AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
						TileEntity _ent = world.getTileEntity(pos);
						if (_ent != null) {
							_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
								_retval.set(capability.getStackInSlot(sltid).copy());
							});
						}
						return _retval.get();
					}
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.DIAMOND, (int) (1)).getItem())) {
					if (((new Object() {
						public ItemStack getItemStack(BlockPos pos, int sltid) {
							AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null) {
								_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
									_retval.set(capability.getStackInSlot(sltid).copy());
								});
							}
							return _retval.get();
						}
					}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (3))).getItem() == new ItemStack(MithrilIngotItem.block, (int) (1))
							.getItem())) {
						if (((new Object() {
							public ItemStack getItemStack(BlockPos pos, int sltid) {
								AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
								TileEntity _ent = world.getTileEntity(pos);
								if (_ent != null) {
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										_retval.set(capability.getStackInSlot(sltid).copy());
									});
								}
								return _retval.get();
							}
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (4)))
								.getItem() == new ItemStack(Items.GLOWSTONE_DUST, (int) (1)).getItem())) {
							if (((new Object() {
								public ItemStack getItemStack(BlockPos pos, int sltid) {
									AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).copy());
										});
									}
									return _retval.get();
								}
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (5)))
									.getItem() == new ItemStack(MithrilIngotItem.block, (int) (1)).getItem())) {
								if (((new Object() {
									public ItemStack getItemStack(BlockPos pos, int sltid) {
										AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
										TileEntity _ent = world.getTileEntity(pos);
										if (_ent != null) {
											_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
												_retval.set(capability.getStackInSlot(sltid).copy());
											});
										}
										return _retval.get();
									}
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (6)))
										.getItem() == new ItemStack(Items.DIAMOND, (int) (1)).getItem())) {
									if (((new Object() {
										public ItemStack getItemStack(BlockPos pos, int sltid) {
											AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
											TileEntity _ent = world.getTileEntity(pos);
											if (_ent != null) {
												_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
													_retval.set(capability.getStackInSlot(sltid).copy());
												});
											}
											return _retval.get();
										}
									}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (7)))
											.getItem() == new ItemStack(MithrilIngotItem.block, (int) (1)).getItem())) {
										if (((new Object() {
											public ItemStack getItemStack(BlockPos pos, int sltid) {
												AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
												TileEntity _ent = world.getTileEntity(pos);
												if (_ent != null) {
													_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
														_retval.set(capability.getStackInSlot(sltid).copy());
													});
												}
												return _retval.get();
											}
										}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (8)))
												.getItem() == new ItemStack(Items.DIAMOND, (int) (1)).getItem())) {
											if (((new Object() {
												public int getEnergyStored(IWorld world, BlockPos pos) {
													AtomicInteger _retval = new AtomicInteger(0);
													TileEntity _ent = world.getTileEntity(pos);
													if (_ent != null)
														_ent.getCapability(CapabilityEnergy.ENERGY, null)
																.ifPresent(capability -> _retval.set(capability.getEnergyStored()));
													return _retval.get();
												}
											}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 50000)) {
												if (((new Object() {
													public int getAmount(IWorld world, BlockPos pos, int sltid) {
														AtomicInteger _retval = new AtomicInteger(0);
														TileEntity _ent = world.getTileEntity(pos);
														if (_ent != null) {
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		_retval.set(capability.getStackInSlot(sltid).getCount());
																	});
														}
														return _retval.get();
													}
												}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (0);
															final int _amount = (int) 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_sltid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (1);
															final int _amount = (int) 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_sltid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (2);
															final int _amount = (int) 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_sltid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (3);
															final int _amount = (int) 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_sltid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (4);
															final int _amount = (int) 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_sltid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (5);
															final int _amount = (int) 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_sltid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (6);
															final int _amount = (int) 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_sltid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (7);
															final int _amount = (int) 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_sltid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (8);
															final int _amount = (int) 1;
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			ItemStack _stk = capability.getStackInSlot(_sltid).copy();
																			_stk.shrink(_amount);
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
																		}
																	});
														}
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														int _amount = (int) 50000;
														if (_ent != null)
															_ent.getCapability(CapabilityEnergy.ENERGY, null)
																	.ifPresent(capability -> capability.extractEnergy(_amount, false));
													}
													{
														TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
														if (_ent != null) {
															final int _sltid = (int) (9);
															final ItemStack _setstack = new ItemStack(PlatiniumItem.block, (int) (1));
															_setstack.setCount((int) ((new Object() {
																public int getAmount(IWorld world, BlockPos pos, int sltid) {
																	AtomicInteger _retval = new AtomicInteger(0);
																	TileEntity _ent = world.getTileEntity(pos);
																	if (_ent != null) {
																		_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																				.ifPresent(capability -> {
																					_retval.set(capability.getStackInSlot(sltid).getCount());
																				});
																	}
																	return _retval.get();
																}
															}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (9))) + 1));
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		if (capability instanceof IItemHandlerModifiable) {
																			((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _setstack);
																		}
																	});
														}
													}
													if (world instanceof World && !world.isRemote()) {
														((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																		.getValue(new ResourceLocation("block.anvil.use")),
																SoundCategory.NEUTRAL, (float) 1, (float) 1);
													} else {
														((World) world).playSound(x, y, z,
																(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																		.getValue(new ResourceLocation("block.anvil.use")),
																SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
