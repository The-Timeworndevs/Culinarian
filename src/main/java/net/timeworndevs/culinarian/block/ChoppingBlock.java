package net.timeworndevs.culinarian.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.StonecutterBlock;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import net.minecraft.util.ActionResult;

public class ChoppingBlock extends Block {
    private static final Text TITLE = Text.translatable("container.culinarian.chopping_block");
    public ChoppingBlock(Settings settings) {
        super(settings);
    }

    //@Override
    //public ActionResult onUse(BlockState state)

}
