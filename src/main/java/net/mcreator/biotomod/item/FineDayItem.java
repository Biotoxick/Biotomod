
package net.mcreator.biotomod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.biotomod.itemgroup.BiotomodItemGroup;
import net.mcreator.biotomod.BiotomodModElements;

import java.util.List;

@BiotomodModElements.ModElement.Tag
public class FineDayItem extends BiotomodModElements.ModElement {
	@ObjectHolder("biotomod:fine_day")
	public static final Item block = null;
	public FineDayItem(BiotomodModElements instance) {
		super(instance, 286);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, BiotomodModElements.sounds.get(new ResourceLocation("biotomod:fine_day")),
					new Item.Properties().group(BiotomodItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("fine_day");
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent("More on : https://soundcloud.com/biotoxick"));
		}
	}
}
