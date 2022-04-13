package net.hintoki.needmoreswiss.util;

import net.hintoki.needmoreswiss.NeedMoreSwiss;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NeedMoreSwissTags {
    public static class Blocks{
        public  static  final TagKey<Block> COLORATA_LOG = createCommonTag("colorata_log");
        public  static  final TagKey<Block> COLORATA_PLANKS = createCommonTag("colorata_planks");

        private static TagKey<Block> createTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier(NeedMoreSwiss.MOD_ID,name));
        }
        private static TagKey<Block> createCommonTag(String name){
            return TagKey.of(Registry.BLOCK_KEY, new Identifier("c",name));
        }

    }
    public static class Items{


        private static TagKey<Item> createTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier(NeedMoreSwiss.MOD_ID,name));
        }
        private static TagKey<Item> createCommonTag(String name){
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c",name));
        }

    }
}
