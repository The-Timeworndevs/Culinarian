package net.timeworndevs.culinarian.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.timeworndevs.culinarian.Main;

public class CulinarianBlockTags {

    public static final TagKey<Block> MUSHROOM_CROP_PLANTABLES = of("mushroom_crop_plantables");

    private CulinarianBlockTags() {

    }

    private static TagKey<Block> of(String id){
        return TagKey.of(RegistryKeys.BLOCK, new Identifier(Main.MODID, id));
    }
}
