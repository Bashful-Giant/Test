package BFG.M3;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class irradiantDiamond extends Item {

	public irradiantDiamond(int par1) {
		super(par1);
		// Constructor Configuration
		setMaxStackSize(64);
		setCreativeTab(CreativeTabs.tabMaterials);
		setUnlocalizedName("irradiantDiamond");
	}

}
