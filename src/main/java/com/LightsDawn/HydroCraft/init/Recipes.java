package com.LightsDawn.HydroCraft.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes
{
    public static void init() {
        GameRegistry.addRecipe(new ItemStack(ModItems.hydroDriver),
                "  s",
                " x ",
                "z  ",
                's', new ItemStack(Items.iron_ingot),
                'x', new ItemStack(Items.water_bucket),
                'z', new ItemStack(Items.stick));

    }
}
