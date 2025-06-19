package jak0bw.coppercrafting;

import jak0bw.coppercrafting.block.CopperPressurePlateBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModBlocks {

    private static Block registerBlock(String path, Function<AbstractBlock.Settings, Block> factory, AbstractBlock.Settings settings) {
        final Identifier identifier = Identifier.of(CopperCrafting.MOD_ID, path);
        final RegistryKey<Block> registryKey = RegistryKey.of(RegistryKeys.BLOCK, identifier);

        final Block block = Blocks.register(registryKey, factory, settings);
        Items.register(block);
        return block;
    }
    
    
    public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate", 
            CopperPressurePlateBlock::new, AbstractBlock.Settings.copy(Blocks.HEAVY_WEIGHTED_PRESSURE_PLATE));


    public static void registerModBlocks() {
        CopperCrafting.LOGGER.info("Registering ModBlocks for " + CopperCrafting.MOD_ID);
    }
} 