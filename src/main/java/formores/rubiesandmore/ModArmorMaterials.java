package formores.rubiesandmore;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;

public final class ModArmorMaterials {
    private ModArmorMaterials() {}

    public static final int BASE_DURABILITY = 34;

    public static final TagKey<Item> RUBY_REPAIR = ModToolMaterials.RUBY_REPAIR;
    public static final TagKey<Item> EMERALD_REPAIR =
            TagKey.create(Registries.ITEM, RubiesAndMore.id("emerald_repair"));

    // Equipment Asset Keys
    public static final ResourceKey<EquipmentAsset> RUBY_ASSET =
            ResourceKey.create(EquipmentAssets.ROOT_ID, RubiesAndMore.id("ruby"));
    public static final ResourceKey<EquipmentAsset> EMERALD_ASSET =
            ResourceKey.create(EquipmentAssets.ROOT_ID, RubiesAndMore.id("emerald"));

    // Ruby Armor
    public static final ArmorMaterial RUBY = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 8,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 3
            ),
            22,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            RUBY_REPAIR,
            RUBY_ASSET
    );

    // Emerald Armor
    public static final ArmorMaterial EMERALD = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 8,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 3
            ),
            25,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            2.0f,
            0.0f,
            EMERALD_REPAIR, // Uses TagKey instead of Ingredient
            EMERALD_ASSET
    );
}