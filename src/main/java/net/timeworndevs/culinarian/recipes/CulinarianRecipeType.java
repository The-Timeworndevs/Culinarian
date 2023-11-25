package net.timeworndevs.culinarian.recipes;

import net.minecraft.recipe.RecipeType;

public interface CulinarianRecipeType extends RecipeType {
    RecipeType<ChoppingBlockRecipe> CHOPPING = RecipeType.register("chopping");
}
