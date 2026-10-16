package formores.rubiesandmore;

import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;

import java.util.function.Function;

public class ModBlocks {

    public static final Block RUBY_ORE = register("ruby_ore",
            properties -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    properties
            ),
            BlockBehaviour.Properties.of()
                    .strength(3.0F, 3.0F)
                    .requiresCorrectToolForDrops()
                    .mapColor(MapColor.STONE)
    );
    public static final Block DEEPSLATE_RUBY_ORE = register("deepslate_ruby_ore",
            properties -> new DropExperienceBlock(
                    UniformInt.of(3, 7),
                    properties
            ),
            BlockBehaviour.Properties.of()
                    .strength(4.5F, 3.0F)
                    .sound(SoundType.DEEPSLATE)
                    .mapColor(MapColor.DEEPSLATE)
                    .requiresCorrectToolForDrops()
    );

    public static final Block BLOCK_OF_RUBY = register("ruby_block",
            Block::new,
            BlockBehaviour.Properties.of()
                    .strength(2.5f, 4.0f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.METAL)
                    .mapColor(MapColor.COLOR_RED)
    );

    public static final Item BLOCK_OF_RUBY_ITEM = registerItem("ruby_block",
            props -> new BlockItem(BLOCK_OF_RUBY, props), new Item.Properties());

    public static final Item RUBY_ORE_ITEM = registerItem("ruby_ore",
            props -> new BlockItem(RUBY_ORE, props), new Item.Properties());
    public static final Item DEEPSLATE_RUBY_ORE_ITEM = registerItem("deepslate_ruby_ore",
            props -> new BlockItem(DEEPSLATE_RUBY_ORE, props), new Item.Properties());


    private static Block register(String name, Function<BlockBehaviour.Properties, Block> factory, BlockBehaviour.Properties properties) {
        ResourceKey<Block> key = ResourceKey.create(Registries.BLOCK, RubiesAndMore.id(name));
        return Registry.register(BuiltInRegistries.BLOCK, key, factory.apply(properties.setId(key)));
    }

    private static Item registerItem(String name, Function<Item.Properties, Item> factory, Item.Properties properties) {
        ResourceKey<Item> key = ResourceKey.create(Registries.ITEM, RubiesAndMore.id(name));
        return Registry.register(BuiltInRegistries.ITEM, key, factory.apply(properties.setId(key)));
    }

    public static void initialize() {
        // Triggers class loading
    }
}