package net.hintoki.needmoreswiss.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;

public class NeedMoreSwissPlacefeature {
    public static final RegistryEntry<PlacedFeature> COLORATA_PLACED = PlacedFeatures.register("colorata_placed",
            NeedMoreSwissConfigureFeatures.COLORATA_SPAWN, VegetationPlacedFeatures.modifiers(
                    PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

}
