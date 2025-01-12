package name.sauerkrautmod.datagen;

import com.terraformersmc.modmenu.util.mod.Mod;
import name.sauerkrautmod.block.ModBlocks;
import name.sauerkrautmod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BOQI_BLOCK);
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.PROSPECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.PAVING_BALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_1, Models.GENERATED);
        itemModelGenerator.register(ModItems.STONE_2, Models.GENERATED);
        itemModelGenerator.register(ModItems.SUPER_FIRE, Models.GENERATED);
    }
}
