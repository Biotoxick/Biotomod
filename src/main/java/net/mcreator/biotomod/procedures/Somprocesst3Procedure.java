package net.mcreator.biotomod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;

@BiotomodModElements.ModElement.Tag
public class Somprocesst3Procedure extends BiotomodModElements.ModElement {
	public Somprocesst3Procedure(BiotomodModElements instance) {
		super(instance, 207);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiotomodMod.LOGGER.warn("Failed to load dependency x for procedure Somprocesst3!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiotomodMod.LOGGER.warn("Failed to load dependency y for procedure Somprocesst3!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiotomodMod.LOGGER.warn("Failed to load dependency z for procedure Somprocesst3!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiotomodMod.LOGGER.warn("Failed to load dependency world for procedure Somprocesst3!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (!world.isRemote()) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			TileEntity _tileEntity = world.getTileEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_tileEntity != null)
				_tileEntity.getTileData().putDouble("cost", 2000);
			if (world instanceof World)
				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
		}
		if (!world.isRemote()) {
			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
			TileEntity _tileEntity = world.getTileEntity(_bp);
			BlockState _bs = world.getBlockState(_bp);
			if (_tileEntity != null)
				_tileEntity.getTileData().putBoolean("isOn", (true));
			if (world instanceof World)
				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
		}
		new Object() {
			private int ticks = 0;
			private float waitTicks;
			private IWorld world;
			public void start(IWorld world, int waitTicks) {
				this.waitTicks = waitTicks;
				MinecraftForge.EVENT_BUS.register(this);
				this.world = world;
			}

			@SubscribeEvent
			public void tick(TickEvent.ServerTickEvent event) {
				if (event.phase == TickEvent.Phase.END) {
					this.ticks += 1;
					if (this.ticks >= this.waitTicks)
						run();
				}
			}

			private void run() {
				if ((!((new Object() {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))) {
					if ((((new Object() {
						public boolean getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "needredstone")) == (false)) || (((new Object() {
						public boolean getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "needredstone")) == (true)) && ((new Object() {
						public boolean getValue(IWorld world, BlockPos pos, String tag) {
							TileEntity tileEntity = world.getTileEntity(pos);
							if (tileEntity != null)
								return tileEntity.getTileData().getBoolean(tag);
							return false;
						}
					}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "go")) == (true))))) {
						if (!world.isRemote()) {
							BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
							TileEntity _tileEntity = world.getTileEntity(_bp);
							BlockState _bs = world.getBlockState(_bp);
							if (_tileEntity != null)
								_tileEntity.getTileData().putDouble("progress", 25);
							if (world instanceof World)
								((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
						}
						new Object() {
							private int ticks = 0;
							private float waitTicks;
							private IWorld world;
							public void start(IWorld world, int waitTicks) {
								this.waitTicks = waitTicks;
								MinecraftForge.EVENT_BUS.register(this);
								this.world = world;
							}

							@SubscribeEvent
							public void tick(TickEvent.ServerTickEvent event) {
								if (event.phase == TickEvent.Phase.END) {
									this.ticks += 1;
									if (this.ticks >= this.waitTicks)
										run();
								}
							}

							private void run() {
								if ((!((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
									if ((((new Object() {
										public boolean getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getBoolean(tag);
											return false;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "needredstone")) == (false)) || (((new Object() {
										public boolean getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getBoolean(tag);
											return false;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "needredstone")) == (true)) && ((new Object() {
										public boolean getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getBoolean(tag);
											return false;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "go")) == (true))))) {
										if (!world.isRemote()) {
											BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
											TileEntity _tileEntity = world.getTileEntity(_bp);
											BlockState _bs = world.getBlockState(_bp);
											if (_tileEntity != null)
												_tileEntity.getTileData().putDouble("progress", 50);
											if (world instanceof World)
												((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
										}
										new Object() {
											private int ticks = 0;
											private float waitTicks;
											private IWorld world;
											public void start(IWorld world, int waitTicks) {
												this.waitTicks = waitTicks;
												MinecraftForge.EVENT_BUS.register(this);
												this.world = world;
											}

											@SubscribeEvent
											public void tick(TickEvent.ServerTickEvent event) {
												if (event.phase == TickEvent.Phase.END) {
													this.ticks += 1;
													if (this.ticks >= this.waitTicks)
														run();
												}
											}

											private void run() {
												if ((!((new Object() {
													public ItemStack getItemStack(BlockPos pos, int sltid) {
														AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
														TileEntity _ent = world.getTileEntity(pos);
														if (_ent != null) {
															_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																	.ifPresent(capability -> {
																		_retval.set(capability.getStackInSlot(sltid).copy());
																	});
														}
														return _retval.get();
													}
												}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
														.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))) {
													if ((((new Object() {
														public boolean getValue(IWorld world, BlockPos pos, String tag) {
															TileEntity tileEntity = world.getTileEntity(pos);
															if (tileEntity != null)
																return tileEntity.getTileData().getBoolean(tag);
															return false;
														}
													}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "needredstone")) == (false))
															|| (((new Object() {
																public boolean getValue(IWorld world, BlockPos pos, String tag) {
																	TileEntity tileEntity = world.getTileEntity(pos);
																	if (tileEntity != null)
																		return tileEntity.getTileData().getBoolean(tag);
																	return false;
																}
															}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "needredstone")) == (true))
																	&& ((new Object() {
																		public boolean getValue(IWorld world, BlockPos pos, String tag) {
																			TileEntity tileEntity = world.getTileEntity(pos);
																			if (tileEntity != null)
																				return tileEntity.getTileData().getBoolean(tag);
																			return false;
																		}
																	}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "go")) == (true))))) {
														if (!world.isRemote()) {
															BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
															TileEntity _tileEntity = world.getTileEntity(_bp);
															BlockState _bs = world.getBlockState(_bp);
															if (_tileEntity != null)
																_tileEntity.getTileData().putDouble("progress", 75);
															if (world instanceof World)
																((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
														}
														new Object() {
															private int ticks = 0;
															private float waitTicks;
															private IWorld world;
															public void start(IWorld world, int waitTicks) {
																this.waitTicks = waitTicks;
																MinecraftForge.EVENT_BUS.register(this);
																this.world = world;
															}

															@SubscribeEvent
															public void tick(TickEvent.ServerTickEvent event) {
																if (event.phase == TickEvent.Phase.END) {
																	this.ticks += 1;
																	if (this.ticks >= this.waitTicks)
																		run();
																}
															}

															private void run() {
																if ((!((new Object() {
																	public ItemStack getItemStack(BlockPos pos, int sltid) {
																		AtomicReference<ItemStack> _retval = new AtomicReference<>(ItemStack.EMPTY);
																		TileEntity _ent = world.getTileEntity(pos);
																		if (_ent != null) {
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						_retval.set(capability.getStackInSlot(sltid).copy());
																					});
																		}
																		return _retval.get();
																	}
																}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
																		.getItem() == new ItemStack(Blocks.AIR, (int) (1)).getItem()))) {
																	if ((((new Object() {
																		public boolean getValue(IWorld world, BlockPos pos, String tag) {
																			TileEntity tileEntity = world.getTileEntity(pos);
																			if (tileEntity != null)
																				return tileEntity.getTileData().getBoolean(tag);
																			return false;
																		}
																	}.getValue(world, new BlockPos((int) x, (int) y, (int) z),
																			"needredstone")) == (false)) || (((new Object() {
																				public boolean getValue(IWorld world, BlockPos pos, String tag) {
																					TileEntity tileEntity = world.getTileEntity(pos);
																					if (tileEntity != null)
																						return tileEntity.getTileData().getBoolean(tag);
																					return false;
																				}
																			}.getValue(world, new BlockPos((int) x, (int) y, (int) z),
																					"needredstone")) == (true)) && ((new Object() {
																						public boolean getValue(IWorld world, BlockPos pos,
																								String tag) {
																							TileEntity tileEntity = world.getTileEntity(pos);
																							if (tileEntity != null)
																								return tileEntity.getTileData().getBoolean(tag);
																							return false;
																						}
																					}.getValue(world, new BlockPos((int) x, (int) y, (int) z),
																							"go")) == (true))))) {
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putDouble("progress", 100);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		new Object() {
																			private int ticks = 0;
																			private float waitTicks;
																			private IWorld world;
																			public void start(IWorld world, int waitTicks) {
																				this.waitTicks = waitTicks;
																				MinecraftForge.EVENT_BUS.register(this);
																				this.world = world;
																			}

																			@SubscribeEvent
																			public void tick(TickEvent.ServerTickEvent event) {
																				if (event.phase == TickEvent.Phase.END) {
																					this.ticks += 1;
																					if (this.ticks >= this.waitTicks)
																						run();
																				}
																			}

																			private void run() {
																				if (world instanceof World && !world.isRemote()) {
																					((World) world).playSound(null,
																							new BlockPos((int) x, (int) y, (int) z),
																							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																									.getValue(new ResourceLocation(
																											"block.stone.break")),
																							SoundCategory.NEUTRAL, (float) 0.5, (float) 1);
																				} else {
																					((World) world).playSound(x, y, z,
																							(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																									.getValue(new ResourceLocation(
																											"block.stone.break")),
																							SoundCategory.NEUTRAL, (float) 0.5, (float) 1, false);
																				}
																				if (!world.isRemote()) {
																					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																					TileEntity _tileEntity = world.getTileEntity(_bp);
																					BlockState _bs = world.getBlockState(_bp);
																					if (_tileEntity != null)
																						_tileEntity.getTileData().putDouble("progress", 0);
																					if (world instanceof World)
																						((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																				}
																				if (!world.isRemote()) {
																					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																					TileEntity _tileEntity = world.getTileEntity(_bp);
																					BlockState _bs = world.getBlockState(_bp);
																					if (_tileEntity != null)
																						_tileEntity.getTileData().putDouble("running", 0);
																					if (world instanceof World)
																						((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																				}
																				if (!world.isRemote()) {
																					BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																					TileEntity _tileEntity = world.getTileEntity(_bp);
																					BlockState _bs = world.getBlockState(_bp);
																					if (_tileEntity != null)
																						_tileEntity.getTileData().putBoolean("isOn", (false));
																					if (world instanceof World)
																						((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																				}
																				{
																					TileEntity _ent = world
																							.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																					if (_ent != null) {
																						final int _sltid = (int) (0);
																						final ItemStack _setstack = (new Object() {
																							public ItemStack getItemStack(BlockPos pos, int sltid) {
																								AtomicReference<ItemStack> _retval = new AtomicReference<>(
																										ItemStack.EMPTY);
																								TileEntity _ent = world.getTileEntity(pos);
																								if (_ent != null) {
																									_ent.getCapability(
																											CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																											null).ifPresent(capability -> {
																												_retval.set(capability
																														.getStackInSlot(sltid)
																														.copy());
																											});
																								}
																								return _retval.get();
																							}
																						}.getItemStack(new BlockPos((int) x, (int) y, (int) z),
																								(int) (1)));
																						_setstack.setCount((int) ((new Object() {
																							public int getAmount(IWorld world, BlockPos pos,
																									int sltid) {
																								AtomicInteger _retval = new AtomicInteger(0);
																								TileEntity _ent = world.getTileEntity(pos);
																								if (_ent != null) {
																									_ent.getCapability(
																											CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																											null).ifPresent(capability -> {
																												_retval.set(capability
																														.getStackInSlot(sltid)
																														.getCount());
																											});
																								}
																								return _retval.get();
																							}
																						}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																								(int) (0))) + 1));
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									if (capability instanceof IItemHandlerModifiable) {
																										((IItemHandlerModifiable) capability)
																												.setStackInSlot(_sltid, _setstack);
																									}
																								});
																					}
																				}
																				MinecraftForge.EVENT_BUS.unregister(this);
																			}
																		}.start(world, (int) 10);
																	}
																} else {
																	if (!world.isRemote()) {
																		BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																		TileEntity _tileEntity = world.getTileEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_tileEntity != null)
																			_tileEntity.getTileData().putDouble("progress", 0);
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	if (!world.isRemote()) {
																		BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																		TileEntity _tileEntity = world.getTileEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_tileEntity != null)
																			_tileEntity.getTileData().putDouble("running", 0);
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	if (!world.isRemote()) {
																		BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																		TileEntity _tileEntity = world.getTileEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_tileEntity != null)
																			_tileEntity.getTileData().putBoolean("isOn", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																}
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 35);
													}
												} else {
													if (!world.isRemote()) {
														BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
														TileEntity _tileEntity = world.getTileEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_tileEntity != null)
															_tileEntity.getTileData().putDouble("progress", 0);
														if (world instanceof World)
															((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
													}
													if (!world.isRemote()) {
														BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
														TileEntity _tileEntity = world.getTileEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_tileEntity != null)
															_tileEntity.getTileData().putDouble("running", 0);
														if (world instanceof World)
															((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
													}
													if (!world.isRemote()) {
														BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
														TileEntity _tileEntity = world.getTileEntity(_bp);
														BlockState _bs = world.getBlockState(_bp);
														if (_tileEntity != null)
															_tileEntity.getTileData().putBoolean("isOn", (false));
														if (world instanceof World)
															((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
													}
												}
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 35);
									}
								} else {
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putDouble("progress", 0);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putDouble("running", 0);
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
									if (!world.isRemote()) {
										BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
										TileEntity _tileEntity = world.getTileEntity(_bp);
										BlockState _bs = world.getBlockState(_bp);
										if (_tileEntity != null)
											_tileEntity.getTileData().putBoolean("isOn", (false));
										if (world instanceof World)
											((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
									}
								}
								MinecraftForge.EVENT_BUS.unregister(this);
							}
						}.start(world, (int) 35);
					}
				} else {
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("running", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putDouble("progress", 0);
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
					if (!world.isRemote()) {
						BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
						TileEntity _tileEntity = world.getTileEntity(_bp);
						BlockState _bs = world.getBlockState(_bp);
						if (_tileEntity != null)
							_tileEntity.getTileData().putBoolean("isOn", (false));
						if (world instanceof World)
							((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
					}
				}
				MinecraftForge.EVENT_BUS.unregister(this);
			}
		}.start(world, (int) 35);
	}
}
