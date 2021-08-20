package net.mcreator.biotomod.procedures;

import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.energy.CapabilityEnergy;
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

import net.mcreator.biotomod.block.TitaneOreBlock;
import net.mcreator.biotomod.block.MithriloreBlock;
import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.HashMap;

@BiotomodModElements.ModElement.Tag
public class SkyoreminerupgradedUpdateTickProcedure extends BiotomodModElements.ModElement {
	public SkyoreminerupgradedUpdateTickProcedure(BiotomodModElements instance) {
		super(instance, 200);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiotomodMod.LOGGER.warn("Failed to load dependency x for procedure SkyoreminerupgradedUpdateTick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiotomodMod.LOGGER.warn("Failed to load dependency y for procedure SkyoreminerupgradedUpdateTick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiotomodMod.LOGGER.warn("Failed to load dependency z for procedure SkyoreminerupgradedUpdateTick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiotomodMod.LOGGER.warn("Failed to load dependency world for procedure SkyoreminerupgradedUpdateTick!");
			return;
		}
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			SetPercentagerfProcedure.executeProcedure($_dependencies);
		}
		{
			Map<String, Object> $_dependencies = new HashMap<>();
			$_dependencies.put("x", x);
			$_dependencies.put("y", y);
			$_dependencies.put("z", z);
			$_dependencies.put("world", world);
			RfcheckbeforedrainProcedure.executeProcedure($_dependencies);
		}
		if (((new Object() {
			public boolean getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "isOn")) == (false))) {
			if ((world.canBlockSeeSky(new BlockPos((int) x, (int) y, (int) z)))) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.COAL_ORE, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 500)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.COAL_ORE, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.COAL_ORE, (int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 500;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.LAPIS_ORE, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 500)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.LAPIS_ORE, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.LAPIS_ORE,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 500;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.REDSTONE_ORE, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 500)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.REDSTONE_ORE, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.REDSTONE_ORE,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 500;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.NETHER_QUARTZ_ORE, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 500)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
								.getItem() == new ItemStack(Blocks.NETHER_QUARTZ_ORE, (int) (1)).getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.NETHER_QUARTZ_ORE,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 500;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.CLAY, (int) (1)).getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 400)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.CLAY, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.CLAY, (int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 400;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.grass.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.grass.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.OBSIDIAN, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 750)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.OBSIDIAN, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.OBSIDIAN, (int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 750;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.IRON_ORE, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 1000)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.IRON_ORE, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.IRON_ORE, (int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 1000;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.GOLD_ORE, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 1250)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.GOLD_ORE, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.GOLD_ORE, (int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 1250;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(TitaneOreBlock.block, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 1500)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
								.getItem() == new ItemStack(TitaneOreBlock.block, (int) (1)).getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(TitaneOreBlock.block,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 1500;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.EMERALD_ORE, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 5000)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.EMERALD_ORE, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.EMERALD_ORE,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 5000;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.DIAMOND_ORE, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 7500)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.DIAMOND_ORE, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 7500;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.DIAMOND_ORE, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 7500)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.DIAMOND_ORE, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.DIAMOND_ORE,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 7500;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(MithriloreBlock.block, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 10000)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
								.getItem() == new ItemStack(MithriloreBlock.block, (int) (1)).getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(MithriloreBlock.block,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 10000;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.ANCIENT_DEBRIS, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 15000)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0)))
								.getItem() == new ItemStack(Blocks.ANCIENT_DEBRIS, (int) (1)).getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.ANCIENT_DEBRIS,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 15000;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.NETHERRACK, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 100)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.NETHERRACK, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.NETHERRACK,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 100;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.stone.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.GRAVEL, (int) (1)).getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 200)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.GRAVEL, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.GRAVEL, (int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 200;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.gravel.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.gravel.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.SAND, (int) (1)).getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 200)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.SAND, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.SAND, (int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 200;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.sand.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.sand.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1))).getItem() == new ItemStack(Blocks.GRASS_BLOCK, (int) (1))
						.getItem())) {
					if (((new Object() {
						public int getEnergyStored(IWorld world, BlockPos pos) {
							AtomicInteger _retval = new AtomicInteger(0);
							TileEntity _ent = world.getTileEntity(pos);
							if (_ent != null)
								_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
							return _retval.get();
						}
					}.getEnergyStored(world, new BlockPos((int) x, (int) y, (int) z))) >= 200)) {
						if ((((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.GRASS_BLOCK, (int) (1))
								.getItem()) || ((new Object() {
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
								}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
										.getItem()))) {
							if (((new Object() {
								public int getAmount(IWorld world, BlockPos pos, int sltid) {
									AtomicInteger _retval = new AtomicInteger(0);
									TileEntity _ent = world.getTileEntity(pos);
									if (_ent != null) {
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											_retval.set(capability.getStackInSlot(sltid).getCount());
										});
									}
									return _retval.get();
								}
							}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (0))) <= 63)) {
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
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (0);
																				final ItemStack _setstack = new ItemStack(Blocks.GRASS_BLOCK,
																						(int) (1));
																				_setstack.setCount((int) ((new Object() {
																					public int getAmount(IWorld world, BlockPos pos, int sltid) {
																						AtomicInteger _retval = new AtomicInteger(0);
																						TileEntity _ent = world.getTileEntity(pos);
																						if (_ent != null) {
																							_ent.getCapability(
																									CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																									null).ifPresent(capability -> {
																										_retval.set(capability.getStackInSlot(sltid)
																												.getCount());
																									});
																						}
																						return _retval.get();
																					}
																				}.getAmount(world, new BlockPos((int) x, (int) y, (int) z),
																						(int) (0))) + 1));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			int _amount = (int) 200;
																			if (_ent != null)
																				_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(
																						capability -> capability.extractEnergy(_amount, false));
																		}
																		if (world instanceof World && !world.isRemote()) {
																			((World) world).playSound(null, new BlockPos((int) x, (int) y, (int) z),
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.grass.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1);
																		} else {
																			((World) world).playSound(x, y, z,
																					(net.minecraft.util.SoundEvent) ForgeRegistries.SOUND_EVENTS
																							.getValue(new ResourceLocation("block.grass.break")),
																					SoundCategory.NEUTRAL, (float) 1, (float) 1, false);
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
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 10);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 20);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 20);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 20);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						}
					}
				}
			}
		}
	}
}
