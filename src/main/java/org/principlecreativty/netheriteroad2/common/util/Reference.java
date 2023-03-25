package org.principlecreativty.netheriteroad2.common.util;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.Random;

public interface Reference {
    String MODID = "netheriteroad2";
    ItemGroup BATTLE = FabricItemGroupBuilder.build(ModUtil.modIdentifier("battle"), () -> new ItemStack(Items.IRON_SWORD));
    Random R = new Random();
}
