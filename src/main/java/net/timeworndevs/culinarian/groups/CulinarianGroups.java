package net.timeworndevs.culinarian.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.timeworndevs.culinarian.Main;
import net.timeworndevs.culinarian.common.CommonItemRegistry;

public class CulinarianGroups {

    public static final RegistryKey<ItemGroup> CULINARIAN_ITEMS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Main.MODID, "main_items"));
    public static final RegistryKey<ItemGroup> CULINARIAN_BLOCKS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(Main.MODID, "main_blocks"));

    public static void register() {
        Registry.register(Registries.ITEM_GROUP, CULINARIAN_ITEMS, FabricItemGroup.builder().icon(() -> new ItemStack(CommonItemRegistry.PORTABELLO_MUSHROOM)).entries((context, entries) -> {
            entries.add(CommonItemRegistry.PORTABELLO_MUSHROOM);
            entries.add(CommonItemRegistry.PORTABELLO_SPORES);
            entries.add(CommonItemRegistry.GRILLED_PORTABELLO);
            entries.add(CommonItemRegistry.AGARIC_MUSHROOM);
            entries.add(CommonItemRegistry.AGARIC_SPORES);
            entries.add(CommonItemRegistry.GRILLED_AGARIC);
            entries.add(CommonItemRegistry.RED_ONION_BULB);
            entries.add(CommonItemRegistry.WHITE_ONION_BULB);
            entries.add(CommonItemRegistry.RADISH_ROOT);
            entries.add(CommonItemRegistry.RADISH_SEEDS);
            entries.add(CommonItemRegistry.GRILLED_RADISH);
            entries.add(CommonItemRegistry.BEEF_MINCE);
            entries.add(CommonItemRegistry.ROSE_LOKUM);
        }).displayName(Text.translatable("group.culinarian.main")).build());

        Registry.register(Registries.ITEM_GROUP, CULINARIAN_BLOCKS, FabricItemGroup.builder().icon(() -> new ItemStack(CommonItemRegistry.CHOPPING_BLOCK)).entries((context, entries) -> {
            entries.add(CommonItemRegistry.CHOPPING_BLOCK);
        }).displayName(Text.translatable("group.culinarian.block")).build());
    }
}
