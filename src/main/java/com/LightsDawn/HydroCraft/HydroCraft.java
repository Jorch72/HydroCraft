package com.LightsDawn.HydroCraft;


import com.LightsDawn.HydroCraft.Handler.ConfigHandler;
import com.LightsDawn.HydroCraft.Reference.Reference;
import com.LightsDawn.HydroCraft.Utilities.LogHelper;
import com.LightsDawn.HydroCraft.init.ModBlocks;
import com.LightsDawn.HydroCraft.init.ModItems;
import com.LightsDawn.HydroCraft.init.Recipes;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLFingerprintViolationEvent;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import com.LightsDawn.HydroCraft.proxy.IProxy;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION, certificateFingerprint = Reference.FINGERPRINT, guiFactory = Reference.GUIFACTORY)
public class HydroCraft
{

    @Mod.Instance(Reference.MOD_NAME)
    public static HydroCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static IProxy proxy;


    @Mod.EventHandler
    public void invalidFingerprint(FMLFingerprintViolationEvent event)
    {
        if (Reference.FINGERPRINT.equals(Reference.VERIFYFINGER))
        {
            LogHelper.info("Fingerprint matches!");
        }
        else
        {
            LogHelper.warn("Someones tampered with your HydroCraft jar!");
        }

    }

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        proxy.registerKeyBindings();

        ModItems.init();
        ModBlocks.init();


        LogHelper.info("PreInitialization Complete!");
    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

        LogHelper.info("PostInitialization Complete!");
        LogHelper.info("Who's gettin wet?");
    }
}
