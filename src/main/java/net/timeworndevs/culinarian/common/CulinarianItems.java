package net.timeworndevs.culinarian.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.timeworndevs.culinarian.Main;

import java.util.function.Function;

public class CulinarianItems {

    public static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {

        ResourceKey<Item> itemkey = ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Main.MOD_ID, name));

        Item item = factory.apply(settings.setId(itemkey));

        Registry.register(BuiltInRegistries.ITEM, itemkey, item);

        return item;
    }


    //Foods
    public static final Item PORTABELLO_MUSHROOM = register("portabello_mushroom", Item::new, new Item.Properties().food(CulinarianConsumables.PORTABELLO_FOOD));
    public static final Item AGARIC_MUSHROOM = register("agaric_mushroom", Item::new, new Item.Properties().food(CulinarianConsumables.AGARIC_FOOD, CulinarianConsumables.AGARIC_EFFECTS));
    public static final Item GRILLED_PORTABELLO = register("grilled_portabello", Item::new, new Item.Properties().food(CulinarianConsumables.GRILLED_PORTABELLO_FOOD));
    public static final Item GRILLED_AGARIC = register("grilled_agaric", Item::new, new Item.Properties().food(CulinarianConsumables.GRILLED_AGARIC_FOOD, CulinarianConsumables.GRILLED_AGARIC_EFFECTS));

    //Seeds
    public static final Item PORTABELLO_SPORES = register("portabello_spores", Item::new, new Item.Properties());

    public static void init() {

    }

}
