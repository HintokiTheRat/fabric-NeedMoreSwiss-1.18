package net.hintoki.needmoreswiss.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.hintoki.needmoreswiss.NeedMoreSwiss;
import net.hintoki.needmoreswiss.block.NeedMoreSwissBlocks;
import net.hintoki.needmoreswiss.item.NeedMoreSwissItems;

public class NeedMoreSwissRegisteries {
    public static void registerModStuff(){
        registerFuels();
        registerFlammableBlocks();
        registerStrippables();

    }

    private  static void registerStrippables(){
        StrippableBlockRegistry.register(NeedMoreSwissBlocks.COLORATA_LOG, NeedMoreSwissBlocks.STRIPPED_COLORATA_LOG);
        StrippableBlockRegistry.register(NeedMoreSwissBlocks.COLORATA_WOOD, NeedMoreSwissBlocks.STRIPPED_COLORATA_WOOD);
    }

    private static void registerFuels(){
        NeedMoreSwiss.LOGGER.info("Registering Fuels for" + NeedMoreSwiss.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(NeedMoreSwissItems.COLORATA_BRANCH,200);
        registry.add(NeedMoreSwissBlocks.COLORATA_LOG,500);
        registry.add(NeedMoreSwissBlocks.STRIPPED_COLORATA_LOG,500);
        registry.add(NeedMoreSwissBlocks.COLORATA_WOOD,500);
        registry.add(NeedMoreSwissBlocks.STRIPPED_COLORATA_WOOD,500);
        registry.add(NeedMoreSwissBlocks.COLORATA_PLANKS,600);
        registry.add(NeedMoreSwissBlocks.COLORATA_SLAB,600);
        registry.add(NeedMoreSwissBlocks.COLORATA_STAIRS,600);
        registry.add(NeedMoreSwissBlocks.COLORATA_DOOR,500);
        registry.add(NeedMoreSwissBlocks.COLORATA_TRAPDOOR,500);
        registry.add(NeedMoreSwissBlocks.COLORATA_FENCE,500);
        registry.add(NeedMoreSwissBlocks.COLORATA_FENCE_GATE,500);
        registry.add(NeedMoreSwissBlocks.COLORATA_BUTTON,200);
        registry.add(NeedMoreSwissBlocks.COLORATA_PRESSURE_PLATE,200);

    }
    private static void registerFlammableBlocks(){
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(NeedMoreSwissBlocks.COLORATA_LEAVES,30,60);
        instance.add(NeedMoreSwissBlocks.COLORATA_LOG,5,5);
        instance.add(NeedMoreSwissBlocks.STRIPPED_COLORATA_LOG,5,5);
        instance.add(NeedMoreSwissBlocks.COLORATA_WOOD,5,5);
        instance.add(NeedMoreSwissBlocks.STRIPPED_COLORATA_WOOD,5,5);
        instance.add(NeedMoreSwissBlocks.COLORATA_PLANKS,5,20);
        instance.add(NeedMoreSwissBlocks.COLORATA_SLAB,5,20);
        instance.add(NeedMoreSwissBlocks.COLORATA_STAIRS,5,20);


    }
}
