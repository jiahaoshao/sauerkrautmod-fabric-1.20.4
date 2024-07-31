package name.sauerkrautmod.sounds;

import name.sauerkrautmod.SauerkrautMod;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent PROSPECTOR_CALL = registerSoundEvents("prospector_call");

    public static final SoundEvent BOQI_BLOCK_BREAK = registerSoundEvents("boqi_block_break");
    public static final SoundEvent BOQI_BLOCK_STEP = registerSoundEvents("boqi_block_step");
    public static final SoundEvent BOQI_BLOCK_PLACE = registerSoundEvents("boqi_block_place");
    public static final SoundEvent BOQI_BLOCK_HIT = registerSoundEvents("boqi_block_hit");
    public static final SoundEvent BOQI_BLOCK_FALL = registerSoundEvents("boqi_block_fall");

    public static final BlockSoundGroup BOQI_BLOCK_SOUND_GROUP = new BlockSoundGroup(1f, 1f,
            ModSounds.BOQI_BLOCK_BREAK, ModSounds.BOQI_BLOCK_STEP, ModSounds.BOQI_BLOCK_PLACE, ModSounds.BOQI_BLOCK_HIT, ModSounds.BOQI_BLOCK_FALL);

    public static SoundEvent registerSoundEvents(String name){
        Identifier identifier = SauerkrautMod.id(name);
        return Registry.register(Registries.SOUND_EVENT, identifier, SoundEvent.of(identifier));
    }


    public static void registerSounds(){
        SauerkrautMod.LOGGER.info("注册一个声音" + SauerkrautMod.MOD_ID);
    }
}
