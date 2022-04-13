package net.hintoki.needmoreswiss.item.custom;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.LivingEntity;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.LiteralText;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;


public class ModKnockbackBaseballBatItem extends SwordItem {


    public ModKnockbackBaseballBatItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        BlockPos positionClicked = context.getBlockPos();
        ItemStack stack = context.getStack();
        PlayerEntity player = context.getPlayer();


        if (context.getWorld().isClient()){
            Block blockforenchant = context.getWorld().getBlockState(positionClicked).getBlock();

            if(IsForUpgrading(blockforenchant) && !isUpgradedAlready(stack.getName())){
                addUpgrade(stack);

            }  else if(isUpgradedAlready(stack.getName()) && IsForUpgrading(blockforenchant)) {
                player.sendMessage(new LiteralText("You already upgraded this weapon!"), false);

            }
        }
        return super.useOnBlock(context);
    }


    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        Text name = stack.getName();
        if (name.equals(Text.of("§6Negotiation bat"))) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 300, 1), attacker);
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 300, 2), attacker);

        }
        return super.postHit(stack, target, attacker);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(isUpgradedAlready(stack.getName())){
            tooltip.add(new TranslatableText("item.crimerzorigin.upgraded_bat.tooltip"));

        }
        super.appendTooltip(stack, world, tooltip, context);
    }

    public static void addUpgrade(ItemStack stack){
        stack.addEnchantment(Enchantments.KNOCKBACK, 7);
        stack.setCustomName(Text.of("§6Negotiation bat"));

    }

    public boolean IsForUpgrading(Block block ){
        return block == Blocks.ENCHANTING_TABLE;

    }

    public boolean isUpgradedAlready(Text name){
        return name.equals(Text.of("§6Negotiation bat"));
    }
}



