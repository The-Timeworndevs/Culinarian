package net.timeworndevs.culinarian.common.recipe;

import com.nimbusds.oauth2.sdk.id.Identifier;
import net.minecraft.recipe.book.RecipeBookCategories;
import net.minecraft.recipe.book.RecipeBookCategory;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class CulinarianRecipeBookCategories extends RecipeBookCategories {

    public static final RecipeBookCategory CHOPPING = register("chopping");

    public static RecipeBookCategory register(String id) {
        return (RecipeBookCategory) Registry.register(Registries.RECIPE_BOOK_CATEGORY, id, new RecipeBookCategory());
    }
}
