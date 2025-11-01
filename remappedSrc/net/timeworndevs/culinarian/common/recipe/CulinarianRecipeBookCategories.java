package net.timeworndevs.culinarian.common.recipe;

import com.nimbusds.oauth2.sdk.id.Identifier;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.crafting.RecipeBookCategories;
import net.minecraft.world.item.crafting.RecipeBookCategory;

public class CulinarianRecipeBookCategories extends RecipeBookCategories {

    public static final RecipeBookCategory CHOPPING = register("chopping");

    public static RecipeBookCategory register(String id) {
        return (RecipeBookCategory) Registry.register(BuiltInRegistries.RECIPE_BOOK_CATEGORY, id, new RecipeBookCategory());
    }
}
