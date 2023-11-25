package net.timeworndevs.culinarian.common;

import net.minecraft.recipe.RecipeType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.timeworndevs.culinarian.recipes.ChoppingBlockRecipe;

public class CommonRecpieRegistry {
    public static RecipeType<ChoppingBlockRecipe> CHOPPING = RecipeType.register("chopping");

    public static void register() {

    }
}
