
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

import net.mcreator.biotomod.BiotomodMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PlatinumformerhelpGuiWindow extends ContainerScreen<PlatinumformerhelpGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	public PlatinumformerhelpGuiWindow(PlatinumformerhelpGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 176;
		this.ySize = 108;
	}
	private static final ResourceLocation texture = new ResourceLocation("biotomod:textures/platinumformerhelp.png");
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
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/platium_craft.png"));
		this.blit(ms, this.guiLeft + 3, this.guiTop + 35, 0, 0, 150, 70, 150, 70);
		Minecraft.getInstance().getTextureManager().bindTexture(new ResourceLocation("biotomod:textures/platautores.png"));
		this.blit(ms, this.guiLeft + 123, this.guiTop + 18, 0, 0, 50, 50, 50, 50);
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
		this.font.drawString(ms, "The Green", 55, 3, -12829636);
		this.font.drawString(ms, "input is for", 103, 3, -12829636);
		this.font.drawString(ms, "automations with", 55, 15, -12829636);
		this.font.drawString(ms, "Platinum Automator", 34, 27, -12829636);
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
		this.addButton(new Button(this.guiLeft + 3, this.guiTop + 4, 50, 20, new StringTextComponent("Close"), e -> {
			if (true) {
				BiotomodMod.PACKET_HANDLER.sendToServer(new PlatinumformerhelpGui.ButtonPressedMessage(0, x, y, z));
				PlatinumformerhelpGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
	}
}
