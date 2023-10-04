package net.timeworndevs.culinarian.common;

import net.minecraft.block.Blocks;
import net.minecraft.item.*;
import net.timeworndevs.culinarian.init.CulinarianRegistry;

public class CommonItemRegistry {

    public static Item PORTABELLO_MUSHROOM;
    public static Item PORTABELLO_SPORES;
    public static void register() {
        PORTABELLO_MUSHROOM = CulinarianRegistry.register("portabello_mushroom", new Item(new Item.Settings().food(FoodComponents.APPLE)));
        PORTABELLO_SPORES = CulinarianRegistry.register("portabello_spores", new AliasedBlockItem(CommonBlockRegistry.PORTABELLO, new Item.Settings()));
    }
}
