package org.principlecreativty.netheriteroad2.common.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.registry.Registry;
import org.jetbrains.annotations.NotNull;
import org.principlecreativty.netheriteroad2.common.util.interfaces.Elementable;

import java.util.List;

public class NetheriteRegistry {
    /**
     * Registry the Elements
     * @param elements List of the Elements
     */
    public static void registry(@NotNull List<Elementable> elements){
        for(Elementable element: elements){
            NetheriteRegistry registry = new NetheriteRegistry();
            registry.registryElement(element, Reference.MODID);
        }
    }

    private void registryElement(Elementable elementable, String modId){
        if(elementable instanceof Item){
            Registry.register(Registry.ITEM, elementable.get(modId), (Item) elementable);
        }
        if(elementable instanceof Block){
            Registry.register(Registry.BLOCK, elementable.get(modId), (Block) elementable);
        }
    }
}
