package net.timeworndevs.culinarian.common.init;

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

    public static final ResourceKey<CreativeModeTab> CULINARIAN_FOOD_ITEMS_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Main.MOD_ID, "culinarian_foods_tab"));
    public static final CreativeModeTab CULINARIAN_FOOD_ITEMS = FabricCreativeModeTab.builder().icon(()-> new ItemStack(CulinarianItems.PORTOBELLO_MUSHROOM)).title(Component.translatable("group.culinarian.foods")).displayItems((parameters, output) -> {
        output.accept(CulinarianItems.PORTOBELLO_MUSHROOM);
        output.accept(CulinarianItems.AGARIC_MUSHROOM);
        output.accept(CulinarianItems.GRILLED_PORTOBELLO);
        output.accept(CulinarianItems.GRILLED_AGARIC);
        output.accept(CulinarianItems.BAKED_CARROT);
    }).build();

    public static final ResourceKey<CreativeModeTab> CULINARIAN_NATURE_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), Identifier.fromNamespaceAndPath(Main.MOD_ID, "culinarian_nature_tab"));
    public static final CreativeModeTab CULINARIAN_NATURE = FabricCreativeModeTab.builder().icon(()-> new ItemStack(CulinarianBlocks.WILD_AGARIC)).title(Component.translatable("group.culinarian.nature")).displayItems((parameters, output) -> {
        output.accept(CulinarianBlocks.WILD_WHEAT);
        output.accept(CulinarianBlocks.WILD_PORTOBELLO);
        output.accept(CulinarianBlocks.WILD_AGARIC);
        output.accept(CulinarianItems.PORTOBELLO_SPORES);
        output.accept(CulinarianItems.AGARIC_SPORES);
    }).build();

    public static void init() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CULINARIAN_FOOD_ITEMS_KEY, CULINARIAN_FOOD_ITEMS);
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CULINARIAN_NATURE_KEY, CULINARIAN_NATURE);
    }
}
