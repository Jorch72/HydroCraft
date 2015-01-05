package com.LightsDawn.HydroCraft.Handler;


import com.LightsDawn.HydroCraft.Reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{

    public static Configuration configuration;
    public static boolean exampleValue = false;

    public static void init(File configFile)
    {
        //create configuration object from the given config file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }

    }


    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {

        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
            //resync configs
        }
    }

    private static void loadConfiguration()
    {
        exampleValue = configuration.getBoolean("Example Value", Configuration.CATEGORY_GENERAL, true, "This is an example comment about this option.");

        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

}


