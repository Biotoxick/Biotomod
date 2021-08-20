
package net.mcreator.biotomod.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.biotomod.itemgroup.BiotomodItemGroup;
import net.mcreator.biotomod.BiotomodModElements;

@BiotomodModElements.ModElement.Tag
public class PlatinumAxeItem extends BiotomodModElements.ModElement {
	@ObjectHolder("biotomod:platinum_axe")
	public static final Item block = null;
	public PlatinumAxeItem(BiotomodModElements instance) {
		super(instance, 171);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 2500;
			}

			public float getEfficiency() {
				return 16f;
			}

			public float getAttackDamage() {
				return 11f;
			}

			public int getHarvestLevel() {
				return 4;
			}

			public int getEnchantability() {
				return 30;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(PlatiniumShardItem.block, (int) (1)));
			}
		}, 1, -3.2f, new Item.Properties().group(BiotomodItemGroup.tab)) {
		}.setRegistryName("platinum_axe"));
	}
}
