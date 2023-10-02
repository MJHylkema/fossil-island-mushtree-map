package com.mjhylkema.FossilIslandMap;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Client;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "Fossil Island Map"
)
public class FossilIslandMapPlugin extends Plugin
{
	@Inject
	private Client client;

	@Inject
	private FossilIslandMapConfig config;

	@Override
	protected void startUp() throws Exception
	{
	}

	@Provides
	FossilIslandMapConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(FossilIslandMapConfig.class);
	}
}
