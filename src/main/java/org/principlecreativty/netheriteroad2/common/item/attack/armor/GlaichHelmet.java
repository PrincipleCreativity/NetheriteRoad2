package org.principlecreativty.netheriteroad2.common.item.attack.armor;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Rarity;
import org.principlecreativty.netheriteroad2.common.item.attack.BattleArmor;
import org.principlecreativty.netheriteroad2.common.item.attack.NetheriteArmorMaterials;
import org.principlecreativty.netheriteroad2.common.util.Reference;

public class GlaichHelmet extends BattleArmor{
    public GlaichHelmet() {
        super("glaich_helmet", NetheriteArmorMaterials.GLAICH, EquipmentSlot.HEAD, new Settings().group(Reference.BATTLE).rarity(Rarity.EPIC), 4);
    }
}
