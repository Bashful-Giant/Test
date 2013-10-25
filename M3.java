package BFG.M3;

//Let the imports BEGIN!
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.EventHandler; 
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;


@Mod(modid="MMM", name="Mob Mod Mob", version="0.0.1")
@NetworkMod(clientSideRequired=true)
public class M3 {
	
	
        @Instance(value = "MMM")
        public static M3 instance;
        //Event Manager (WorldGen and whatnot)
        EventManager eventmanager = new EventManager();
        //List of new items
        public final static Block uraniumOre = new uraniumOre(2550, Material.rock);
        public static Item uraniumitem = new uraniumitem (2551).setTextureName("m3:uraniumitem");
        public static Item uraniumNugget = new uraniumNugget(2552).setTextureName("m3:uraniumNugget");
        public static Item irradiantDiamond = new irradiantDiamond(2553).setTextureName("m3:IrradiantDiamond");
        public static Item ironPanel = new ironPanel(2554).setTextureName("m3:IronPanel");
        public static Block reinforcedObsidian = new reinforcedObsidian(2555, Material.rock).setTextureName("m3:reinforcedObsidian");
        
        
        
        // Says where the client and server 'proxy' code is loaded.
        @SidedProxy(clientSide="BFG.M3.client.ClientProxy", serverSide="BFG.M3.CommonProxy")
        public static CommonProxy proxy;

        
        
        
        @EventHandler
        public void preInit(FMLPreInitializationEvent event) {
                // Stub Method
        }
       
        @EventHandler
         public void load(FMLInitializationEvent event) {
        	//New items    	        			
        	LanguageRegistry.addName(uraniumitem, "Uranium");
        	LanguageRegistry.addName(uraniumNugget, "Uranium Nugget");
        	LanguageRegistry.addName(irradiantDiamond, "Irradiant Diamond");
        	LanguageRegistry.addName(ironPanel, "Iron Panel");
        	
        	//New blocks
        	LanguageRegistry.addName(reinforcedObsidian, "Reinforced Obsidian");
        	MinecraftForge.setBlockHarvestLevel(reinforcedObsidian, "pickaxe", 3);
        	GameRegistry.registerBlock(reinforcedObsidian, "reinforcedObsidian");
      
        	//New ores 	
        	LanguageRegistry.addName(uraniumOre, "Uranium Ore");
        	MinecraftForge.setBlockHarvestLevel(uraniumOre, "pickaxe", 2);
        	GameRegistry.registerBlock(uraniumOre, "uraniumOre");
        	GameRegistry.registerWorldGenerator(eventmanager);
        	
        	
        	//Crafting recipes
        	ItemStack uraniumStack = new ItemStack(uraniumitem);
        	ItemStack uraniumNuggetStack = new ItemStack(uraniumNugget);
        	ItemStack uraniumNuggetStack9 = new ItemStack(uraniumNugget, 9);
        	ItemStack irradiantDiamondStack = new ItemStack(irradiantDiamond);
        	ItemStack ironStack = new ItemStack(Item.ingotIron);
        	ItemStack diamondStack = new ItemStack(Item.diamond);
        	ItemStack reinforcedObsidianStack = new ItemStack(reinforcedObsidian);
        	ItemStack obsidianStack = new ItemStack(Block.obsidian);
        	ItemStack ironPanelStack1 = new ItemStack(ironPanel);
        	ItemStack ironPanelStack2 = new ItemStack(ironPanel, 2);
        	
        	//Uranium nuggets -> Uranium
        	GameRegistry.addShapelessRecipe(uraniumStack, uraniumNuggetStack, uraniumNuggetStack, uraniumNuggetStack, uraniumNuggetStack, uraniumNuggetStack, uraniumNuggetStack, uraniumNuggetStack, uraniumNuggetStack, uraniumNuggetStack );
        	//uranium -> 9 Uranium Nuggets
        	GameRegistry.addShapelessRecipe(uraniumNuggetStack9, uraniumStack);
        	//4 Uranium nuggets around a diamond->Irradiant Diamond
        	GameRegistry.addRecipe(irradiantDiamondStack, "xxx", "xyx", "xxx",'x', uraniumNuggetStack, 'y', diamondStack );
        	//Iron trousers without the top bit -> Iron Panel
        	GameRegistry.addRecipe(ironPanelStack2, "x x", "x x", "x x",'x', ironStack);
        	//Reinforced Obsidian recipe
        	GameRegistry.addRecipe(reinforcedObsidianStack, " x ", "y y", " x ",'x', ironPanelStack1, 'y', obsidianStack );  
        	//Reinforced Obsidian recipe for those wishing to be awkward. On a side note, isn't it ironic how awkward "awkward" is to spell?
        	GameRegistry.addRecipe(reinforcedObsidianStack, " x ", "y y", " x ",'x', obsidianStack, 'y', ironPanelStack1 );  

        	
        	
                proxy.registerRenderers();
        }
  
        
        
        
        
        
        @EventHandler
        public void postInit(FMLPostInitializationEvent event) {

        }
}




