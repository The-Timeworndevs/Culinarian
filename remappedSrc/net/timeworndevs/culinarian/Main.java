package net.timeworndevs.culinarian;

import net.fabricmc.api.ModInitializer;

import net.timeworndevs.culinarian.common.CulinarianBlocks;
import net.timeworndevs.culinarian.common.CulinarianItems;
import net.timeworndevs.culinarian.common.CulinarianTabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {
	public static final String MOD_ID = "culinarian";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("hrrg, soup \uD83C\uDF5C\uD83C\uDF5C\uD83C\uDF5C\uD83C\uDF5C");

        LOGGER.info("Registering Blocks");
        CulinarianBlocks.init();

        LOGGER.info("Registering Items");
        CulinarianItems.init();

        LOGGER.info("Registering Tabs");
        CulinarianTabs.init();

	}
}