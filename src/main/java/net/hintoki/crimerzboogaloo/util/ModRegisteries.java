package net.hintoki.crimerzboogaloo.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.hintoki.crimerzboogaloo.CrimerzBoogaloo;
import net.hintoki.crimerzboogaloo.block.ModBlocks;
import net.hintoki.crimerzboogaloo.item.ModItems;

public class ModRegisteries {
    public static void registerModStuff(){
        registerFuels();
        registerFlammableBlocks();
        registerStrippables();

    }

    private  static void registerStrippables(){
        StrippableBlockRegistry.register(ModBlocks.COLORATA_LOG,ModBlocks.STRIPPED_COLORATA_LOG);
        StrippableBlockRegistry.register(ModBlocks.COLORATA_WOOD,ModBlocks.STRIPPED_COLORATA_WOOD);
    }

    private static void registerFuels(){
        CrimerzBoogaloo.LOGGER.info("Registering Fuels for" + CrimerzBoogaloo.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.COLORATA_BRANCH,200);
        registry.add(ModBlocks.COLORATA_LOG,500);
        registry.add(ModBlocks.STRIPPED_COLORATA_LOG,500);
        registry.add(ModBlocks.COLORATA_WOOD,500);
        registry.add(ModBlocks.STRIPPED_COLORATA_WOOD,500);
        registry.add(ModBlocks.COLORATA_PLANKS,600);
        registry.add(ModBlocks.COLORATA_SLAB,600);
        registry.add(ModBlocks.COLORATA_STAIRS,600);
        registry.add(ModBlocks.COLORATA_DOOR,500);
        registry.add(ModBlocks.COLORATA_TRAPDOOR,500);
        registry.add(ModBlocks.COLORATA_FENCE,500);
        registry.add(ModBlocks.COLORATA_FENCE_GATE,500);
        registry.add(ModBlocks.COLORATA_BUTTON,200);
        registry.add(ModBlocks.COLORATA_PRESSURE_PLATE,200);

    }
    private static void registerFlammableBlocks(){
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(ModBlocks.COLORATA_LEAVES,30,60);
        instance.add(ModBlocks.COLORATA_LOG,5,5);
        instance.add(ModBlocks.STRIPPED_COLORATA_LOG,5,5);
        instance.add(ModBlocks.COLORATA_WOOD,5,5);
        instance.add(ModBlocks.STRIPPED_COLORATA_WOOD,5,5);
        instance.add(ModBlocks.COLORATA_PLANKS,5,20);
        instance.add(ModBlocks.COLORATA_SLAB,5,20);
        instance.add(ModBlocks.COLORATA_STAIRS,5,20);


    }
}
