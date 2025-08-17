package org.gugino.morecreaturesandstuff.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.gugino.morecreaturesandstuff.MoreCreaturesAndStuff;

public class ModItems {

    public static final Item DREAM_ESSENCE = registerItem("dream-essence", new Item(new Item.Settings()));
    public static final Item DREAM_SHARD = registerItem("dream-shard", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(MoreCreaturesAndStuff.MOD_ID, name), item);
    }

    public static void registerModItems(){
        MoreCreaturesAndStuff.LOGGER.info("Registering items for mod: " + MoreCreaturesAndStuff.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(DREAM_ESSENCE);
            fabricItemGroupEntries.add(DREAM_SHARD);
        });
    }
}
