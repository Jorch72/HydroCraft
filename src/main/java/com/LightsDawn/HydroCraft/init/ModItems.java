package com.LightsDawn.HydroCraft.init;


import com.LightsDawn.HydroCraft.Reference.Reference;
import com.LightsDawn.HydroCraft.item.ItemHC;
import com.LightsDawn.HydroCraft.item.ItemHydroDriver;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemHC HydroDriver = new ItemHydroDriver();

    public static void init()
    {
        GameRegistry.registerItem(HydroDriver, "HydroDriver");
    }
}
