package name.sauerkrautmod.item;


import name.sauerkrautmod.SauerkrautMod;
import name.sauerkrautmod.item.custom.PavingBallItem;
import name.sauerkrautmod.item.custom.ProspectorItem;
import name.sauerkrautmod.item.custom.SuperFireItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ModItems {

    public static final Item PROSPECTOR = register("prospector", new ProspectorItem(new FabricItemSettings().maxDamage(648)));
    public static final Item PAVING_BALL = register("paving_ball", new PavingBallItem(new FabricItemSettings()));
    public static final Item STONE_1 = register("stone_1", new Item(new FabricItemSettings()));
    public static final Item STONE_2 = register("stone_2", new Item(new FabricItemSettings()));
    public static final Item SUPER_FIRE = register("super_fire", new SuperFireItem(new FabricItemSettings()));

    public static <T extends Item> T register(String name, T item) {
        Registry.register(Registries.ITEM, SauerkrautMod.id(name), item);
        ItemGroupEvents.modifyEntriesEvent(ModItemGroups.ITEM_GROUP).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModItems(){
        SauerkrautMod.LOGGER.info("注册MOD物品"+SauerkrautMod.MOD_ID);
    }
}
