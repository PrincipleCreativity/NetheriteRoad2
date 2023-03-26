package org.principlecreativty.netheriteroad2.common.init;

import org.principlecreativty.netheriteroad2.common.item.attack.armor.GlaichHelmet;
import org.principlecreativty.netheriteroad2.common.item.attack.sword.BlitzLongsword;
import org.principlecreativty.netheriteroad2.common.util.interfaces.Elementable;
import org.principlecreativty.netheriteroad2.common.util.interfaces.Itemable;

import java.util.ArrayList;
import java.util.List;

public interface Items {
    List<Elementable> ITEMS = new ArrayList<>();

    //Battle Item
    Itemable BLITZ_LONGSWORD = new BlitzLongsword();
    Itemable GLAICH_HELMET = new GlaichHelmet();
}
