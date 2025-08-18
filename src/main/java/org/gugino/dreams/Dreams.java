package org.gugino.dreams;

import net.fabricmc.api.ModInitializer;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.kyrptonaught.customportalapi.util.PortalLink;
import org.gugino.dreams.block.ModBlocks;
import org.gugino.dreams.item.ModItemGroups;
import org.gugino.dreams.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dreams implements ModInitializer {
	public static final String MOD_ID = "dreams";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
	}
}