package com.LightsDawn.HydroCraft.block;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class BlockWaterLamp extends BlockHC
{
    public BlockWaterLamp()
    {
        super();
        this.setBlockName("waterLamp");
        this.setStepSound(soundTypeGlass);
        this.isOpaqueCube();
    }

}
