package net.timeworndevs.culinarian;

import net.fabricmc.api.ClientModInitializer;
import net.timeworndevs.culinarian.client.ClientBlockRegistry;
import net.timeworndevs.culinarian.client.ClientScreenRegistry;

public class Client implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ClientBlockRegistry.register();
        ClientScreenRegistry.register();
    }
}
