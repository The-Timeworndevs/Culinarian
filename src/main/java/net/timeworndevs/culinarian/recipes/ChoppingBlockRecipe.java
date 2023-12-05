package net.timeworndevs.culinarian.recipes;

import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.recipe.*;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.timeworndevs.culinarian.common.CommonItemRegistry;
import net.timeworndevs.culinarian.common.CommonRecipeRegistry;

public class ChoppingBlockRecipe extends CuttingRecipe {

    public static RecipeSerializer<ChoppingBlockRecipe> SERIALIZER = new ChoppingBlockRecipe.Serializer(ChoppingBlockRecipe::new);

    public ChoppingBlockRecipe(Identifier identifier, String group, Ingredient input, ItemStack output) {
        super(CommonRecipeRegistry.CHOPPING, SERIALIZER, identifier, group, input, output);
    }

    @Override
    public boolean matches(Inventory inventory, World world) {
        return this.input.test(inventory.getStack(0));
    }

    public static class Serializer extends CuttingRecipe.Serializer<ChoppingBlockRecipe> {
        protected Serializer(RecipeFactory<ChoppingBlockRecipe> recipeFactory) {
            super(recipeFactory);
        }
    }

    public ItemStack createIcon() {
        return new ItemStack(CommonItemRegistry.CHOPPING_BLOCK);
    }

}
