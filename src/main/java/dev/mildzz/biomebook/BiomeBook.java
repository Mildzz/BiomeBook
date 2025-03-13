package dev.mildzz.biomebook;

import dev.mildzz.biomebook.config.DefaultConfig;
import io.wispforest.lavender.book.LavenderBookItem;
import net.fabricmc.api.ModInitializer;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BiomeBook implements ModInitializer {
	public static final String MOD_ID = "biomebook";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final DefaultConfig CONFIG = DefaultConfig.createAndLoad();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		LavenderBookItem.registerForBook(Identifier.of(MOD_ID, "biome_book"), new Item.Settings());
	}
}