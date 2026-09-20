package net.timeworndevs.culinarian.common.init;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;

public class CulinarianConsumables {

    //Food Properties
    public static final FoodProperties AGARIC_FOOD = new FoodProperties(2, 1.5f, false);
    public static final FoodProperties PORTABELLO_FOOD = new FoodProperties(4, 4.5f, false);
    public static final FoodProperties GRILLED_AGARIC_FOOD = new FoodProperties(3, 2f, false);
    public static final FoodProperties GRILLED_PORTABELLO_FOOD = new FoodProperties(8, 9f, false);
    public static final FoodProperties BAKED_CARROT_FOOD = new FoodProperties(6, 6.5f, false);
    public static final FoodProperties ONION_FOOD = new FoodProperties(3, 1.5f, false);
    public static final FoodProperties RADISH_FOOD = new FoodProperties(2, 0.3f, false);
    public static final FoodProperties STEAK_AND_POTATOES = new FoodProperties(14, 12f, false);

    //Food Effects
    public static final Consumable AGARIC_EFFECTS = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.POISON, 8*20, 2), 0.9f))
            .build();

    public static final Consumable GRILLED_AGARIC_EFFECTS = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.HUNGER, 6*20, 1), 0.9f))
            .build();

    public static final Consumable ONION_EFFECTS = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.BLINDNESS, 4*20, 0), 0.9f))
            .build();

    public static final Consumable RADISH_EFFECTS = Consumables.defaultFood()
            .consumeSeconds(0.8f)
            .build();

    public static final Consumable STEAK_AND_POTATOES_EFFECTS = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(new MobEffectInstance(MobEffects.RESISTANCE, 40*20, 0), 1.0f))
            .build();
}
