package com.codemajorgeek.zephirmc.items;

import com.codemajorgeek.zephirmc.*;

import net.minecraft.entity.*;
import net.minecraft.item.*;

public class ZephirArmor extends ItemArmor {
	
	public ZephirArmor(ArmorMaterial material, int type) {
		
		super(material, 0, type);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		
		if(slot == 2) {
			
			return ZephirMC.MODID + ":textures/models/armor/zephir_layer_2.png";
		}
		return ZephirMC.MODID + ":textures/models/armor/zephir_layer_1.png";
	}
}
