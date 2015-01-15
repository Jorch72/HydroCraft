package com.LightsDawn.HydroCraft.init;

import com.LightsDawn.HydroCraft.Reference.Reference;
import com.LightsDawn.HydroCraft.block.*;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    //call new block
    public static final BlockHC bromineOre = new BromineOre();
    public static final BlockHC cesiumOre = new CesiumOre();
    public static final BlockHC franciumOre = new FranciumOre();
    public static final BlockHC galliumOre = new GalliumOre();
    public static final BlockHC mercuryOre = new MercuryOre();
    public static final BlockHC rubidiumOre = new RubidiumOre();

    //register new block
    public static void init()
    {
        GameRegistry.registerBlock(bromineOre, "BromineOre");
        GameRegistry.registerBlock(cesiumOre, "CesiumOre");
        GameRegistry.registerBlock(galliumOre, "GalliumOre");
        GameRegistry.registerBlock(franciumOre, "FranciumOre");
        GameRegistry.registerBlock(mercuryOre, "MercuryOre");
        GameRegistry.registerBlock(rubidiumOre, "RubidiumOre");

    }
}
