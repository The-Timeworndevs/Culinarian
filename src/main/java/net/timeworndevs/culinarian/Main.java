package net.timeworndevs.culinarian;

import net.fabricmc.api.ModInitializer;
import net.timeworndevs.culinarian.common.CommonBlockRegistry;
import net.timeworndevs.culinarian.common.CommonItemRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main implements ModInitializer {

	public static final String MODID = "culinarian";

	public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

	@Override
	public void onInitialize() {
		CommonBlockRegistry.register();
		CommonItemRegistry.register();
	}
}
