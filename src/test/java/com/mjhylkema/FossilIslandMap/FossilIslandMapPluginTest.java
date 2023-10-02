package com.mjhylkema.FossilIslandMap;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FossilIslandMapPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FossilIslandMapPlugin.class);
		RuneLite.main(args);
	}
}