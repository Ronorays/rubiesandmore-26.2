package formores.rubiesandmore;

import net.minecraft.core.Registry;
import net.minecraft.core.component.DataComponents;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {

    // Ruby Item
    public static final Item RUBY = register("ruby", Item::new, new Item.Properties());


    // --- RUBY WEAPONS & TOOLS ---
    // Total damage = bonus + material (3.0) + 1.0 base. Speed modifier = speed - 4.0.

    // 7.5 damage | 1.6 speed
    public static final Item RUBY_SWORD = register("ruby_sword", Item::new,
            new Item.Properties().sword(ModToolMaterials.RUBY, 3.5f, -2.4f));

    // 9.0 damage | 1.0 speed
    public static final Item RUBY_AXE = register("ruby_axe",
            props -> new AxeItem(ModToolMaterials.RUBY, 5.0f, -3.0f, props),
            new Item.Properties());

    // 5.0 damage | 1.2 speed
    public static final Item RUBY_PICKAXE = register("ruby_pickaxe", Item::new,
            new Item.Properties().pickaxe(ModToolMaterials.RUBY, 1.0f, -2.8f));

    // 6.0 damage | 1.0 speed
    public static final Item RUBY_SHOVEL = register("ruby_shovel",
            props -> new ShovelItem(ModToolMaterials.RUBY, 2.0f, -3.0f, props),
            new Item.Properties());

    // 1.0 damage | 3.5 speed
    public static final Item RUBY_HOE = register("ruby_hoe",
            props -> new HoeItem(ModToolMaterials.RUBY, -3.0f, -0.5f, props),
            new Item.Properties());

    // 4.0 damage | 1.1 speed (sword-style stand-in; vanilla spears have their own, more complex properties)
    public static final Item RUBY_SPEAR = register("ruby_spear", Item::new,
            new Item.Properties().spear(ModToolMaterials.RUBY,
                    1.0f,   // swing seconds
                    1.05f,  // charge damage multiplier
                    0.5f,   // delay seconds
                    0.5f, 0.6f, 3.5f, 3f, 9f, 0.2f)); // your original tail values// EMERALD TOOLS

    //EMERALD TOOLS
    public static final Item EMERALD_SWORD = register("emerald_sword", Item::new,
            new Item.Properties().sword(ModToolMaterials.EMERALD, 3.5f, -2.4f));
    public static final Item EMERALD_AXE = register("emerald_axe", Item::new,
            new Item.Properties().axe(ModToolMaterials.EMERALD, 5.0f, -3f));
    public static final Item EMERALD_PICKAXE = register("emerald_pickaxe", Item::new,
            new Item.Properties().pickaxe(ModToolMaterials.EMERALD, 1.0f, -2.8f));
    public static final Item EMERALD_SHOVEL = register("emerald_shovel", Item::new,
            new Item.Properties().shovel(ModToolMaterials.EMERALD, 2.0f, -3.0f));
    public static final Item EMERALD_HOE = register("emerald_hoe", Item::new,
            new Item.Properties().hoe(ModToolMaterials.EMERALD, -3.0f, 0.5f));
    // Jab: 3.5 damage at ~0.95 speed (~3.3 DPS; diamond ~3.8)
    // Charge multiplier 1.0 (diamond 1.075)
    public static final Item EMERALD_SPEAR = register("emerald_spear", Item::new,
            new Item.Properties().spear(ModToolMaterials.EMERALD,
                    1.05f,  // swing seconds (same as diamond)
                    1.0f,   // charge damage multiplier
                    0.55f,  // delay seconds (diamond 0.5)
                    0.5f, 0.6f, 3.5f, 3f, 9f, 0.2f)); // same tail as ruby; swap in Items.DIAMOND_SPEAR's values if you copy them

    public static final Item EMERALD_APPLE = register("emerald_apple", Item::new,
            new Item.Properties()
                    .food(ModFoods.EMERALD_APPLE, ModFoods.EMERALD_APPLE_CONSUMABLE)
                    .rarity(Rarity.RARE));

    public static final Item ENCHANTED_EMERALD_APPLE = register("enchanted_emerald_apple", Item::new,
            new Item.Properties()
                    .food(ModFoods.ENCHANTED_EMERALD_APPLE, ModFoods.ENCHANTED_EMERALD_APPLE_CONSUMABLE)
                    .component(DataComponents.ENCHANTMENT_GLINT_OVERRIDE, true)
                    .rarity(Rarity.EPIC)); // optional: purple name like the vanilla one

    // --- RUBY ARMOR ---
    public static final Item RUBY_HELMET = register("ruby_helmet", Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.RUBY, ArmorType.HELMET)
                    .durability(ArmorType.HELMET.getDurability(ModArmorMaterials.BASE_DURABILITY)));
    public static final Item RUBY_CHESTPLATE = register("ruby_chestplate", Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.RUBY, ArmorType.CHESTPLATE)
                    .durability(ArmorType.CHESTPLATE.getDurability(ModArmorMaterials.BASE_DURABILITY)));
    public static final Item RUBY_LEGGINGS = register("ruby_leggings", Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.RUBY, ArmorType.LEGGINGS)
                    .durability(ArmorType.LEGGINGS.getDurability(ModArmorMaterials.BASE_DURABILITY)));
    public static final Item RUBY_BOOTS = register("ruby_boots", Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.RUBY, ArmorType.BOOTS)
                    .durability(ArmorType.BOOTS.getDurability(ModArmorMaterials.BASE_DURABILITY)));

    // EMERALD ARMOR
    public static Item EMERALD_HELMET = register("emerald_helmet", Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.EMERALD, ArmorType.HELMET)
                    .durability(ArmorType.HELMET.getDurability(ModArmorMaterials.BASE_DURABILITY)));
    public static final Item EMERALD_CHESTPLATE = register("emerald_chestplate", Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.EMERALD, ArmorType.CHESTPLATE)
                    .durability(ArmorType.CHESTPLATE.getDurability(ModArmorMaterials.BASE_DURABILITY)));
    public static final Item EMERALD_LEGGINGS = register("emerald_leggings", Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.EMERALD, ArmorType.LEGGINGS)
                    .durability(ArmorType.LEGGINGS.getDurability(ModArmorMaterials.BASE_DURABILITY)));
    public static final Item EMERALD_BOOTS = register("emerald_boots", Item::new,
            new Item.Properties().humanoidArmor(ModArmorMaterials.EMERALD, ArmorType.BOOTS)
                    .durability(ArmorType.BOOTS.getDurability(ModArmorMaterials.BASE_DURABILITY)));

    private static Item register(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, RubiesAndMore.id(name));
        return Registry.register(BuiltInRegistries.ITEM, key, factory.apply(properties.setId(key)));
    }

    public static void initialize() {
    }
}
