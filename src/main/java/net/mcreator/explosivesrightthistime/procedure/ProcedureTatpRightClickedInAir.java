package net.mcreator.explosivesrightthistime.procedure;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;

import net.mcreator.explosivesrightthistime.item.ItemTatp;
import net.mcreator.explosivesrightthistime.ElementsChemcraft;

@ElementsChemcraft.ModElement.Tag
public class ProcedureTatpRightClickedInAir extends ElementsChemcraft.ModElement {
	public ProcedureTatpRightClickedInAir(ElementsChemcraft instance) {
		super(instance, 72);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TatpRightClickedInAir!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure TatpRightClickedInAir!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure TatpRightClickedInAir!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure TatpRightClickedInAir!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure TatpRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (!world.isRemote) {
			world.createExplosion(null, (int) x, (int) y, (int) z, (float) 1.5, true);
		}
		if (entity instanceof EntityPlayer)
			((EntityPlayer) entity).inventory.clearMatchingItems(new ItemStack(ItemTatp.block, (int) (1)).getItem(), -1, (int) 1, null);
	}
}
