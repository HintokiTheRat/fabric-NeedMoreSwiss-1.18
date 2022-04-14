package net.hintoki.needmoreswiss.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hintoki.needmoreswiss.NeedMoreSwiss;
import net.hintoki.needmoreswiss.block.custom.*;
import net.hintoki.needmoreswiss.item.NeedMoreSwissItemGroup;
import net.hintoki.needmoreswiss.world.feature.tree.ColorataSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NeedMoreSwissBlocks {

    // Colorata related blocks
    public static final Block COLORATA_SAPLING = registerBlock("colorata_sapling",
            new NeedMoreSwissSaplingBlock( new ColorataSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque().breakInstantly()), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block POTTED_COLORATA_SAPLING = registerBlockWithoutBlockItem("potted_colorata_sapling",
            new FlowerPotBlock( NeedMoreSwissBlocks.COLORATA_SAPLING,
                    FabricBlockSettings.copy(Blocks.POTTED_OAK_SAPLING).nonOpaque().breakInstantly()), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_LEAVES = registerBlock("colorata_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_LOG = registerBlock("colorata_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block STRIPPED_COLORATA_LOG = registerBlock("stripped_colorata_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_WOOD = registerBlock("colorata_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block STRIPPED_COLORATA_WOOD = registerBlock("stripped_colorata_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);


    public static final Block COLORATA_PLANKS = registerBlock("colorata_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);



    public static final Block COLORATA_BUTTON = registerBlock("colorata_button",
            new NeedMoreSwissWoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON).strength(2f).noCollision()), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_PRESSURE_PLATE = registerBlock("colorata_pressure_plate",
            new NeedMoreSwissPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
                    .strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_FENCE = registerBlock("colorata_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_FENCE_GATE = registerBlock("colorata_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_LOGS_WALL = registerBlock("colorata_logs_wall",
            new WallBlock(FabricBlockSettings.of(Material.WOOD).strength(2f).sounds(BlockSoundGroup.WOOD)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_SLAB = registerBlock("colorata_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_STAIRS = registerBlock("colorata_stairs", new NeedMoreSwissStairsBlock(NeedMoreSwissBlocks.COLORATA_PLANKS
            .getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS).strength(2f)), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);


    public static final Block COLORATA_DOOR = registerBlock("colorata_door", new NeedMoreSwissDoorBlock(
            FabricBlockSettings.copy(Blocks.OAK_DOOR).strength(2f).nonOpaque()), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_TRAPDOOR= registerBlock("colorata_trapdoor", new NeedMoreSwissTrapdoorBlock(
            FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR).strength(2f).nonOpaque()), NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP);



    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup itemGroup){
        return Registry.register(Registry.BLOCK, new Identifier(NeedMoreSwiss.MOD_ID,name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup){
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(NeedMoreSwiss.MOD_ID,name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup){
        return Registry.register(Registry.ITEM, new Identifier(NeedMoreSwiss.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }

    public static void registerModBlocks(){
        NeedMoreSwiss.LOGGER.info("Registering Mod Blocks for " + NeedMoreSwiss.MOD_ID);
    }


}
