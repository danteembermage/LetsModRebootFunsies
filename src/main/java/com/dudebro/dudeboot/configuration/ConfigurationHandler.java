package com.dudebro.dudeboot.configuration;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigurationHandler {
	public static void init(File configFile)
	{
		Configuration configuration = new Configuration(configFile);
		boolean configValue = false;
		try
		{
			configuration.load();
			configValue = configuration.get(Configuration.CATEGORY_GENERAL, "configValue", true, "Example").getBoolean(true);
		}
		catch (Exception e)
		{
			System.out.println("shoot " + configValue);
		}
		finally
		{
			configuration.save();
		}
		System.out.println("Whooee " + configValue);
	}

}
