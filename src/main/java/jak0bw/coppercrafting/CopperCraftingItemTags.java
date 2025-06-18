package jak0bw.coppercrafting;

import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class CopperCraftingItemTags {
    /**
     * Tag for copper ingots, used for repairing copper armor.
     */
    public static final TagKey<Item> REPAIRS_COPPER_ARMOR = TagKey.of(net.minecraft.registry.RegistryKeys.ITEM, Identifier.of("coppercrafting", "repairs_copper_armor"));

    /**
     * Tag for copper ingots, used for repairing copper tools.
     */
    public static final TagKey<Item> REPAIRS_COPPER_TOOL = TagKey.of(net.minecraft.registry.RegistryKeys.ITEM, Identifier.of("coppercrafting", "repairs_copper_tool"));

}
