package org.principlecreativty.netheriteroad2;

import net.fabricmc.api.ModInitializer;
import org.principlecreativty.netheriteroad2.common.init.Items;
import org.principlecreativty.netheriteroad2.common.util.NetheriteRegistry;

public class NetheriteRoad2 implements ModInitializer {
    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        NetheriteRegistry.registry(Items.ITEMS);
    }
}
