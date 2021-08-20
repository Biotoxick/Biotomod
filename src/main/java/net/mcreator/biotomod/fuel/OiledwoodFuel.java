
package net.mcreator.biotomod.fuel;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.item.ItemStack;

import net.mcreator.biotomod.item.OiledwooditemItem;
import net.mcreator.biotomod.BiotomodModElements;

@BiotomodModElements.ModElement.Tag
public class OiledwoodFuel extends BiotomodModElements.ModElement {
	public OiledwoodFuel(BiotomodModElements instance) {
		super(instance, 120);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == new ItemStack(OiledwooditemItem.block, (int) (1)).getItem())
			event.setBurnTime(3200);
	}
}
