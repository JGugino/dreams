package org.gugino.dreams.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.gugino.dreams.Dreams;
import org.gugino.dreams.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup DREAM_ITEMS =
            Registry.register(Registries.ITEM_GROUP,
                    Identifier.of(Dreams.MOD_ID, "dreams-items"),
                    FabricItemGroup.builder().icon(()-> new ItemStack(ModItems.DREAM_SHARD)).displayName(
                            Text.translatable("itemgroup.dreams.dream-items")).entries(((displayContext, entries) -> {
                        entries.add(ModItems.DREAM_SHARD);
                        entries.add(ModItems.DREAM_ESSENCE);
                    })).build());

    public static final ItemGroup DREAM_BLOCKS =
            Registry.register(Registries.ITEM_GROUP,
                    Identifier.of(Dreams.MOD_ID, "dreams-blocks"),
                    FabricItemGroup.builder().icon(()-> new ItemStack(ModBlocks.DREAM_SHARD_BLOCK)).displayName(
                            Text.translatable("itemgroup.dreams.dream-blocks")).entries(((displayContext, entries) -> {
                        entries.add(ModBlocks.DREAM_STONE);
                        entries.add(ModBlocks.DREAM_COBBLESTONE);
                        entries.add(ModBlocks.DREAM_SHARD_ORE);
                        entries.add(ModBlocks.DREAM_SHARD_BLOCK);
                    })).build());

    public static void registerItemGroups(){
        Dreams.LOGGER.info("Registering item groups for mod " + Dreams.MOD_ID);
    }
}
