package net.timeworndevs.culinarian.emi;

import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.util.Identifier;
import net.timeworndevs.culinarian.EMI;
import net.timeworndevs.culinarian.recipes.ChoppingBlockRecipe;

import java.util.List;

public class ChoppingEmiRecipe implements EmiRecipe {
    private static Identifier id;
    private static List<EmiIngredient> input;
    private static List<EmiStack> output;

    public ChoppingEmiRecipe(ChoppingBlockRecipe recipe) {
        this.id= recipe.getId();
        this.input = List.of(EmiIngredient.of(recipe.getIngredients().get(0)));
        this.output = List.of(EmiStack.of(recipe.getOutput()));
    }

    @Override
    public EmiRecipeCategory getCategory() {
        return EMI.CHOPPING_CATEGORY;
    }

    @Override
    public Identifier getId() {
        return id;
    }

    @Override
    public List<EmiIngredient> getInputs() {
        return input;
    }

    @Override
    public List<EmiStack> getOutputs() {
        return output;
    }

    @Override
    public int getDisplayWidth() {
        return 76;
    }

    @Override
    public int getDisplayHeight() {
        return 18;
    }

    @Override
    public void addWidgets(WidgetHolder widgets) {
        widgets.addTexture(EmiTexture.FULL_ARROW, 26,1);

        widgets.addSlot(input.get(0), 0, 0);

        widgets.addSlot(output.get(0), 58, 0);
    }
}
