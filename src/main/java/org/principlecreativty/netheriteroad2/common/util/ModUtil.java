package org.principlecreativty.netheriteroad2.common.util;

import net.minecraft.util.Identifier;

public class ModUtil {
    public static Identifier modIdentifier(String name){
        return new Identifier(Reference.MODID, name);
    }
}
