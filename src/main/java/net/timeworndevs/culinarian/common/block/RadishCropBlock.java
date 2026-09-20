package net.timeworndevs.culinarian.common.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.timeworndevs.culinarian.common.init.CulinarianItems;

public class RadishCropBlock extends CropBlock {

    private static final VoxelShape[] SHAPES = RadishCropBlock.boxes(7, (age) -> RadishCropBlock.column((double) 16.0f, (double) 0.0f, (double) (2 + age)));

    public RadishCropBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return CulinarianItems.RADISH_SEEDS;
    }

    @Override
    protected VoxelShape getShape(final BlockState state, final BlockGetter level, final BlockPos pos, final CollisionContext context) {
        return SHAPES[this.getAge(state)];
    }
}
