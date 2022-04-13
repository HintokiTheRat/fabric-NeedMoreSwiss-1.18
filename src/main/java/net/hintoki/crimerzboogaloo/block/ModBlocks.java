package net.hintoki.crimerzboogaloo.block;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.hintoki.crimerzboogaloo.CrimerzBoogaloo;
import net.hintoki.crimerzboogaloo.block.custom.*;
import net.hintoki.crimerzboogaloo.item.ModItemGroup;
import net.hintoki.crimerzboogaloo.world.feature.tree.ColorataSaplingGenerator;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    // Colorata related blocks
    public static final Block COLORATA_SAPLING = registerBlock("colorata_sapling",
            new ModSaplingBlock( new ColorataSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING).nonOpaque().breakInstantly()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block POTTED_COLORATA_SAPLING = registerBlockWithoutBlockItem("potted_colorata_sapling",
            new FlowerPotBlock( ModBlocks.COLORATA_SAPLING,
                    FabricBlockSettings.copy(Blocks.POTTED_OAK_SAPLING).nonOpaque().breakInstantly()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_LEAVES = registerBlock("colorata_leaves",
            new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).nonOpaque()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_LOG = registerBlock("colorata_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block STRIPPED_COLORATA_LOG = registerBlock("stripped_colorata_log",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_WOOD = registerBlock("colorata_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block STRIPPED_COLORATA_WOOD = registerBlock("stripped_colorata_wood",
            new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);


    public static final Block COLORATA_PLANKS = registerBlock("colorata_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);



    public static final Block COLORATA_BUTTON = registerBlock("colorata_button",
            new ModWoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON).strength(2f).requiresTool().noCollision()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_PRESSURE_PLATE = registerBlock("colorata_pressure_plate",
            new ModPressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
                    .strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_FENCE = registerBlock("colorata_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_FENCE_GATE = registerBlock("colorata_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_LOGS_WALL = registerBlock("colorata_logs_wall",
            new WallBlock(FabricBlockSettings.of(Material.WOOD).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_SLAB = registerBlock("colorata_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_STAIRS = registerBlock("colorata_stairs", new ModStairsBlock(ModBlocks.COLORATA_PLANKS
            .getDefaultState(), FabricBlockSettings.copy(Blocks.OAK_STAIRS).strength(2f).requiresTool()), ModItemGroup.CRIMERZBOOGALOO_GROUP);


    public static final Block COLORATA_DOOR = registerBlock("colorata_door", new ModDoorBlock(
            FabricBlockSettings.copy(Blocks.OAK_DOOR).strength(2f).requiresTool().nonOpaque()), ModItemGroup.CRIMERZBOOGALOO_GROUP);

    public static final Block COLORATA_TRAPDOOR= registerBlock("colorata_trapdoor", new ModTrapdoorBlock(
            FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR).strength(2f).requiresTool().nonOpaque()), ModItemGroup.CRIMERZBOOGALOO_GROUP);



    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup itemGroup){
        return Registry.register(Registry.BLOCK, new Identifier(CrimerzBoogaloo.MOD_ID,name), block);
    }

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup){
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(CrimerzBoogaloo.MOD_ID,name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup){
        return Registry.register(Registry.ITEM, new Identifier(CrimerzBoogaloo.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }

    public static void registerModBlocks(){
        CrimerzBoogaloo.LOGGER.info("Registering Mod Blocks for " + CrimerzBoogaloo.MOD_ID);
    }


}
