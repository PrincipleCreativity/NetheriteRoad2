package org.principlecreativty.netheriteroad2.common.item.attack.sword;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Rarity;
import org.principlecreativty.netheriteroad2.common.item.NetheriteToolMaterials;
import org.principlecreativty.netheriteroad2.common.item.attack.BattleSword;
import org.principlecreativty.netheriteroad2.common.util.Reference;

import java.util.HashMap;
import java.util.Map;

public class BlitzLongsword extends BattleSword {
    public BlitzLongsword() {
        super("blitz_sword", NetheriteToolMaterials.NETHERITE, 16, -1.9F, new Settings().group(Reference.BATTLE).rarity(Rarity.UNCOMMON));
    }

    @Override
    public Map<EquipmentSlot, Float> setIncreasedDamageValue() {
        Map<EquipmentSlot, Float> increasedDamage = new HashMap<>();
        increasedDamage.put(EquipmentSlot.HEAD, 1.35F);
        increasedDamage.put(EquipmentSlot.CHEST, 4.32F);
        increasedDamage.put(EquipmentSlot.LEGS, 3.96F);
        increasedDamage.put(EquipmentSlot.FEET, 0.62F);
        return increasedDamage;
    }
}
