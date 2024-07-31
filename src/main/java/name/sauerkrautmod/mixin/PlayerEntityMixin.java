package name.sauerkrautmod.mixin;

import name.sauerkrautmod.SauerkrautMod;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityPose;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.Map;

@Mixin(PlayerEntity.class)
public class PlayerEntityMixin{

//    @Mutable
//    @Shadow @Final private static Map<EntityPose, EntityDimensions> POSE_DIMENSIONS;
//
//    @Mutable
//    @Shadow @Final public static EntityDimensions STANDING_DIMENSIONS;
//
//    @Inject(method = "tick", at = @At("HEAD"))
//    public void tick(CallbackInfo ci){
//        STANDING_DIMENSIONS.scaled(1.1f, 1.1f);
//        SauerkrautMod.LOGGER.info(STANDING_DIMENSIONS.toString());
//    }
//
//    /**
//     * @author
//     * Fang_Yi
//     * @reason
//     * 修改体型
//     */
//    @Overwrite
//    public EntityDimensions getDimensions(EntityPose pose) {
//        EntityDimensions res1 = POSE_DIMENSIONS.getOrDefault((Object)pose, STANDING_DIMENSIONS);
//        res1.scaled(2f, 2f);
//        return res1;
//    }

}
