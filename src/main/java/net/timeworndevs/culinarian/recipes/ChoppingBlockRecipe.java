package net.timeworndevs.culinarian.recipes;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.timeworndevs.culinarian.common.CommonBlockRegistry;
import net.timeworndevs.culinarian.common.CommonItemRegistry;

public class ChoppingBlockRecipe extends CuttingRecipe {

    public ChoppingBlockRecipe(RecipeType<?> type, RecipeSerializer<?> serializer, Identifier id, String group, Ingredient input, ItemStack output) {
        super(type, serializer, id, group, input, output);
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return this.input.test(inventory.getStack(0));
    }

    public ItemStack createIcon() {
        return new ItemStack(CommonItemRegistry.CHOPPING_BLOCK);
    }
}
