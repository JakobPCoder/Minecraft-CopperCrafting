package jak0bw.coppercrafting;

import net.minecraft.item.ToolMaterial;

import net.minecraft.registry.tag.BlockTags;

/**
 * Custom tool material for steel tools.
 * Has the durability of diamond but the mining speed and level of iron.
 */
public class CopperToolMaterial {


    /**
     * Copper tools can mine the same blocks as stone tools/weapons.
     * They have a durability between stone and iron.
     * They have a mining speed between stone and iron.
     * They do the same damage as stone weapons.
     * They have an enchantability between way higher than iron and a bit below gold.
     * They use copper ingots for repair.
     */
    public static final ToolMaterial COPPER = new ToolMaterial(
        BlockTags.INCORRECT_FOR_IRON_TOOL,  // Same mining level as iron
        200,    // Less durability than iron
        5.0F,   // Between stone and iron mining speed
        1.0F,   // Stone attack damage bonus
        20,     // Enchantability between iron and gold
        CopperCraftingItemTags.REPAIRS_COPPER_TOOL // Use copper ingots for repair
    );
} 