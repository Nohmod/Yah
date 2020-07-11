
package net.mcreator.explosivesrightthistime.item.crafting;

import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import net.minecraft.item.ItemStack;

import net.mcreator.explosivesrightthistime.item.ItemIuap;
import net.mcreator.explosivesrightthistime.item.ItemAcetone;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class RecipePropanone extends ElementsChemcraft.ModElement {
	public RecipePropanone(ElementsChemcraft instance) {
		super(instance, 62);
	}

	@Override
	public void init(FMLInitializationEvent event) {
		GameRegistry.addSmelting(new ItemStack(ItemIuap.block, (int) (1)), new ItemStack(ItemAcetone.block, (int) (1)), 1F);
	}
}
