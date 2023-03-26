package org.principlecreativty.netheriteroad2.common.util.interfaces;

import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Identifier;

public interface Elementable extends ItemConvertible {

    Identifier get(String modId);
}
