
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.itemdisplaymod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.itemdisplaymod.block.TestBlockBlock;
import net.mcreator.itemdisplaymod.block.SwordRackBlock;
import net.mcreator.itemdisplaymod.ItemDisplayModMod;

public class ItemDisplayModModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ItemDisplayModMod.MODID);
	public static final RegistryObject<Block> TEST_BLOCK = REGISTRY.register("test_block", () -> new TestBlockBlock());
	public static final RegistryObject<Block> SWORD_RACK = REGISTRY.register("sword_rack", () -> new SwordRackBlock());
}
