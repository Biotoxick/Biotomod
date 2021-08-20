package net.mcreator.biotomod.procedures;

import net.minecraftforge.items.IItemHandlerModifiable;
import net.minecraftforge.items.CapabilityItemHandler;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Blocks;
import net.minecraft.block.BlockState;

import net.mcreator.biotomod.item.TitaneIngotItem;
import net.mcreator.biotomod.item.PlatiniumShardItem;
import net.mcreator.biotomod.item.OiledwooditemItem;
import net.mcreator.biotomod.item.MithrilIngotItem;
import net.mcreator.biotomod.block.TitaneOreBlock;
import net.mcreator.biotomod.block.PlatiniumOreBlock;
import net.mcreator.biotomod.block.MithriloreBlock;
import net.mcreator.biotomod.BiotomodModElements;
import net.mcreator.biotomod.BiotomodMod;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Map;
import java.util.HashMap;

@BiotomodModElements.ModElement.Tag
public class MbfupupdatetickProcedure extends BiotomodModElements.ModElement {
	public MbfupupdatetickProcedure(BiotomodModElements instance) {
		super(instance, 227);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				BiotomodMod.LOGGER.warn("Failed to load dependency x for procedure Mbfupupdatetick!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				BiotomodMod.LOGGER.warn("Failed to load dependency y for procedure Mbfupupdatetick!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				BiotomodMod.LOGGER.warn("Failed to load dependency z for procedure Mbfupupdatetick!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				BiotomodMod.LOGGER.warn("Failed to load dependency world for procedure Mbfupupdatetick!");
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
			StopifinactivemithrilbfProcedure.executeProcedure($_dependencies);
		}
		if (((new Object() {
			public boolean getValue(IWorld world, BlockPos pos, String tag) {
				TileEntity tileEntity = world.getTileEntity(pos);
				if (tileEntity != null)
					return tileEntity.getTileData().getBoolean(tag);
				return false;
			}
		}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "mithrilfurnaceON")) == (false))) {
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.IRON_ORE, (int) (1)).getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.IRON_INGOT, (int) (1)).getItem())
						|| ((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 63)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(Items.IRON_INGOT,
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
																						(int) (2))) + 2));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 20);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 15);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 15);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 15);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 15);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(Items.IRON_INGOT, (int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 2));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 20);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 15);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 15);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 15);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 15);
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.REDSTONE_ORE, (int) (1))
					.getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.REDSTONE, (int) (1)).getItem())
						|| ((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 49)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(Items.REDSTONE, (int) (1));
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
																						(int) (2))) + 16));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 20);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 15);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 15);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 15);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 15);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(Items.REDSTONE, (int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 16));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 20);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 15);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 15);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 15);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 15);
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.LAPIS_ORE, (int) (1)).getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.LAPIS_LAZULI, (int) (1))
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 49)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI,
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
																						(int) (2))) + 16));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 20);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 15);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 15);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 15);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 15);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(Items.LAPIS_LAZULI, (int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 16));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 20);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 15);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 15);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 15);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 15);
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.GOLD_ORE, (int) (1)).getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.GOLD_INGOT, (int) (1)).getItem())
						|| ((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 63)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(Items.GOLD_INGOT,
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
																						(int) (2))) + 2));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
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
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(Items.GOLD_INGOT, (int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 2));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.EMERALD_ORE, (int) (1))
					.getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.EMERALD, (int) (1)).getItem())
						|| ((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 62)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
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
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putDouble("combustible", 15);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		{
																			TileEntity _ent = world
																					.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																			if (_ent != null) {
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(Items.EMERALD, (int) (1));
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
																						(int) (2))) + 3));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 20);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 25);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 25);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 25);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 25);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
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
																	if (!world.isRemote()) {
																		BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																		TileEntity _tileEntity = world.getTileEntity(_bp);
																		BlockState _bs = world.getBlockState(_bp);
																		if (_tileEntity != null)
																			_tileEntity.getTileData().putDouble("combustible", ((new Object() {
																				public double getValue(IWorld world, BlockPos pos, String tag) {
																					TileEntity tileEntity = world.getTileEntity(pos);
																					if (tileEntity != null)
																						return tileEntity.getTileData().getDouble(tag);
																					return -1;
																				}
																			}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible"))
																					- 1));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	{
																		TileEntity _ent = world
																				.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
																		if (_ent != null) {
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(Items.EMERALD, (int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 3));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 20);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 25);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 25);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 25);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 25);
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.DIAMOND_ORE, (int) (1))
					.getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.DIAMOND, (int) (1)).getItem())
						|| ((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 62)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(Items.DIAMOND, (int) (1));
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
																						(int) (2))) + 3));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 20);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 25);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 25);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 25);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 25);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(Items.DIAMOND, (int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 3));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 20);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 25);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 25);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 25);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 25);
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.ANCIENT_DEBRIS, (int) (1))
					.getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.NETHERITE_SCRAP, (int) (1))
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 63)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP,
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
																						(int) (2))) + 2));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 20);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 25);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 25);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 25);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 25);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(Items.NETHERITE_SCRAP,
																					(int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 2));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 20);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 25);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 25);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 25);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 25);
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(TitaneOreBlock.block, (int) (1))
					.getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(TitaneIngotItem.block, (int) (1))
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 63)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(TitaneIngotItem.block,
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
																						(int) (2))) + 2));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
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
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(TitaneIngotItem.block,
																					(int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 2));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(MithriloreBlock.block, (int) (1))
					.getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(MithrilIngotItem.block, (int) (1))
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 63)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(MithrilIngotItem.block,
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
																						(int) (2))) + 2));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 20);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 25);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 25);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 25);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 25);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(MithrilIngotItem.block,
																					(int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 2));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
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
															}.start(world, (int) 20);
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
																	_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																if (world instanceof World)
																	((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
															}
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 25);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 25);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 25);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 25);
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(PlatiniumOreBlock.block, (int) (1))
					.getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(PlatiniumShardItem.block, (int) (1))
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 60)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(PlatiniumShardItem.block,
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
																						(int) (2))) + 5));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
																		MinecraftForge.EVENT_BUS.unregister(this);
																	}
																}.start(world, (int) 20);
																MinecraftForge.EVENT_BUS.unregister(this);
															}
														}.start(world, (int) 50);
														MinecraftForge.EVENT_BUS.unregister(this);
													}
												}.start(world, (int) 50);
												MinecraftForge.EVENT_BUS.unregister(this);
											}
										}.start(world, (int) 50);
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 50);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(PlatiniumShardItem.block,
																					(int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 5));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
																	MinecraftForge.EVENT_BUS.unregister(this);
																}
															}.start(world, (int) 20);
															MinecraftForge.EVENT_BUS.unregister(this);
														}
													}.start(world, (int) 50);
													MinecraftForge.EVENT_BUS.unregister(this);
												}
											}.start(world, (int) 50);
											MinecraftForge.EVENT_BUS.unregister(this);
										}
									}.start(world, (int) 50);
									MinecraftForge.EVENT_BUS.unregister(this);
								}
							}.start(world, (int) 50);
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.NETHER_QUARTZ_ORE, (int) (1))
					.getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.QUARTZ, (int) (1)).getItem())
						|| ((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 49)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(Items.QUARTZ, (int) (1));
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
																						(int) (2))) + 16));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
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
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(Items.QUARTZ, (int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 16));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
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
			}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (0))).getItem() == new ItemStack(Blocks.COAL_ORE, (int) (1)).getItem())) {
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
				}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Items.COAL, (int) (1)).getItem())
						|| ((new Object() {
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
						}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (2))).getItem() == new ItemStack(Blocks.AIR, (int) (1))
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
					}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2))) < 57)) {
						if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) == 0)) {
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
							}.getItemStack(new BlockPos((int) x, (int) y, (int) z), (int) (1)))
									.getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())) {
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
									if (world instanceof World)
										((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
								}
								{
									TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
									if (_ent != null) {
										final int _sltid = (int) (0);
										final int _amount = (int) 1;
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
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
										_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
											if (capability instanceof IItemHandlerModifiable) {
												ItemStack _stk = capability.getStackInSlot(_sltid).copy();
												_stk.shrink(_amount);
												((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
											}
										});
									}
								}
								if (!world.isRemote()) {
									BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
									TileEntity _tileEntity = world.getTileEntity(_bp);
									BlockState _bs = world.getBlockState(_bp);
									if (_tileEntity != null)
										_tileEntity.getTileData().putDouble("combustible", 15);
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
																				final int _sltid = (int) (2);
																				final ItemStack _setstack = new ItemStack(Items.COAL, (int) (1));
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
																						(int) (2))) + 8));
																				_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY,
																						null).ifPresent(capability -> {
																							if (capability instanceof IItemHandlerModifiable) {
																								((IItemHandlerModifiable) capability)
																										.setStackInSlot(_sltid, _setstack);
																							}
																						});
																			}
																		}
																		if (!world.isRemote()) {
																			BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
																			TileEntity _tileEntity = world.getTileEntity(_bp);
																			BlockState _bs = world.getBlockState(_bp);
																			if (_tileEntity != null)
																				_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
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
																				_tileEntity.getTileData().putDouble("running", 0);
																			if (world instanceof World)
																				((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																		}
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
										MinecraftForge.EVENT_BUS.unregister(this);
									}
								}.start(world, (int) 20);
							}
						} else if (((new Object() {
							public double getValue(IWorld world, BlockPos pos, String tag) {
								TileEntity tileEntity = world.getTileEntity(pos);
								if (tileEntity != null)
									return tileEntity.getTileData().getDouble(tag);
								return -1;
							}
						}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) >= 1)) {
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (true));
								if (world instanceof World)
									((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
							}
							{
								TileEntity _ent = world.getTileEntity(new BlockPos((int) x, (int) y, (int) z));
								if (_ent != null) {
									final int _sltid = (int) (0);
									final int _amount = (int) 1;
									_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null).ifPresent(capability -> {
										if (capability instanceof IItemHandlerModifiable) {
											ItemStack _stk = capability.getStackInSlot(_sltid).copy();
											_stk.shrink(_amount);
											((IItemHandlerModifiable) capability).setStackInSlot(_sltid, _stk);
										}
									});
								}
							}
							if (!world.isRemote()) {
								BlockPos _bp = new BlockPos((int) x, (int) y, (int) z);
								TileEntity _tileEntity = world.getTileEntity(_bp);
								BlockState _bs = world.getBlockState(_bp);
								if (_tileEntity != null)
									_tileEntity.getTileData().putDouble("combustible", ((new Object() {
										public double getValue(IWorld world, BlockPos pos, String tag) {
											TileEntity tileEntity = world.getTileEntity(pos);
											if (tileEntity != null)
												return tileEntity.getTileData().getDouble(tag);
											return -1;
										}
									}.getValue(world, new BlockPos((int) x, (int) y, (int) z), "combustible")) - 1));
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
																			final int _sltid = (int) (2);
																			final ItemStack _setstack = new ItemStack(Items.COAL, (int) (1));
																			_setstack.setCount((int) ((new Object() {
																				public int getAmount(IWorld world, BlockPos pos, int sltid) {
																					AtomicInteger _retval = new AtomicInteger(0);
																					TileEntity _ent = world.getTileEntity(pos);
																					if (_ent != null) {
																						_ent.getCapability(
																								CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																								.ifPresent(capability -> {
																									_retval.set(capability.getStackInSlot(sltid)
																											.getCount());
																								});
																					}
																					return _retval.get();
																				}
																			}.getAmount(world, new BlockPos((int) x, (int) y, (int) z), (int) (2)))
																					+ 8));
																			_ent.getCapability(CapabilityItemHandler.ITEM_HANDLER_CAPABILITY, null)
																					.ifPresent(capability -> {
																						if (capability instanceof IItemHandlerModifiable) {
																							((IItemHandlerModifiable) capability)
																									.setStackInSlot(_sltid, _setstack);
																						}
																					});
																		}
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
																			_tileEntity.getTileData().putBoolean("mithrilfurnaceON", (false));
																		if (world instanceof World)
																			((World) world).notifyBlockUpdate(_bp, _bs, _bs, 3);
																	}
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
