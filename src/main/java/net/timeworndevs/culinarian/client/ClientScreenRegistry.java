package net.timeworndevs.culinarian.client;

import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.timeworndevs.culinarian.common.CommonScreenHandlerRegistry;

public class ClientScreenRegistry {

    public static void register() {
        HandledScreens.register(CommonScreenHandlerRegistry.CHOPPING_SCREEN_HANDLER_TYPE, ChoppingBlockScreen::new);
    }
}
