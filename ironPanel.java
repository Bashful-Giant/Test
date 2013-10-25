package BFG.M3;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ironPanel extends Item {

	public ironPanel(int par1) {
		super(par1);
		// Constructor Configuration
		setMaxStackSize(16);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("IronPlating");
	}

}

