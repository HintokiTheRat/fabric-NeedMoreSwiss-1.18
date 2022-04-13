package net.hintoki.needmoreswiss.world.feature;

import net.hintoki.needmoreswiss.NeedMoreSwiss;
import net.hintoki.needmoreswiss.block.NeedMoreSwissBlocks;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BushFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;


import java.util.List;

public class NeedMoreSwissConfigureFeatures {
    public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> COLORATA_TREE =
            ConfiguredFeatures.register("colorata_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                    BlockStateProvider.of(NeedMoreSwissBlocks.COLORATA_LOG),
                    new ForkingTrunkPlacer(6, 6, 3),
                    BlockStateProvider.of(NeedMoreSwissBlocks.COLORATA_LEAVES),
                    new BushFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 2),
                    new TwoLayersFeatureSize(2, 0, 0)).build());

    // cf -> рf -> cf ->рf
    public static final RegistryEntry<PlacedFeature> COLORATA_CHECKED = PlacedFeatures
            .register("colorata_checked", COLORATA_TREE, PlacedFeatures.wouldSurvive(NeedMoreSwissBlocks.COLORATA_SAPLING));

    public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> COLORATA_SPAWN =
            ConfiguredFeatures.register("colorata_spawn", Feature.RANDOM_SELECTOR,
                    new RandomFeatureConfig(List.of(new RandomFeatureEntry(COLORATA_CHECKED, 0.5f)),
                            COLORATA_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + NeedMoreSwiss.MOD_ID);
    }
}
