package org.gugino.dreams;

import net.fabricmc.api.ModInitializer;

import org.gugino.dreams.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Dreams implements ModInitializer {
	public static final String MOD_ID = "dreams";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
        ModItems.registerModItems();
	}
}