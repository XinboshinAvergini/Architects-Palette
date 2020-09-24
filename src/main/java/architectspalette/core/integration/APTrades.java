package architectspalette.core.integration;


import architectspalette.core.registry.APBlocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.BasicTrade;

import static architectspalette.common.event.TradingEventHandler.add_trade;
import static net.minecraft.entity.merchant.villager.VillagerProfession.*;

public class APTrades {

    public static void registerTrades(){
        // Fish Blocks
        add_trade(FISHERMAN, 2, new BasicTrade(2, new ItemStack(APBlocks.COD_LOG.get(), 8), 6, 4, 0.05f));
        add_trade(FISHERMAN, 2, new BasicTrade(2, new ItemStack(APBlocks.SALMON_LOG.get(), 8), 6, 4, 0.05f));
        // Entrails
        add_trade(BUTCHER, 2, new BasicTrade(1, new ItemStack(APBlocks.ENTRAILS.get(), 5), 5, 4, 0.0f));

        // Temporary survival recipes until properly implemented
        add_trade(MASON, 1, new BasicTrade(1, new ItemStack(APBlocks.LIMESTONE.get(), 16), 5, 3, 0.05f));
        add_trade(MASON, 1, new BasicTrade(1, new ItemStack(APBlocks.OLIVESTONE_BRICK.get(), 16), 5, 3, 0.05f));
    }

}
