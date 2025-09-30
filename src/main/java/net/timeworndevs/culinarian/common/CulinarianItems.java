package net.timeworndevs.culinarian.common;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.timeworndevs.culinarian.Main;

import java.util.function.Function;

public class CulinarianItems {

    public static Item register(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {

        RegistryKey<Item> itemkey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(Main.MOD_ID, name));

        Item item = factory.apply(settings.registryKey(itemkey));

        Registry.register(Registries.ITEM, itemkey, item);

        return item;
    }

    public static final Item PORTABELLO_MUSHROOM = register("portabello_mushroom", Item::new, new Item.Settings());
    public static final Item AGARIC_MUSHROOM = register("agaric_mushroom", Item::new, new Item.Settings());

    public static final Item GRILLED_PORTABELLO = register("grilled_portabello", Item::new, new Item.Settings());
    public static final Item GRILLED_AGARIC = register("grilled_agaric", Item::new, new Item.Settings());

    public static void init() {

    }
}
