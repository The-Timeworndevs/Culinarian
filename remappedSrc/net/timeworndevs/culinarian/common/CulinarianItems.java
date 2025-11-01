package net.timeworndevs.culinarian.common;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.timeworndevs.culinarian.Main;

import java.util.function.Function;

public class CulinarianItems {

    public static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties settings) {

        ResourceKey<Item> itemkey = ResourceKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, name));

        Item item = factory.apply(settings.setId(itemkey));

        Registry.register(BuiltInRegistries.ITEM, itemkey, item);

        return item;
    }

    public static final Item PORTABELLO_MUSHROOM = register("portabello_mushroom", Item::new, new Item.Properties());
    public static final Item AGARIC_MUSHROOM = register("agaric_mushroom", Item::new, new Item.Properties());

    public static final Item GRILLED_PORTABELLO = register("grilled_portabello", Item::new, new Item.Properties());
    public static final Item GRILLED_AGARIC = register("grilled_agaric", Item::new, new Item.Properties());

    public static void init() {

    }
}
