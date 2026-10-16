package formores.rubiesandmore;

import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public final class ModItemGroups {
    private ModItemGroups() {}

    public static final ResourceKey<CreativeModeTab> MAIN_KEY =
            ResourceKey.create(Registries.CREATIVE_MODE_TAB, RubiesAndMore.id("main"));

    public static final CreativeModeTab MAIN = Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB, MAIN_KEY,
            FabricCreativeModeTab.builder()          // was FabricItemGroup.builder()
                    .title(Component.translatable("itemGroup.rubiesandmore.main"))
                    .icon(() -> new ItemStack(ModItems.RUBY))
                    .displayItems((params, output) -> {
                        // Blocks
                        output.accept(ModBlocks.RUBY_ORE_ITEM);
                        output.accept(ModBlocks.DEEPSLATE_RUBY_ORE_ITEM);
                        output.accept(ModBlocks.BLOCK_OF_RUBY_ITEM);

                        // Materials
                        output.accept(ModItems.RUBY);
                        // Food
                        output.accept(ModItems.EMERALD_APPLE);
                        output.accept(ModItems.ENCHANTED_EMERALD_APPLE);

                        // Ruby tools and weapons
                        output.accept(ModItems.RUBY_SWORD);
                        output.accept(ModItems.RUBY_SPEAR);
                        output.accept(ModItems.RUBY_PICKAXE);
                        output.accept(ModItems.RUBY_AXE);
                        output.accept(ModItems.RUBY_SHOVEL);
                        output.accept(ModItems.RUBY_HOE);

                        // Ruby armor
                        output.accept(ModItems.RUBY_HELMET);
                        output.accept(ModItems.RUBY_CHESTPLATE);
                        output.accept(ModItems.RUBY_LEGGINGS);
                        output.accept(ModItems.RUBY_BOOTS);

                        // Emerald tools and weapons
                        output.accept(ModItems.EMERALD_SWORD);
                        output.accept(ModItems.EMERALD_AXE);
                        output.accept(ModItems.EMERALD_PICKAXE);
                        output.accept(ModItems.EMERALD_SPEAR);
                        output.accept(ModItems.EMERALD_SHOVEL);
                        output.accept(ModItems.EMERALD_HOE);

                        //Emerald Armor
                        output.accept(ModItems.EMERALD_BOOTS);
                        output.accept(ModItems.EMERALD_LEGGINGS);
                        output.accept(ModItems.EMERALD_CHESTPLATE);
                        output.accept(ModItems.EMERALD_HELMET);


                    })
                    .build());

    public static void initialize() {
        // Triggers class loading
    }
}