package net.craftinc747.swell_blocks.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.BlockItem;

import java.util.function.Supplier;

public class ModBlocks {
    public static final RegistryObject<Block> SILVER_ORE = register("silver_ore", () ->
        new Block(AbstractBlock.Properties.create(Material.ROCK));

    static void register (){}

    private static <T extends Block>RegistryObject<T> registerNoItem(String name, Supplier<T> block) {

        return Registration.BLOCKS.register(name, block);

    }

    private static <T extends Block> RegistryObject<T> register(String name, Supplier<T> block) {

        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name, () -> new BlockItem(ret.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

        return ret;
    }

}
