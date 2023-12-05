package net.timeworndevs.culinarian.common;

import net.minecraft.recipe.*;
import net.timeworndevs.culinarian.recipes.ChoppingBlockRecipe;

import static net.timeworndevs.culinarian.Main.stringId;

public class CommonRecipeRegistry {
    public static RecipeType<ChoppingBlockRecipe> CHOPPING = RecipeType.register("culinarian:chopping");
    public static void register() {
         RecipeSerializer.register(stringId("chopping"),ChoppingBlockRecipe.SERIALIZER);
    }
}
