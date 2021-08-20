
package net.mcreator.biotomod.gui;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.biotomod.procedures.RedstonetrueProcedure;
import net.mcreator.biotomod.procedures.RedstoneFalseProcedure;
import net.mcreator.biotomod.procedures.Progress75Procedure;
import net.mcreator.biotomod.procedures.Progress50Procedure;
import net.mcreator.biotomod.procedures.Progress25Procedure;
import net.mcreator.biotomod.procedures.Progress100Procedure;
import net.mcreator.biotomod.procedures.Progress0Procedure;
import net.mcreator.biotomod.procedures.MithrilfuraceonProcedure;
import net.mcreator.biotomod.BiotomodMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

import com.google.common.collect.ImmutableMap;

@OnlyIn(Dist.CLIENT)
public class MithrilBlastFurnaceGUIGuiWindow extends ContainerScreen<MithrilBlastFurnaceGUIGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public MithrilBlastFurnaceGUIGuiWindow(MithrilBlastFurnaceGUIGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 208;
		this.ySize = 166;
	}
	private static final ResourceLocation texture = new ResourceLocation("biotomod:textures/mithril_blast_furnace_gui.png");
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
		if (Progress100Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/progress100.png"));
			this.blit(ms, this.guiLeft + 94, this.guiTop + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Progress75Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/progress75.png"));
			this.blit(ms, this.guiLeft + 94, this.guiTop + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Progress50Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/progress50.png"));
			this.blit(ms, this.guiLeft + 94, this.guiTop + 34, 0, 0, 16, 16, 16, 16);
		}
		if (Progress25Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/progress25.png"));
			this.blit(ms, this.guiLeft + 94, this.guiTop + 34, 0, 0, 16, 16, 16, 16);
		}
		if (MithrilfuraceonProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/fire_resistance.png"));
			this.blit(ms, this.guiLeft + 40, this.guiTop + 34, 0, 0, 18, 18, 18, 18);
		}
		if (RedstonetrueProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/redstone_dust.png"));
			this.blit(ms, this.guiLeft + 11, this.guiTop + 26, 0, 0, 16, 16, 16, 16);
		}
		if (RedstoneFalseProcedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world))) {
			Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/red_off.png"));
			this.blit(ms, this.guiLeft + 11, this.guiTop + 26, 0, 0, 16, 16, 16, 16);
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
		this.font.drawString(ms, "Mithril Blast Furnace", 76, 7, -12829636);
		if (Progress0Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "0%", 94, 52, -12829636);
		if (Progress25Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "25%", 94, 52, -12829636);
		if (Progress50Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "50%", 94, 52, -12829636);
		if (Progress75Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "75%", 94, 52, -12829636);
		if (Progress100Procedure.executeProcedure(ImmutableMap.of("x", x, "y", y, "z", z, "world", world)))
			this.font.drawString(ms, "100%", 94, 52, -12829636);
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
		this.addButton(new Button(this.guiLeft + 134, this.guiTop + 56, 45, 20, new StringTextComponent("Help"), e -> {
			if (true) {
				BiotomodMod.PACKET_HANDLER.sendToServer(new MithrilBlastFurnaceGUIGui.ButtonPressedMessage(0, x, y, z));
				MithrilBlastFurnaceGUIGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 4, this.guiTop + 5, 30, 20, new StringTextComponent("V"), e -> {
			if (true) {
				BiotomodMod.PACKET_HANDLER.sendToServer(new MithrilBlastFurnaceGUIGui.ButtonPressedMessage(1, x, y, z));
				MithrilBlastFurnaceGUIGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
	}
}
