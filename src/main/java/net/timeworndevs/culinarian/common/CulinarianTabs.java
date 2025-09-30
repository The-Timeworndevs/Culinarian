package net.timeworndevs.culinarian.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.timeworndevs.culinarian.Main;

public class CulinarianTabs {

    public static final RegistryKey<ItemGroup> CULINARIAN_ITEMS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(Main.MOD_ID, "culinarian_main_tab"));
    public static final ItemGroup CULINARIAN_ITEMS = FabricItemGroup.builder().icon(()-> new ItemStack(CulinarianItems.PORTABELLO_MUSHROOM)).displayName(Text.translatable("group.culinarian.main")).build();

    public static void init() {

        Registry.register(Registries.ITEM_GROUP, CULINARIAN_ITEMS_KEY, CULINARIAN_ITEMS);

        ItemGroupEvents.modifyEntriesEvent(CULINARIAN_ITEMS_KEY).register((entries) -> {
            entries.add(CulinarianItems.PORTABELLO_MUSHROOM);
            entries.add(CulinarianItems.AGARIC_MUSHROOM);
            entries.add(CulinarianItems.GRILLED_PORTABELLO);
            entries.add(CulinarianItems.GRILLED_AGARIC);
        });
    }
}
