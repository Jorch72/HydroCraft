package com.LightsDawn.HydroCraft.init;

import com.LightsDawn.HydroCraft.Reference.Reference;
import com.LightsDawn.HydroCraft.block.BlockHC;
import com.LightsDawn.HydroCraft.block.BlockWaterLamp;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockHC waterLamp = new BlockWaterLamp();

    public static void init()
    {
        GameRegistry.registerBlock(waterLamp, "waterLamp");
    }
}
