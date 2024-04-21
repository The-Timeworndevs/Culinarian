package net.timeworndevs.culinarian;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.util.Identifier;
import net.timeworndevs.culinarian.common.CommonItemRegistry;

public class EMI implements EmiPlugin {

    public static final Identifier CHOPPING_SCREEN = new Identifier(Main.MODID, "textures/gui/emi_simplified_textures.png");
    public static final EmiStack CHOPPING_STATION = EmiStack.of(CommonItemRegistry.CHOPPING_BLOCK);
    public static final EmiRecipeCategory CHOPPING_CATEGORY = new EmiRecipeCategory(new Identifier(Main.MODID, "chopping_station"), CHOPPING_STATION, new EmiTexture(CHOPPING_SCREEN, 0, 0, 16, 16));

    @Override
    public void register(EmiRegistry registry) {
        registry.addCategory(CHOPPING_CATEGORY);

        registry.addWorkstation(CHOPPING_CATEGORY, CHOPPING_STATION);
    }
}
