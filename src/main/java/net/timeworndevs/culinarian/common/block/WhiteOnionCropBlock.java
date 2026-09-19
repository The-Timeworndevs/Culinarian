package net.timeworndevs.culinarian.common.block;

import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.timeworndevs.culinarian.common.init.CulinarianItems;

public class WhiteOnionCropBlock extends CropBlock {
    public WhiteOnionCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return CulinarianItems.WHITE_ONION;
    }
}
