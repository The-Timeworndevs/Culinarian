package net.timeworndevs.culinarian.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.timeworndevs.culinarian.Main;

import java.util.function.Function;

public class CulinarianItems {

    //Foods
    public static final Item PORTABELLO_MUSHROOM = registerItem("portabello_mushroom", properties -> new Item(properties.food(CulinarianConsumables.PORTABELLO_FOOD)));
    public static final Item AGARIC_MUSHROOM = registerItem("agaric_mushroom", properties -> new Item(properties.food(CulinarianConsumables.AGARIC_FOOD, CulinarianConsumables.AGARIC_EFFECTS)));
    public static final Item GRILLED_PORTABELLO = registerItem("grilled_portabello", properties -> new Item(properties.food(CulinarianConsumables.PORTABELLO_FOOD)));
    public static final Item GRILLED_AGARIC = registerItem("grilled_agaric", properties -> new Item(properties.food(CulinarianConsumables.AGARIC_FOOD, CulinarianConsumables.AGARIC_EFFECTS)));

    //Seeds
    public static final Item PORTABELLO_SPORES = registerItem("portabello_spores", properties -> new BlockItem(CulinarianBlocks.PORTABELLO_CROP, properties));


    public static ResourceKey<Item> getRK(Item item) {
        return BuiltInRegistries.ITEM.getResourceKey(item).get();
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> function) {
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name)))));
    }

    public static void init() {

    }

}
