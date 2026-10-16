package formores.rubiesandmore;

import net.minecraft.core.registries.Registries;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public final class ModToolMaterials {
    private ModToolMaterials() {}

    // Items that can repair ruby tools (defined in data/rubiesandmore/tags/item/ruby_repair.json)
    public static final TagKey<Item> RUBY_REPAIR =
            TagKey.create(Registries.ITEM, RubiesAndMore.id("ruby_repair"));

    // Items that can repair emerald tools (defined in data/rubiesandmore/tags/item/emerald_repair.json)
    public static final TagKey<Item> EMERALD_REPAIR =
            TagKey.create(Registries.ITEM, RubiesAndMore.id("emerald_repair"));

    // Diamond-tier mining, 1653 durability, 8.0 mining speed, 3.0 base damage bonus, 18 enchantability[cite: 9]
    public static final ToolMaterial RUBY = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1653,
            8.0f,
            3.0f,
            18,
            RUBY_REPAIR
    );

    // Diamond-tier mining, 1561 durability, 8.0 mining speed, 3.0 base damage bonus, 20 enchantability
    public static final ToolMaterial EMERALD = new ToolMaterial(
            BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
            1561,   // durability (diamond 1561, iron 250)
            8f,   // mining speed (diamond 8.0)
            3f,   // damage bonus (diamond 3.0)
            15,     // enchantability (diamond 10, ruby 18)
            EMERALD_REPAIR
    );
}