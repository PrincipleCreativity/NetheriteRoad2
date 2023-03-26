package org.principlecreativty.netheriteroad2.common.item.attack;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import org.principlecreativty.netheriteroad2.common.init.Items;
import org.principlecreativty.netheriteroad2.common.util.interfaces.Itemable;
import org.principlecreativty.netheriteroad2.common.util.Reference;

public class BattleArmor extends ArmorItem implements Itemable {
    private final String name;
    private final int strength;
    public BattleArmor(String name, ArmorMaterial material, EquipmentSlot slot, Settings settings, int strength) {
        super(material, slot, settings);
        Items.ITEMS.add(this);
        this.name = name;
        this.strength = strength;
    }

    @Override
    public void usageTick(World world, LivingEntity user, ItemStack stack, int remainingUseTicks) {
        float floatHealthValue = Reference.R.nextFloat();
        int nextInt = Reference.R.nextInt(1, strength);
        if(user.getRecentDamageSource() == null)
            return;
        if(user.isAttackable() && user.getRecentDamageSource().isProjectile()){
            user.setHealth(user.getHealth() + nextInt * floatHealthValue);
        }
    }

    @Override
    public Identifier get(String modId) {
        return new Identifier(modId, name);
    }
}