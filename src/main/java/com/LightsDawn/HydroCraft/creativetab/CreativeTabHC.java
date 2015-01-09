package com.LightsDawn.HydroCraft.creativetab;


import com.LightsDawn.HydroCraft.Reference.Reference;
import com.LightsDawn.HydroCraft.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabHC
{
    public static final CreativeTabs HC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem()
        {
            return ModItems.HydroDriver;
        }


    };
}


