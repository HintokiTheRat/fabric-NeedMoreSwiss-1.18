package net.hintoki.crimerzboogaloo.item.custom;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponent {
    public static final FoodComponent SWISS_ROLL = new FoodComponent.Builder().hunger(8).saturationModifier(0.7f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 100, 1),0.4F).build();

    public static final FoodComponent COLORATA_SYRUP = new FoodComponent.Builder().hunger(1).saturationModifier(0.3f)
            .statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 20, 1),0.4F).build();

}
