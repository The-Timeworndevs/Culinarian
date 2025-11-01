package net.timeworndevs.culinarian.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.timeworndevs.culinarian.Main;
import net.timeworndevs.culinarian.common.block.MushroomCropBlock;

import java.util.function.Function;

public class CulinarianBlocks {

    public static Block register(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties settings, boolean shouldregister) {

        ResourceKey<Block> blockkey = keyOfBlock(name);

        Block block = factory.apply(settings.setId(blockkey));

        if (shouldregister) {
            ResourceKey<Item> itemkey = keyOfItem(name);

            BlockItem blockitem = new BlockItem(block, new Item.Properties().setId(itemkey).useBlockDescriptionPrefix());

            Registry.register(BuiltInRegistries.ITEM, itemkey, blockitem);
        }

        return Registry.register(BuiltInRegistries.BLOCK, blockkey, block);
    }

    private static ResourceKey<Block> keyOfBlock(String name) {
        return ResourceKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name));
    }

    private static ResourceKey<Item> keyOfItem(String name) {
        return ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name));
    }

    public static final Block PORTABELLO_CROP_BLOCK = register("portabello_crop_block", MushroomCropBlock::new, BlockBehaviour.Properties.of().sound(SoundType.CROP), true);

    public static void init() {

    }

}
