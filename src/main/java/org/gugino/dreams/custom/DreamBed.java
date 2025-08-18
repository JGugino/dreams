package org.gugino.dreams.custom;

import net.minecraft.block.BedBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.DyeColor;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class DreamBed extends BedBlock {
    public DreamBed(DyeColor color, Settings settings) {
        super(color, settings);
    }

    @Override
    protected ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player,
                                 BlockHitResult hit) {
        player.sendMessage(Text.of("Dream Bed Clicked"));

        return super.onUse(state, world, pos, player, hit);
    }
}
