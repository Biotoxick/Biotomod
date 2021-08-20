
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
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.client.Minecraft;

import net.mcreator.biotomod.BiotomodMod;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.matrix.MatrixStack;

@OnlyIn(Dist.CLIENT)
public class PortableTeleporterGuiWindow extends ContainerScreen<PortableTeleporterGui.GuiContainerMod> {
	private World world;
	private int x, y, z;
	private PlayerEntity entity;
	TextFieldWidget Rename;
	public PortableTeleporterGuiWindow(PortableTeleporterGui.GuiContainerMod container, PlayerInventory inventory, ITextComponent text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.xSize = 200;
		this.ySize = 168;
	}
	private static final ResourceLocation texture = new ResourceLocation("biotomod:textures/portable_teleporter.png");
	@Override
	public void render(MatrixStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderHoveredTooltip(ms, mouseX, mouseY);
		Rename.render(ms, mouseX, mouseY, partialTicks);
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
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeScreen();
			return true;
		}
		if (Rename.isFocused())
			return Rename.keyPressed(key, b, c);
		return super.keyPressed(key, b, c);
	}

	@Override
	public void tick() {
		super.tick();
		Rename.tick();
	}

	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack ms, int mouseX, int mouseY) {
		this.font.drawString(ms, "Portable Teleporter", 9, 8, -12566464);
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
		this.addButton(new Button(this.guiLeft + 135, this.guiTop + 31, 40, 20, new StringTextComponent("TP"), e -> {
			if (true) {
				BiotomodMod.PACKET_HANDLER.sendToServer(new PortableTeleporterGui.ButtonPressedMessage(0, x, y, z));
				PortableTeleporterGui.handleButtonAction(entity, 0, x, y, z);
			}
		}));
		Rename = new TextFieldWidget(this.font, this.guiLeft + 9, this.guiTop + 53, 120, 20, new StringTextComponent(""));
		PortableTeleporterGui.guistate.put("text:Rename", Rename);
		Rename.setMaxStringLength(32767);
		this.children.add(this.Rename);
		this.addButton(new Button(this.guiLeft + 135, this.guiTop + 53, 55, 20, new StringTextComponent("Rename"), e -> {
			if (true) {
				BiotomodMod.PACKET_HANDLER.sendToServer(new PortableTeleporterGui.ButtonPressedMessage(1, x, y, z));
				PortableTeleporterGui.handleButtonAction(entity, 1, x, y, z);
			}
		}));
		this.addButton(new Button(this.guiLeft + 135, this.guiTop + 9, 30, 20, new StringTextComponent("?"), e -> {
			if (true) {
				BiotomodMod.PACKET_HANDLER.sendToServer(new PortableTeleporterGui.ButtonPressedMessage(2, x, y, z));
				PortableTeleporterGui.handleButtonAction(entity, 2, x, y, z);
			}
		}));
	}
}
