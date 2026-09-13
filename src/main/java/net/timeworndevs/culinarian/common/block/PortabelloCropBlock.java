package net.timeworndevs.culinarian.common.block;

import net.minecraft.world.level.ItemLike;
import net.timeworndevs.culinarian.common.CulinarianItems;

public class PortabelloCropBlock extends MushroomCropBlock{
    public PortabelloCropBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return CulinarianItems.PORTABELLO_SPORES;
    }
}
