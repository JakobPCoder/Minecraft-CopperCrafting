package jak0bw.coppercrafting;

import net.minecraft.item.equipment.ArmorMaterial;
import net.minecraft.item.equipment.ArmorMaterials;
import net.minecraft.item.equipment.EquipmentAsset;
import net.minecraft.item.equipment.EquipmentAssetKeys;
import net.minecraft.item.equipment.EquipmentType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.item.Item;

import java.util.Map;

/**
 * Holds the registry key and registration method for the copper armor material.
 */
public class CopperArmorMaterial {
    /**
     * Base durability multiplier for copper armor (slightly less than iron).
     */
    public static final int BASE_DURABILITY = 12;


    /**
     * Registry key for the copper armor material asset.
     */
    public static final RegistryKey<EquipmentAsset> COPPER_ARMOR_MATERIAL_KEY =  RegistryKey.of(EquipmentAssetKeys.REGISTRY_KEY, Identifier.of("coppercrafting", "copper"));

    /**
     * The copper armor material instance, using iron-like values.
     */
    public static final ArmorMaterial INSTANCE = new ArmorMaterial(
        BASE_DURABILITY,
        Map.of(
            EquipmentType.HELMET, 2,
            EquipmentType.CHESTPLATE, 4,
            EquipmentType.LEGGINGS, 4,
            EquipmentType.BOOTS, 2,
            EquipmentType.BODY, 6 // whatever this is. 
        ),
        22, // Enchantability 
        SoundEvents.ITEM_ARMOR_EQUIP_GOLD,
        0.0F, // Toughness 
        0.0F, // Knockback resistance 
        CopperCraftingItemTags.REPAIRS_COPPER_ARMOR,
        COPPER_ARMOR_MATERIAL_KEY
    );
} 