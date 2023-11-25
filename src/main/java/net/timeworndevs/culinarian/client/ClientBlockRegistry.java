package net.timeworndevs.culinarian.client;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.timeworndevs.culinarian.common.CommonBlockRegistry;

public class ClientBlockRegistry {

    public static void register() {
        blockRendering();
    }

    public static void blockRendering() {
        RenderLayer cutout = RenderLayer.getCutout();

        BlockRenderLayerMap.INSTANCE.putBlocks(cutout, CommonBlockRegistry.PORTABELLO, CommonBlockRegistry.AGARIC);
        BlockRenderLayerMap.INSTANCE.putBlocks(cutout, CommonBlockRegistry.RED_ONION, CommonBlockRegistry.WHITE_ONION);
        BlockRenderLayerMap.INSTANCE.putBlocks(cutout, CommonBlockRegistry.RADISH);
    }
}
