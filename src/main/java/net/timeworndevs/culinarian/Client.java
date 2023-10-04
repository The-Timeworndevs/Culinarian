package net.timeworndevs.culinarian;

import net.fabricmc.api.ClientModInitializer;
import net.timeworndevs.culinarian.client.CommonClientRegistry;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CommonClientRegistry.register();
    }
}
