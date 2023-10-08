package net.timeworndevs.culinarian.common;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.sound.BlockSoundGroup;
import net.timeworndevs.culinarian.block.AgaricMushroomCropBlock;
import net.timeworndevs.culinarian.block.PortabelloMushroomCropBlock;
import net.timeworndevs.culinarian.block.RedOnionCropBlock;
import net.timeworndevs.culinarian.block.WhiteOnionCropBlock;
import net.timeworndevs.culinarian.init.CulinarianRegistry;

public class CommonBlockRegistry {

    public static Block PORTABELLO;

    public static Block AGARIC;

    public static Block RED_ONION;

    public static Block WHITE_ONION;

    public static void register() {
        PORTABELLO = CulinarianRegistry.register("portabello", new PortabelloMushroomCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.BROWN).breakInstantly().noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));

        AGARIC = CulinarianRegistry.register("agaric", new AgaricMushroomCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.RED).breakInstantly().noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));

        RED_ONION = CulinarianRegistry.register("red_onion", new RedOnionCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).breakInstantly().noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));

        WHITE_ONION = CulinarianRegistry.register("white_onion", new WhiteOnionCropBlock(AbstractBlock.Settings.create().mapColor(MapColor.GREEN).breakInstantly().noCollision().ticksRandomly().sounds(BlockSoundGroup.CROP).pistonBehavior(PistonBehavior.DESTROY)));

    }
}
