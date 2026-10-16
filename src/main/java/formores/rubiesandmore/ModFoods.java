package formores.rubiesandmore;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.consume_effects.ApplyStatusEffectsConsumeEffect;
import net.minecraft.world.item.component.Consumable;
import net.minecraft.world.item.component.Consumables;

import java.util.List;

public final class ModFoods {
    private ModFoods() {}

    // --- Enchanted Emerald Apple ---
    public static final FoodProperties ENCHANTED_EMERALD_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(1.2f)
            .alwaysEdible()
            .build();

    public static final Consumable ENCHANTED_EMERALD_APPLE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(List.of(
                    new MobEffectInstance(MobEffects.REGENERATION, 400, 1),      // 20s, II
                    new MobEffectInstance(MobEffects.RESISTANCE, 6000, 0),       // 5 min, I
                    new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 6000, 0),  // 5 min
                    new MobEffectInstance(MobEffects.ABSORPTION, 2400, 3)        // 2 min, IV
            ), 1.0f))
            .build();

    // --- Emerald Apple ---
    public static final FoodProperties EMERALD_APPLE = new FoodProperties.Builder()
            .nutrition(4)
            .saturationModifier(0.3f)
            .alwaysEdible()
            .build();

    public static final Consumable EMERALD_APPLE_CONSUMABLE = Consumables.defaultFood()
            .onConsume(new ApplyStatusEffectsConsumeEffect(
                    List.of(new MobEffectInstance(MobEffects.REGENERATION, 100, 1)), // 5s, level II
                    1.0f)) // probability
            .build();

    /** Apply any food to item properties in one call. */
    public static Item.Properties apply(Item.Properties props, FoodProperties food, Consumable consumable) {
        return props.food(food, consumable);
    }
}