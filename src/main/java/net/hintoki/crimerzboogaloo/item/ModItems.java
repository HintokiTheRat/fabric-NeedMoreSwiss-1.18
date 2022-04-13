package net.hintoki.crimerzboogaloo.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hintoki.crimerzboogaloo.CrimerzBoogaloo;
import net.hintoki.crimerzboogaloo.item.custom.ModFoodComponent;
import net.hintoki.crimerzboogaloo.item.custom.ModKnockbackBaseballBatItem;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item COLORATA_BRANCH = registerItem("colorata_branch",
            new Item( new FabricItemSettings().group(ModItemGroup.CRIMERZBOOGALOO_GROUP)));

    public static final Item COLORATA_SWISS_ROLL = registerItem("colorata_swiss_roll",
            new Item( new FabricItemSettings().group(ModItemGroup.CRIMERZBOOGALOO_GROUP).food(ModFoodComponent.SWISS_ROLL)));

    public static final Item COLORATA_SYRUP = registerItem("colorata_syrup",
            new HoneyBottleItem( new FabricItemSettings().group(ModItemGroup.CRIMERZBOOGALOO_GROUP).food(ModFoodComponent.COLORATA_SYRUP)));

    public static final Item GOLDEN_BASEBALL_BAT = registerItem("golden_baseball_bat",
            new ModKnockbackBaseballBatItem(ModToolMaterials.BOOST_GOLD,2,-2.2f, new FabricItemSettings().group(ModItemGroup.CRIMERZBOOGALOO_GROUP)));

    public static final Item NAILED_BASEBALL_BAT = registerItem("nailed_baseball_bat",
            new ModKnockbackBaseballBatItem(ModToolMaterials.BOOST_WOOD,3,-2.0f, new FabricItemSettings().group(ModItemGroup.CRIMERZBOOGALOO_GROUP)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(CrimerzBoogaloo.MOD_ID,name), item);
    }
    public static void registerModItems(){
        CrimerzBoogaloo.LOGGER.info("Registering Mod Items for " + CrimerzBoogaloo.MOD_ID);

    }
}
