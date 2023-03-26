package org.principlecreativty.netheriteroad2.common.item;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;
import org.principlecreativty.netheriteroad2.common.util.Reference;

public enum NetheriteToolMaterials implements ToolMaterial {
    NETHERITE(6, 1021, 10.0F, 6, 25, Ingredient.ofItems(Items.IRON_INGOT));
    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Ingredient repairIngredient;

    private NetheriteToolMaterials(int miningLevel, int itemDurability, float miningSpeed, int attackStrength, int enchantability, Ingredient repairIngredient) {
        float strengthValue = Reference.R.nextFloat();
        int nextInt = Reference.R.nextInt(1, attackStrength);
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = nextInt * strengthValue;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient;
    }
}
