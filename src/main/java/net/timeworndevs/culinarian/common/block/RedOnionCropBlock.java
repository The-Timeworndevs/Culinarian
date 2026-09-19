package net.timeworndevs.culinarian.common.block;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.timeworndevs.culinarian.common.init.CulinarianItems;

public class RedOnionCropBlock extends CropBlock {
    public RedOnionCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return CulinarianItems.RED_ONION;
    }
}
