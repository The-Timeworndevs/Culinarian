package net.timeworndevs.culinarian.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.timeworndevs.culinarian.common.init.CulinarianTags;

public class WildMushroomBlock extends TallGrassBlock {
    public WildMushroomBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected boolean mayPlaceOn(BlockState state, BlockGetter level, BlockPos pos) {
        return state.is(CulinarianTags.MUSHROOM_BLOCK_PLANTABLES);
    }
}
