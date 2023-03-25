package org.principlecreativty.netheriteroad2.common.item.armor.helmet;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Rarity;
import org.principlecreativty.netheriteroad2.common.item.armor.BattleArmor;
import org.principlecreativty.netheriteroad2.common.item.armor.NetheriteArmorMaterial;
import org.principlecreativty.netheriteroad2.common.util.Reference;

public class GlaichHelmet extends BattleArmor{
    public GlaichHelmet() {
        super("glaich_helmet", NetheriteArmorMaterial.GLAICH, EquipmentSlot.HEAD, new Settings().group(Reference.BATTLE).rarity(Rarity.EPIC), 4);
    }
}
