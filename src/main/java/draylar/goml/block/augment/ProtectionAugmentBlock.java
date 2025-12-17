package draylar.goml.block.augment;

import draylar.goml.api.Claim;
import draylar.goml.block.SelectiveClaimAugmentBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;


public class ProtectionAugmentBlock extends SelectiveClaimAugmentBlock {
    public ProtectionAugmentBlock(AbstractBlock.Settings settings, String texture) {
        super("protection_zone", settings, texture);
    }

    @Override
    public boolean ticks() {
        return true;
    }

    @Override
    public void playerTick(Claim claim, PlayerEntity player) {
        if (canApply(claim, player)) {
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, 5, 0, true, false));
        }
    }
}
