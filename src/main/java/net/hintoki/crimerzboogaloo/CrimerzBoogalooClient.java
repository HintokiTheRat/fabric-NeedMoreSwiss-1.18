package net.hintoki.crimerzboogaloo;

import net.fabricmc.api.ClientModInitializer;
import net.hintoki.crimerzboogaloo.block.ModBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class CrimerzBoogalooClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
            BlockRenderLayerMap.INSTANCE.putBlock((ModBlocks.COLORATA_SAPLING),RenderLayer.getCutout());
        	BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COLORATA_LEAVES, RenderLayer.getCutout());
        	BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.COLORATA_LEAVES, RenderLayer.getTranslucent());

        	BlockRenderLayerMap.INSTANCE.putBlock((ModBlocks.COLORATA_DOOR),RenderLayer.getCutout());
        	BlockRenderLayerMap.INSTANCE.putBlock((ModBlocks.COLORATA_TRAPDOOR),RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock((ModBlocks.POTTED_COLORATA_SAPLING),RenderLayer.getCutout());



    }
}
