package net.timeworndevs.culinarian.common;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.timeworndevs.culinarian.Main;

public class CulinarianTabs {

    public static final ResourceKey<CreativeModeTab> CULINARIAN_ITEMS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(Main.MOD_ID, "culinarian_main_tab"));
    public static final CreativeModeTab CULINARIAN_ITEMS = FabricItemGroup.builder().icon(()-> new ItemStack(CulinarianItems.PORTABELLO_MUSHROOM)).title(Component.translatable("group.culinarian.main")).build();

    public static void init() {

        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CULINARIAN_ITEMS_KEY, CULINARIAN_ITEMS);

        ItemGroupEvents.modifyEntriesEvent(CULINARIAN_ITEMS_KEY).register((entries) -> {
            entries.accept(CulinarianItems.PORTABELLO_MUSHROOM);
            entries.accept(CulinarianItems.AGARIC_MUSHROOM);
            entries.accept(CulinarianItems.GRILLED_PORTABELLO);
            entries.accept(CulinarianItems.GRILLED_AGARIC);
        });
    }
}
