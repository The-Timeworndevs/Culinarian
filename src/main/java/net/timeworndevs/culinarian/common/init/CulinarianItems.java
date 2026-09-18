package net.timeworndevs.culinarian.common.init;

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
    public static final Item PORTOBELLO_MUSHROOM = registerItem("portobello_mushroom", properties -> new Item(properties.food(CulinarianConsumables.PORTABELLO_FOOD)));
    public static final Item AGARIC_MUSHROOM = registerItem("agaric_mushroom", properties -> new Item(properties.food(CulinarianConsumables.AGARIC_FOOD, CulinarianConsumables.AGARIC_EFFECTS)));
    public static final Item GRILLED_PORTOBELLO = registerItem("grilled_portobello", properties -> new Item(properties.food(CulinarianConsumables.GRILLED_PORTABELLO_FOOD)));
    public static final Item GRILLED_AGARIC = registerItem("grilled_agaric", properties -> new Item(properties.food(CulinarianConsumables.GRILLED_AGARIC_FOOD, CulinarianConsumables.GRILLED_AGARIC_EFFECTS)));
    public static final Item BAKED_CARROT = registerItem("baked_carrot", properties -> new Item(properties.food(CulinarianConsumables.BAKED_CARROT_FOOD)));

    //Seeds
    public static final Item PORTOBELLO_SPORES = registerItem("portobello_spores", properties -> new BlockItem(CulinarianBlocks.PORTOBELLO_CROP, properties));
    public static final Item AGARIC_SPORES = registerItem("agaric_spores", properties -> new BlockItem(CulinarianBlocks.AGARIC_CROP, properties));


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
