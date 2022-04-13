package net.hintoki.needmoreswiss.world.feature.tree;

import net.hintoki.needmoreswiss.world.feature.NeedMoreSwissConfigureFeatures;
import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import org.jetbrains.annotations.Nullable;

import java.util.Random;

public class ColorataSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return NeedMoreSwissConfigureFeatures.COLORATA_TREE;
    }
}
