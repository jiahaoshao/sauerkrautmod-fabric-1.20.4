package name.sauerkrautmod.mixin;

import name.sauerkrautmod.SauerkrautMod;
import net.minecraft.entity.EntityDimensions;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(EntityDimensions.class)
public class EntityDimensionsMixin {
//    @Shadow @Final public boolean fixed;
//
//    @Shadow @Final public float width;
//
//    @Shadow @Final public float height;
//
//    /**
//     * @author
//     * @reason
//     */
//    @Overwrite
//    public EntityDimensions scaled(float widthRatio, float heightRatio) {
//        if (this.fixed || widthRatio == 1.0f && heightRatio == 1.0f) {
//            return new EntityDimensions(width, height, true);
//        }
//        SauerkrautMod.LOGGER.info("修改成功");
//        return EntityDimensions.changing(this.width * widthRatio, this.height * heightRatio);
//    }
}
