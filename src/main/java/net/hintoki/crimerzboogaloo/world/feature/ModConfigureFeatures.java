package net.hintoki.crimerzboogaloo.world.feature;

import net.hintoki.crimerzboogaloo.CrimerzBoogaloo;
import net.hintoki.crimerzboogaloo.block.ModBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.BendingTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;


import java.util.List;

public class ModConfigureFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> COLORATA_TREE =
            ConfiguredFeatures.register("jacaranda_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(ModBlocks.COLORATA_LOG),
                    new ForkingTrunkPlacer(6, 6, 3),
                    BlockStateProvider.of(ModBlocks.COLORATA_LEAVES),
                    new BushFoliagePlacer(ConstantIntProvider.create(3), ConstantIntProvider.create(1), 2),
                    new TwoLayersFeatureSize(1, 0, 3)).build());

    // cf -> рf -> cf ->рf
    public static final RegistryEntry<PlacedFeature> COLORATA_CHECKED = PlacedFeatures
            .register("colorata_checked", COLORATA_TREE, PlacedFeatures.wouldSurvive(ModBlocks.COLORATA_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> COLORATA_SPAWN =
            ConfiguredFeatures.register("colorata_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(COLORATA_CHECKED, 0.5f)),
                            COLORATA_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + CrimerzBoogaloo.MOD_ID);
    }
}
