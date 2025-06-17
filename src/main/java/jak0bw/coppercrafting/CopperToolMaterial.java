package jak0bw.coppercrafting;

import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.tag.ItemTags;

/**
 * Custom tool material for steel tools.
 * Has the durability of diamond but the mining speed and level of iron.
 */
public class CopperToolMaterial {
    // Custom tag for steel ingots, used for repairing steel tools and armor
    public static final TagKey<Item> COPPER_TOOL_MATERIALS = TagKey.of(RegistryKeys.ITEM, Identifier.of("coppercrafting", "copper_ingots"));


    /**
     * Steel tool material with diamond durability but iron speed and attack damage.
     * Uses iron's mining level and enchantability between iron and diamond.
     */
    public static final ToolMaterial COPPER = new ToolMaterial(
        BlockTags.INCORRECT_FOR_IRON_TOOL,  // Same mining level as iron
        200,    // Less durability than iron
        4.0F,   // Stone mining speed
        2.0F,   // Stone attack damage bonus
        22,     // Enchantability gold
        COPPER_TOOL_MATERIALS  // Use copper ingots for repair
    );
} 