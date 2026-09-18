package net.timeworndevs.culinarian.common.init;


import net.fabricmc.fabric.api.loot.v3.FabricLootPoolBuilder;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;

public class CulinarianLootTableEvents {

    public static void init() {
        //LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
        //    if (source.isBuiltin() && Blocks.BROWN_MUSHROOM_BLOCK.getLootTable().equals(key)) {
        //        LootPool.Builder builder = LootPool.lootPool().add(LootItem.lootTableItem(CulinarianItems.PORTABELLO_SPORES));
        //    }
        //});
    }
}
