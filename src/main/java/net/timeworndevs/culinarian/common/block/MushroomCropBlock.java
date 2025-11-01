package net.timeworndevs.culinarian.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.timeworndevs.culinarian.common.CulinarianTags;

public class MushroomCropBlock extends CropBlock {

    public MushroomCropBlock(Properties settings) {
        super(settings);
    }

    @Override
    protected boolean mayPlaceOn(BlockState floor, BlockGetter world, BlockPos pos) {
        return floor.is(CulinarianTags.MUSHROOM_BLOCK_PLANTABLES);
    }
}
