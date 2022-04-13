package net.hintoki.needmoreswiss;

import net.fabricmc.api.ClientModInitializer;
import net.hintoki.needmoreswiss.block.NeedMoreSwissBlocks;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class NeedMoreSwissClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
            BlockRenderLayerMap.INSTANCE.putBlock((NeedMoreSwissBlocks.COLORATA_SAPLING),RenderLayer.getCutout());
        	BlockRenderLayerMap.INSTANCE.putBlock(NeedMoreSwissBlocks.COLORATA_LEAVES, RenderLayer.getCutout());
        	BlockRenderLayerMap.INSTANCE.putBlock(NeedMoreSwissBlocks.COLORATA_LEAVES, RenderLayer.getTranslucent());

        	BlockRenderLayerMap.INSTANCE.putBlock((NeedMoreSwissBlocks.COLORATA_DOOR),RenderLayer.getCutout());
        	BlockRenderLayerMap.INSTANCE.putBlock((NeedMoreSwissBlocks.COLORATA_TRAPDOOR),RenderLayer.getCutout());
            BlockRenderLayerMap.INSTANCE.putBlock((NeedMoreSwissBlocks.POTTED_COLORATA_SAPLING),RenderLayer.getCutout());



    }
}
