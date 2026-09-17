package net.timeworndevs.culinarian.common.block;

import net.minecraft.world.level.ItemLike;
import net.timeworndevs.culinarian.common.CulinarianItems;

public class AgaricCropBlock extends MushroomCropBlock{
    public AgaricCropBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return CulinarianItems.AGARIC_SPORES;
    }
}
