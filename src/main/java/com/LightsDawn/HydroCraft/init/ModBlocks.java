package com.LightsDawn.HydroCraft.init;

import com.LightsDawn.HydroCraft.Reference.Reference;
import com.LightsDawn.HydroCraft.block.BlockHC;
import com.LightsDawn.HydroCraft.block.BlockWaterLamp;
import com.LightsDawn.HydroCraft.block.BromineOre;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.MinecraftForge;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockHC waterLamp = new BlockWaterLamp();
    public static final BlockHC bromineOre = new BromineOre();

    public static void init()
    {
        GameRegistry.registerBlock(waterLamp, "WaterLamp");
        GameRegistry.registerBlock(bromineOre, "BromineOre");


    }
}
