package net.timeworndevs.culinarian.common.recipe;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeBookCategory;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.item.crafting.SingleItemRecipe;

public class ChoppingRecipe extends SingleItemRecipe {
    public ChoppingRecipe(String group, Ingredient ingredient, ItemStack result) {
        super(group, ingredient, result);
    }

    @Override
    public RecipeSerializer<? extends SingleItemRecipe> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<? extends SingleItemRecipe> getType() {
        return null;
    }

    @Override
    public RecipeBookCategory recipeBookCategory() {
        return null;
    }
}
