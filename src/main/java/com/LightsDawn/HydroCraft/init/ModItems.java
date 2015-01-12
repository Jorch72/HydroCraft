package com.LightsDawn.HydroCraft.init;


import com.LightsDawn.HydroCraft.Reference.Reference;
import com.LightsDawn.HydroCraft.item.*;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemHC hydroDriver = new ItemHydroDriver();
    public static final ItemHC mercuryIngot = new ItemMercuryIngot();
    public static final ItemHC bromineIngot = new ItemBromineIngot();
    public static final ItemHC franciumIngot = new ItemFranciumIngot();
    public static final ItemHC cesiumIngot = new ItemCesiumIngot();
    public static final ItemHC galliumIngot = new ItemGalliumIngot();
    public static final ItemHC rubidiumIngot = new ItemRubidiumIngot();

    public static void init()
    {
        GameRegistry.registerItem(hydroDriver, "HydroDriver");
        GameRegistry.registerItem(mercuryIngot, "MercuryIngot");
        GameRegistry.registerItem(bromineIngot, "BromineIngot");
        GameRegistry.registerItem(franciumIngot, "FranciumIngot");
        GameRegistry.registerItem(cesiumIngot, "CesiumIngot");
        GameRegistry.registerItem(galliumIngot, "GalliumIngot");
        GameRegistry.registerItem(rubidiumIngot, "RubidiumIngot");
    }

}
