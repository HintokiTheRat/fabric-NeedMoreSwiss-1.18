package net.hintoki.crimerzboogaloo;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.hintoki.crimerzboogaloo.block.ModBlocks;
import net.hintoki.crimerzboogaloo.item.ModItems;
import net.hintoki.crimerzboogaloo.util.ModRegisteries;
import net.hintoki.crimerzboogaloo.world.feature.ModConfigureFeatures;
import net.hintoki.crimerzboogaloo.world.gen.ModWorldGen;
import net.minecraft.client.render.RenderLayer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CrimerzBoogaloo implements ModInitializer {
	public static final String MOD_ID = "crimerzboogaloo";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModRegisteries.registerModStuff();
		ModConfigureFeatures.registerConfiguredFeatures();

		ModWorldGen.generateModWorldGen();

	}
}
