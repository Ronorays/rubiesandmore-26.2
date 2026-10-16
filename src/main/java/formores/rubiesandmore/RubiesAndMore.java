package formores.rubiesandmore;

import formores.rubiesandmore.worldgen.ModPlacedFeatures;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.resources.Identifier;

import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RubiesAndMore implements ModInitializer {
	public static final String MOD_ID = "rubiesandmore";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.initialize();
		ModBlocks.initialize();
		ModItemGroups.initialize();
		BiomeModifications.addFeature(
				BiomeSelectors.foundInOverworld(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.RUBY_ORE_PLACED_KEY
		);

// Extra veins, only in biomes with the vanilla mountain tag
		BiomeModifications.addFeature(
				BiomeSelectors.tag(BiomeTags.IS_MOUNTAIN),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				ModPlacedFeatures.RUBY_ORE_MOUNTAINS_PLACED_KEY
		);
		LOGGER.info("Rubies And More Initialized");
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}
}
