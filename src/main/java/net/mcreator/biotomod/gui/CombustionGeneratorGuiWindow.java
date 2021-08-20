
package net.mcreator.biotomod.gui;

import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.biotomod.procedures.Rf90Procedure;
import net.mcreator.biotomod.procedures.Rf80Procedure;
import net.mcreator.biotomod.procedures.Rf70Procedure;
import net.mcreator.biotomod.procedures.Rf60Procedure;
import net.mcreator.biotomod.procedures.Rf5Procedure;
import net.mcreator.biotomod.procedures.Rf50Procedure;
import net.mcreator.biotomod.procedures.Rf40Procedure;
import net.mcreator.biotomod.procedures.Rf30Procedure;
import net.mcreator.biotomod.procedures.Rf20Procedure;
import net.mcreator.biotomod.procedures.Rf10Procedure;
import net.mcreator.biotomod.procedures.Rf100Procedure;
import net.mcreator.biotomod.procedures.Rf0Procedure;
import net.mcreator.biotomod.procedures.IfisonProcedure;

import java.util.concurrent.atomic.AtomicInteger;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class CombustionGeneratorGuiWindow extends ContainerScreen<CombustionGeneratorGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public CombustionGeneratorGuiWindow(CombustionGeneratorGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("biotomod:textures/combustion_generator.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.color4f(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		Minecraft.getInstance().getTextureManager().bindTexture(texture);
		int k = (this.width - this.xSize) / 2;
		int l = (this.height - this.ySize) / 2;
		this.blit(ms, k, l, 0, 0, this.xSize, this.ySize, this.xSize, this.ySize);
		if (IfisonProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/fire_resistance.png"));
			this.blit(ms, this.guiLeft + 78, this.guiTop + 52, 0, 0, 18, 18, 18, 18);
		}
		if (Rf0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf0.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf5Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf5.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf10Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf10.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf20Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf20.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf30Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf30.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf40Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf40.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf50Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf50.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf60Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf60.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf70Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf70.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf80Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf80.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf90Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf90.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		if (Rf100Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/rf100.png"));
			this.blit(ms, this.guiLeft + -2, this.guiTop + 43, 0, 0, 32, 32, 32, 32);
		}
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "" + (new Object() {
			public int getEnergyStored(BlockPos pos) {
				AtomicInteger _retval = new AtomicInteger(0);
				TileEntity _ent = world.getTileEntity(pos);
				if (_ent != null)
					_ent.getCapability(CapabilityEnergy.ENERGY, null).ifPresent(capability -> _retval.set(capability.getEnergyStored()));
				return _retval.get();
			}
		}.getEnergyStored(new BlockPos((int) x, (int) y, (int) z))) + "", 24, 25, -12829636);
		this.font.drawString(ms, "------", 24, 34, -12829636);
		this.font.drawString(ms, "400000", 24, 43, -12829636);
		this.font.drawString(ms, "rf:", 6, 25, -12829636);
		this.font.drawString(ms, "Combustion Generator", 33, 7, -12829636);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardListener.enableRepeatEvents(false);
	}

	@Override
	public void init(Minecraft minecraft, int width, int height) {
		super.init(minecraft, width, height);
		minecraft.keyboardListener.enableRepeatEvents(true);
	}
}
