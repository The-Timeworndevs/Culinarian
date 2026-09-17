package net.timeworndevs.culinarian.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.timeworndevs.culinarian.Main;
import net.timeworndevs.culinarian.common.block.AgaricCropBlock;
import net.timeworndevs.culinarian.common.block.PortabelloCropBlock;

import java.util.function.Function;

public class CulinarianBlocks {

    public static final Block PORTABELLO_CROP = registerBlockWithoutBlockItem("portabello_crop", properties -> new PortabelloCropBlock(properties.sound(SoundType.CROP).noOcclusion().noCollision().randomTicks().pushReaction(PushReaction.DESTROY)));
    public static final Block AGARIC_CROP = registerBlockWithoutBlockItem("agaric_crop", properties -> new AgaricCropBlock(properties.sound(SoundType.CROP).noOcclusion().noCollision().randomTicks().pushReaction(PushReaction.DESTROY)));

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
