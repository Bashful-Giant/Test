package BFG.M3;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;

public class uraniumOre extends Block 
{
        public uraniumOre(int id, Material material) 
        {
                super(id, material);
                
                setHardness(3.0F);
                setStepSound(Block.soundStoneFootstep);
                setUnlocalizedName("uraniumOre");
                setCreativeTab(CreativeTabs.tabBlock);
        }
        public int idDropped(int par1, Random random, int zero) {
            return M3.uraniumitem.itemID;  
            
       
           
            
    }
}