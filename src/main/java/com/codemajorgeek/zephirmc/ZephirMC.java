package com.codemajorgeek.zephirmc;

import com.codemajorgeek.zephirmc.items.*;
import com.codemajorgeek.zephirmc.proxy.*;

import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.*;
import cpw.mods.fml.common.event.*;
import cpw.mods.fml.common.registry.*;
import net.minecraft.creativetab.*;
import net.minecraft.item.*;
import net.minecraft.item.ItemArmor.*;
import net.minecraftforge.common.util.*;

@Mod(modid = ZephirMC.MODID, name = ZephirMC.NAME,version = ZephirMC.VERSION)
public class ZephirMC
{
    public static final String MODID = "zephirmc";
    public static final String NAME = "ZephirMC";
    public static final String VERSION = "1.0.0";
    
    public static Item stickZephir;
    public static Item helmetZephir, chestplateZephir, leggingsZephir, bootsZephir;
    public static ArmorMaterial armorTuto = EnumHelper.addArmorMaterial("armorZephir", 25, new int[] {4, 6, 5, 4}, 20);
    
    @Instance("zephirmc")
    public static ZephirMC instance;
    
    @SidedProxy(clientSide = "com.codemajorgeek.zephirmc.proxy.ClientProxy", serverSide = "com.codemajorgeek.zephirmc.proxy.CommonProxy")
    public static CommonProxy proxy;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		
    	stickZephir = new ZephirStick().setUnlocalizedName("zephir_stick").setTextureName(MODID + ":zephir_stick").setCreativeTab(CreativeTabs.tabMaterials);
    	GameRegistry.registerItem(stickZephir, "zephir_stick");
    	
    	helmetZephir = new ZephirArmor(armorTuto, 0).setUnlocalizedName("helmetZephir").setTextureName(MODID + ":helmet_zephir");
    	chestplateZephir = new ZephirArmor(armorTuto, 1).setUnlocalizedName("chestplateZephir").setTextureName(MODID + ":chestplate_zephir");
    	leggingsZephir = new ZephirArmor(armorTuto, 2).setUnlocalizedName("leggingsZephir").setTextureName(MODID + ":leggings_zephir");
    	bootsZephir = new ZephirArmor(armorTuto, 3).setUnlocalizedName("bootsZephir").setTextureName(MODID + ":boots_zephir");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
		
    	proxy.registerRender();
    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
		
    	
    }
}
