package jak0bw.coppercrafting;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.item.*;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;
import net.minecraft.item.ItemGroups;

/**
 * Handles registration and creative tab assignment for all SteelCrafting mod items.
 */
public class ModItems {

    /**
     * Registers an item with the given name, factory, and settings.
     *
     * @param name     Path part of the identifier (e.g., "steel_ingot")
     * @param factory  Function to create the item from settings
     * @param settings Item settings
     * @return The registered Item
     */
    private static Item registerItem(String name, Function<Item.Settings, Item> factory, Item.Settings settings) {

        Identifier id = Identifier.of(CopperCrafting.MOD_ID, name);
        RegistryKey<Item> key = RegistryKey.of(RegistryKeys.ITEM, id);
        return Items.register(key, factory, settings);
    }

    // Steel Sword item
    public static final Item COPPER_SWORD = registerItem(
        "copper_sword",
        settings -> new SwordItem(CopperToolMaterial.COPPER, 3, -2.4F, settings),
        new Item.Settings()
    );

    // Steel Pickaxe item
    public static final Item COPPER_PICKAXE = registerItem(
        "copper_pickaxe",
        settings -> new PickaxeItem(CopperToolMaterial.COPPER, 1, -2.8F, settings),
        new Item.Settings()
    );

    // Copper Axe item
    public static final Item COPPER_AXE = registerItem(
        "copper_axe",
        settings -> new AxeItem(CopperToolMaterial.COPPER, 6.0F, -3.1F, settings),
        new Item.Settings()
    );

    // Copper Shovel item
    public static final Item COPPER_SHOVEL = registerItem(
        "copper_shovel",
        settings -> new ShovelItem(CopperToolMaterial.COPPER, 1.5F, -3.0F, settings),
        new Item.Settings()
    );

    // Copper Hoe item
    public static final Item COPPER_HOE = registerItem(
        "copper_hoe",
        settings -> new HoeItem(CopperToolMaterial.COPPER, -2, -1.0F, settings),
        new Item.Settings()
    );

    // Copper Helmet item
    public static final Item COPPER_HELMET = registerItem(
        "copper_helmet",
        settings -> new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentType.HELMET, settings),
        new Item.Settings().maxDamage(EquipmentType.HELMET.getMaxDamage(CopperArmorMaterial.BASE_DURABILITY))
    );
    // Copper Chestplate item
    public static final Item COPPER_CHESTPLATE = registerItem(
        "copper_chestplate",
        settings -> new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentType.CHESTPLATE, settings),
        new Item.Settings().maxDamage(EquipmentType.CHESTPLATE.getMaxDamage(CopperArmorMaterial.BASE_DURABILITY))
    );
    // Copper Leggings item
    public static final Item COPPER_LEGGINGS = registerItem(
        "copper_leggings",
        settings -> new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentType.LEGGINGS, settings),
        new Item.Settings().maxDamage(EquipmentType.LEGGINGS.getMaxDamage(CopperArmorMaterial.BASE_DURABILITY))
    );
    // Copper Boots item
    public static final Item COPPER_BOOTS = registerItem(
        "copper_boots",
        settings -> new ArmorItem(CopperArmorMaterial.INSTANCE, EquipmentType.BOOTS, settings),
        new Item.Settings().maxDamage(EquipmentType.BOOTS.getMaxDamage(CopperArmorMaterial.BASE_DURABILITY))
    );

    /**
     * Registers all mod items to their respective creative tabs.
     * Should be called during mod initialization.
     */
    public static void registerModItems() {


        
        CopperCrafting.LOGGER.info("Adding Mod Items to creative tabs for " + CopperCrafting.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(entries -> {
            entries.add(COPPER_PICKAXE);
            entries.add(COPPER_AXE);
            entries.add(COPPER_SHOVEL);
            entries.add(COPPER_HOE);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.COMBAT).register(entries -> {
            entries.add(COPPER_SWORD);
            entries.add(COPPER_AXE);
            entries.add(COPPER_HELMET);
            entries.add(COPPER_CHESTPLATE);
            entries.add(COPPER_LEGGINGS);
            entries.add(COPPER_BOOTS);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(entries -> {
            entries.add(ModBlocks.COPPER_PRESSURE_PLATE);
        });
    }

} 