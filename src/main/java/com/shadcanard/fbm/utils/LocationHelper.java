package com.shadcanard.fbm.utils;

import com.shadcanard.fbm.references.Reference;
import net.minecraft.util.ResourceLocation;

@SuppressWarnings("UnusedDeclaration")
public class LocationHelper {
    public String ItemLocation(String itemName){
        return new ResourceLocation(Reference.MOD_ID, itemName).toString();
    }
    public String BlockLocation(String blockName){
        return new ResourceLocation(Reference.MOD_ID, blockName).toString();

    }
    public String entityLocation(String entityName){
        return new ResourceLocation(Reference.MOD_ID, entityName).toString();

    }

    public String ArmorLocation(String armorName){
        return new ResourceLocation(Reference.MOD_ID, armorName).toString();
    }
}
