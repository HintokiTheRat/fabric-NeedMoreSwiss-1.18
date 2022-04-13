package net.hintoki.needmoreswiss;

import net.fabricmc.api.ModInitializer;
import net.hintoki.needmoreswiss.block.NeedMoreSwissBlocks;
import net.hintoki.needmoreswiss.item.NeedMoreSwissItems;
import net.hintoki.needmoreswiss.util.NeedMoreSwissRegisteries;
import net.hintoki.needmoreswiss.world.feature.NeedMoreSwissConfigureFeatures;
import net.hintoki.needmoreswiss.world.gen.NeedMoreSwissWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NeedMoreSwiss implements ModInitializer {
	public static final String MOD_ID = "needmoreswiss";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		NeedMoreSwissItems.registerModItems();
		NeedMoreSwissBlocks.registerModBlocks();

		NeedMoreSwissRegisteries.registerModStuff();
		NeedMoreSwissConfigureFeatures.registerConfiguredFeatures();

		NeedMoreSwissWorldGen.generateModWorldGen();

	}
}
