package name.sauerkrautmod.item.custom;

import name.sauerkrautmod.sounds.ModSounds;
import name.sauerkrautmod.util.ModTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.sound.SoundCategory;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import static net.minecraft.block.RedstoneOreBlock.LIT;

public class ProspectorItem extends Item {
    public ProspectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        World world = context.getWorld();
        if(!world.isClient()){
            BlockPos blockPos = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean foundBlock = false;
            for(int i = -64; i <= blockPos.getY() + 64; i ++) {
                BlockState state = context.getWorld().getBlockState(blockPos.up(i));
                if(isRightBlock(state)){
                    outputMessage(blockPos.up(i), player, state.getBlock());
                    foundBlock = true;
                }
            }
            if(foundBlock){
                context.getWorld().playSound(null, blockPos, ModSounds.PROSPECTOR_CALL, SoundCategory.BLOCKS, 1f, 1f);
            }
            if(!foundBlock){
                player.sendMessage(Text.literal("No Ore Found!"));
            }
        }
        context.getStack().damage(1, context.getPlayer(),
                playerEntity -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
        return ActionResult.SUCCESS;
    }

    private void outputMessage(BlockPos down, PlayerEntity player, Block block) {
        player.sendMessage(Text.literal("Found" + block.asItem().getName().getString() + "at" +
                "(" + down.getX() + "," + down.getY() + "," + down.getZ() + ")!"), false);
    }

    private boolean isRightBlock(BlockState state) {
        return state.isIn(ModTags.Blocks.PROSPECTOR_LIST);
    }



//    @Override
//    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
//        tooltip.add(Text.translatable("item.sauerkrautmod.prospector.tooltip"));
//        super.appendTooltip(stack, world, tooltip, context);
//    }
}
