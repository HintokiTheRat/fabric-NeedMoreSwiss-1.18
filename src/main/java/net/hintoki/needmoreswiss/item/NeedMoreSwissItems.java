package net.hintoki.needmoreswiss.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.hintoki.needmoreswiss.NeedMoreSwiss;
import net.hintoki.needmoreswiss.item.custom.NeedMoreSwissFoodComponent;
import net.minecraft.item.HoneyBottleItem;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NeedMoreSwissItems {

    public static final Item COLORATA_BRANCH = registerItem("colorata_branch",
            new Item( new FabricItemSettings().group(NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP)));

    public static final Item COLORATA_SWISS_ROLL = registerItem("colorata_swiss_roll",
            new Item( new FabricItemSettings().group(NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP).food(NeedMoreSwissFoodComponent.SWISS_ROLL)));

    public static final Item COLORATA_SYRUP = registerItem("colorata_syrup",
            new HoneyBottleItem( new FabricItemSettings().group(NeedMoreSwissItemGroup.CRIMERZBOOGALOO_GROUP).food(NeedMoreSwissFoodComponent.COLORATA_SYRUP)));



    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(NeedMoreSwiss.MOD_ID,name), item);
    }
    public static void registerModItems(){
        NeedMoreSwiss.LOGGER.info("Registering Mod Items for " + NeedMoreSwiss.MOD_ID);

    }
}
