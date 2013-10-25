package BFG.M3;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;

public class reinforcedObsidian extends Block
{
         public reinforcedObsidian(int id, Material material)
     {
             super(id, material);
                                    
                setHardness(60.0F);
                setResistance(4000.0F);
                setStepSound(soundStoneFootstep);
                setUnlocalizedName("obsidian");
                setTextureName("obsidian");
                setCreativeTab(CreativeTabs.tabBlock);
        }

}
