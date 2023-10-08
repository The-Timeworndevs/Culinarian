package net.timeworndevs.culinarian.common;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.timeworndevs.culinarian.init.CulinarianRegistry;

public class CommonItemRegistry {

    public static Item PORTABELLO_MUSHROOM;
    public static Item PORTABELLO_SPORES;
    public static Item GRILLED_PORTABELLO;

    public static Item AGARIC_MUSHROOM;
    public static Item AGARIC_SPORES;
    public static Item GRILLED_AGARIC;

    public static Item RED_ONION_BULB;

    public static Item WHITE_ONION_BULB;


    public static void register() {
        PORTABELLO_MUSHROOM = CulinarianRegistry.register("portabello_mushroom", new Item(new Item.Settings().food(FoodComponents.APPLE)));
        PORTABELLO_SPORES = CulinarianRegistry.register("portabello_spores", new AliasedBlockItem(CommonBlockRegistry.PORTABELLO, new Item.Settings()));
        GRILLED_PORTABELLO = CulinarianRegistry.register("grilled_portabello", new Item(new Item.Settings().food(FoodComponents.PORKCHOP)));

        AGARIC_MUSHROOM = CulinarianRegistry.register("agaric_mushroom", new Item(new Item.Settings().food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.POISON, 10*20, 2), 1.0F).hunger(2).saturationModifier(0.1F).build())));
        AGARIC_SPORES = CulinarianRegistry.register("agaric_spores", new AliasedBlockItem(CommonBlockRegistry.AGARIC, new Item.Settings()));
        GRILLED_AGARIC = CulinarianRegistry.register("grilled_agaric", new Item(new Item.Settings().food(new FoodComponent.Builder().statusEffect(new StatusEffectInstance(StatusEffects.HUNGER, 10*20, 2), 1.0F).hunger(2).saturationModifier(0.1F).build())));

        RED_ONION_BULB = CulinarianRegistry.register("red_onion_bulb", new AliasedBlockItem(CommonBlockRegistry.RED_ONION, new Item.Settings().food(FoodComponents.CARROT)));

        WHITE_ONION_BULB = CulinarianRegistry.register("white_onion_bulb", new AliasedBlockItem(CommonBlockRegistry.WHITE_ONION, new Item.Settings().food(FoodComponents.CARROT)));
    }
}