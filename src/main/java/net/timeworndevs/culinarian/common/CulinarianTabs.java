package net.timeworndevs.culinarian.common;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.timeworndevs.culinarian.Main;

public class CulinarianTabs {

    public static final ResourceKey<CreativeModeTab> CULINARIAN_ITEMS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Main.MOD_ID, "culinarian_main_tab"));
    public static final CreativeModeTab CULINARIAN_ITEMS = FabricCreativeModeTab.builder().icon(()-> new ItemStack(CulinarianItems.PORTABELLO_MUSHROOM)).title(Component.translatable("group.culinarian.main")).displayItems((parameters, output) -> {
        output.accept(CulinarianItems.PORTABELLO_MUSHROOM);
        output.accept(CulinarianItems.AGARIC_MUSHROOM);
        output.accept(CulinarianItems.GRILLED_PORTABELLO);
        output.accept(CulinarianItems.GRILLED_AGARIC);
        output.accept(CulinarianItems.PORTABELLO_SPORES);
    }).build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CULINARIAN_ITEMS_KEY, CULINARIAN_ITEMS);
    }
}
