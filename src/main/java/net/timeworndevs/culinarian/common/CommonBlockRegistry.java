package net.timeworndevs.culinarian.common;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;
import net.timeworndevs.culinarian.block.MushroomCropBlock;
import net.timeworndevs.culinarian.init.CulinarianRegistry;

public class CommonBlockRegistry {

    public static Block PORTABELLO;

    public static void register() {
        PORTABELLO = CulinarianRegistry.register("portabello", new MushroomCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).breakInstantly().noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));
    }
}
