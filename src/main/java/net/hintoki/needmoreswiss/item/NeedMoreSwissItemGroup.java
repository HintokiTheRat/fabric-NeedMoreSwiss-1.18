package net.hintoki.needmoreswiss.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.hintoki.needmoreswiss.NeedMoreSwiss;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class NeedMoreSwissItemGroup {
    public  static final ItemGroup CRIMERZBOOGALOO_GROUP = FabricItemGroupBuilder.build(new Identifier(NeedMoreSwiss.MOD_ID,"crimerzboogaloo_group"),
            () -> new ItemStack(NeedMoreSwissItems.COLORATA_BRANCH));
}
