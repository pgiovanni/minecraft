package net.craftinc747.swell_blocks.data;
import net.craftinc747.swell_blocks.swell_blocks;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = swell_blocks.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {

        private DataGenerators() {}

        @SubscribeEvent
        public static void gatherData(GatherDataEvent event) {



        }

}
