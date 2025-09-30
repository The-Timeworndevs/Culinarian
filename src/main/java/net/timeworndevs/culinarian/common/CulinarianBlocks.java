package net.timeworndevs.culinarian.common;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.timeworndevs.culinarian.Main;

import java.util.function.Function;

public class CulinarianBlocks {

    public static Block register(String name, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings, boolean shouldregister) {

        RegistryKey<Block> blockkey = keyOfBlock(name);

        Block block = factory.apply(settings.registryKey(blockkey));

        if (shouldregister) {
            RegistryKey<Item> itemkey = keyOfItem(name);

            BlockItem blockitem = new BlockItem(block, new Item.Settings().registryKey(itemkey).useBlockPrefixedTranslationKey());

            Registry.register(Registries.ITEM, itemkey, blockitem);
        }

        return Registry.register(Registries.BLOCK, blockkey, block);
    }

    private static RegistryKey<Block> keyOfBlock(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(Main.MOD_ID, name));
    }

    private static RegistryKey<Item> keyOfItem(String name) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Main.MOD_ID, name));
    }

    public static void init() {

    }

}
