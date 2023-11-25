package net.timeworndevs.culinarian.common;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;

import static net.timeworndevs.culinarian.Main.id;

public class CommonScreenHandlerRegistry {
    public static ScreenHandlerType<ChoppingBlockScreenHandler> CHOPPING_SCREEN_HANDLER_TYPE=Registry.register(Registries.SCREEN_HANDLER,id("chopping"),new ScreenHandlerType<>(ChoppingBlockScreenHandler::new, FeatureFlags.VANILLA_FEATURES));
    public static void register() {
    }

}
