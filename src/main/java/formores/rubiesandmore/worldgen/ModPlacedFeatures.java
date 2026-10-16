package formores.rubiesandmore.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

import formores.rubiesandmore.RubiesAndMore;

public final class ModPlacedFeatures {
    private ModPlacedFeatures() {}

    // data/rubiesandmore/worldgen/placed_feature/ruby_ore.json
    public static final ResourceKey<PlacedFeature> RUBY_ORE_PLACED_KEY = ResourceKey.create(
            Registries.PLACED_FEATURE,
            RubiesAndMore.id("ruby_ore")
    );

    // data/rubiesandmore/worldgen/placed_feature/ruby_ore_mountains.json
    public static final ResourceKey<PlacedFeature> RUBY_ORE_MOUNTAINS_PLACED_KEY = ResourceKey.create(
            Registries.PLACED_FEATURE,
            RubiesAndMore.id("ruby_ore_mountains")
    );
}