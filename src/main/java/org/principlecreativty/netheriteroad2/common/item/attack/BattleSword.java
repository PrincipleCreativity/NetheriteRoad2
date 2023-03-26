package org.principlecreativty.netheriteroad2.common.item.attack;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Identifier;
import org.principlecreativty.netheriteroad2.common.init.Items;
import org.principlecreativty.netheriteroad2.common.util.interfaces.Itemable;
import org.principlecreativty.netheriteroad2.common.util.Reference;

import java.util.Map;

public abstract class BattleSword extends SwordItem implements Itemable {
    private final String name;
    public BattleSword( String name, ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
        Items.ITEMS.add(this);
        this.name = name;
    }

    public abstract Map<EquipmentSlot, Float> setIncreasedDamageValue();

    @Override
    public Identifier get(String modId) {
        return new Identifier(modId, name);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        for(Map.Entry<EquipmentSlot, Float> entry: setIncreasedDamageValue().entrySet()) {
            if (!target.hasStackEquipped(entry.getKey())) {
                setIncreasedDamage(target, entry.getValue());
            }
        }
        return true;
    }

    private void setIncreasedDamage(LivingEntity target, float value){
        float nextFloat = Reference.R.nextFloat(value);
        target.setHealth(target.getHealth() - value * nextFloat);
    }
}
