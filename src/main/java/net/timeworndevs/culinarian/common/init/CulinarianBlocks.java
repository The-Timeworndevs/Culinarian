package net.timeworndevs.culinarian.common.init;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.TallGrassBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.timeworndevs.culinarian.Main;
import net.timeworndevs.culinarian.common.block.AgaricCropBlock;
import net.timeworndevs.culinarian.common.block.PortabelloCropBlock;
import net.timeworndevs.culinarian.common.block.WildMushroomBlock;

import java.util.function.Function;

public class CulinarianBlocks {

    //Crops
    public static final Block PORTOBELLO_CROP = registerBlockWithoutBlockItem("portobello_crop", properties -> new PortabelloCropBlock(properties.sound(SoundType.CROP).noOcclusion().noCollision().randomTicks().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN)));
    public static final Block AGARIC_CROP = registerBlockWithoutBlockItem("agaric_crop", properties -> new AgaricCropBlock(properties.sound(SoundType.CROP).noOcclusion().noCollision().randomTicks().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_RED)));

    //Wild crops
    public static final Block WILD_WHEAT = registerBlock("wild_wheat", properties -> new TallGrassBlock(properties.sound(SoundType.CROP).noOcclusion().noCollision().randomTicks().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_YELLOW).offsetType(BlockBehaviour.OffsetType.XYZ)));
    public static final Block WILD_PORTOBELLO = registerBlock("wild_portobello", properties -> new WildMushroomBlock(properties.sound(SoundType.CROP).noOcclusion().noCollision().randomTicks().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_BROWN).offsetType(BlockBehaviour.OffsetType.XYZ)));
    public static final Block WILD_AGARIC = registerBlock("wild_agaric", properties -> new WildMushroomBlock(properties.sound(SoundType.CROP).noOcclusion().noCollision().randomTicks().instabreak().pushReaction(PushReaction.DESTROY).mapColor(MapColor.COLOR_RED).offsetType(BlockBehaviour.OffsetType.XYZ)));

    private static Block registerBlockWithoutBlockItem(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name), toRegister);
    }

    private static Block registerBlock(String name, Function<BlockBehaviour.Properties, Block> function) {
        Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name))));
        registerBlockItem(name, toRegister);
        return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(Main.MOD_ID, name), toRegister);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name),
                new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix()
                        .setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void init() {

    }

}
