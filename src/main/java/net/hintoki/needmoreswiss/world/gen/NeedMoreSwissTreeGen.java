package net.hintoki.needmoreswiss.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.hintoki.needmoreswiss.world.feature.NeedMoreSwissPlacefeature;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;

public class NeedMoreSwissTreeGen {
    public static void generateTree(){
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, NeedMoreSwissPlacefeature.COLORATA_PLACED.getKey().get());
    }
}
