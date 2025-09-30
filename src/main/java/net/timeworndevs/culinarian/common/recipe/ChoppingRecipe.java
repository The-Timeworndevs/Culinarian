package net.timeworndevs.culinarian.common.recipe;

import net.minecraft.item.ItemStack;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.recipe.SingleStackRecipe;
import net.minecraft.recipe.book.RecipeBookCategory;

public class ChoppingRecipe extends SingleStackRecipe {
    public ChoppingRecipe(String group, Ingredient ingredient, ItemStack result) {
        super(group, ingredient, result);
    }

    @Override
    public RecipeSerializer<? extends SingleStackRecipe> getSerializer() {
        return null;
    }

    @Override
    public RecipeType<? extends SingleStackRecipe> getType() {
        return null;
    }

    @Override
    public RecipeBookCategory getRecipeBookCategory() {
        return null;
    }
}
