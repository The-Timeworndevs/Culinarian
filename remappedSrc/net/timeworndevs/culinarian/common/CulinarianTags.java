package net.timeworndevs.culinarian.common;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.timeworndevs.culinarian.Main;

public class CulinarianTags {

    public static final TagKey<Block> MUSHROOM_BLOCK_PLANTABLES = blockTagKey("mushroom_crop_plantables");

    public static TagKey<Block> blockTagKey(String id) {
        return blockTagKey(Main.MOD_ID, id);
    }

    public static TagKey<Block> blockTagKey(String modid, String id) {
        return TagKey.create(BuiltInRegistries.BLOCK.key(), ResourceLocation.fromNamespaceAndPath(modid, id));
    }
}
