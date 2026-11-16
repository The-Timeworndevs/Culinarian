package net.timeworndevs.culinarian.data;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.client.data.models.model.TextureMapping;
import net.minecraft.client.data.models.model.TextureSlot;
import net.minecraft.client.data.models.model.TexturedModel;
import net.minecraft.world.level.block.Block;
import org.jspecify.annotations.NonNull;


import static net.minecraft.client.data.models.model.TextureMapping.getBlockTexture;
import static net.minecraft.client.data.models.model.TexturedModel.COLUMN_HORIZONTAL;
import static net.minecraft.client.data.models.model.TexturedModel.createDefault;
import static net.timeworndevs.culinarian.data.Models.*;
import static net.timeworndevs.culinarian.common.init.CulinarianBlocks.*;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricPackOutput output) {
        super(output);
    }

    public static TextureMapping column(final Block block) {
        return (new TextureMapping()).put(TextureSlot.SIDE, getBlockTexture(block)).put(TextureSlot.END, getBlockTexture(block, "_top"));
    }

    public static TextureMapping crop(final Block block) {
        return (new TextureMapping().put(TextureSlot.CROP, getBlockTexture(block)));
    }

    public static TextureMapping cross(final Block block) {
        return (new TextureMapping().put(TextureSlot.CROSS, getBlockTexture(block)));
    }

    private static void generatePillarBlockStates(@NonNull BlockModelGenerators blockModelGenerators) {
        final TexturedModel.Provider COLUMN = createDefault(ModelProvider::column, ModelTemplates.CUBE_COLUMN);
        final TexturedModel.Provider HORIZONTAL = createDefault(ModelProvider::column, ModelTemplates.CUBE_COLUMN_HORIZONTAL);

        for (Block pillar : PILLARS) {
            blockModelGenerators.createRotatedPillarWithHorizontalVariant(pillar, COLUMN, HORIZONTAL);
        }
    }

    private static void generateCropBlockStates(@NonNull BlockModelGenerators blockModelGenerators) {
        final TexturedModel.Provider CROP = createDefault(ModelProvider::crop, ModelTemplates.CROP);

        for (Block crop : CROPS) {
            //blockModelGenerators.createCropBlock(crop, CROP);
        }
    }

    private static void generateCrossBlockStates(@NonNull BlockModelGenerators blockModelGenerators) {
        final TexturedModel.Provider CROSS = createDefault(ModelProvider::cross, ModelTemplates.CROSS);

        for (Block cross : WILD_CROPS) {
            //blockModelGenerators.createCrossBlock(cross, CROSS);
        }
    }

    @Override
    public void generateBlockStateModels(@NonNull BlockModelGenerators blockModelGenerators) {
        generatePillarBlockStates(blockModelGenerators);
        generateCropBlockStates(blockModelGenerators);
        generateCrossBlockStates(blockModelGenerators);

        for (Block block : BASIC_BLOCKS) {
            blockModelGenerators.createTrivialCube(block);
        }



    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {

    }


}
