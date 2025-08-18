package org.gugino.dreams.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.gugino.dreams.Dreams;

public class ModBlocks {

    public static final Block DREAM_STONE = registerBlock("dream-stone",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(
                    BlockSoundGroup.STONE)));

    public static final Block DREAM_COBBLESTONE = registerBlock("dream-cobblestone",
            new Block(AbstractBlock.Settings.create().strength(4f).requiresTool().sounds(
                    BlockSoundGroup.STONE)));

    public static final Block DREAM_SHARD_ORE = registerBlock("dream-shard-ore",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(
                    BlockSoundGroup.LARGE_AMETHYST_BUD)));

    public static final Block DREAM_SHARD_BLOCK = registerBlock("dream-shard-block",
            new Block(AbstractBlock.Settings.create().strength(5f).requiresTool().sounds(
                    BlockSoundGroup.LARGE_AMETHYST_BUD)));

    private static Block registerBlock(String name, Block block){
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Dreams.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(Dreams.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    public static void registerModBlocks(){
        Dreams.LOGGER.info("Registering blocks for mod " + Dreams.MOD_ID);
    }
}
