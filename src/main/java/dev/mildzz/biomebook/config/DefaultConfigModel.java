package dev.mildzz.biomebook.config;

import dev.mildzz.biomebook.BiomeBook;
import io.wispforest.owo.config.annotation.Config;
import io.wispforest.owo.config.annotation.Modmenu;

@Modmenu(modId = BiomeBook.MOD_ID)
@Config(name = "default-config", wrapperName = "DefaultConfig")
public class DefaultConfigModel {
    public boolean isProgressModeOn = true;
}
