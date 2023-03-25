package org.principlecreativty.netheriteroad2.common.init;

import org.principlecreativty.netheriteroad2.common.item.armor.helmet.GlaichHelmet;
import org.principlecreativty.netheriteroad2.common.util.Elementable;

import java.util.ArrayList;
import java.util.List;

public interface Items {
    List<Elementable> ITEMS = new ArrayList<>();

    //Battle Item
    Elementable GLAICH_HELMET = new GlaichHelmet();
}
