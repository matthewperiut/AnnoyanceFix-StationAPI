package com.github.telvarost.annoyancefix;

import net.glasslauncher.mods.api.gcapi.api.ConfigName;
import net.glasslauncher.mods.api.gcapi.api.GConfig;

public class Config {

    @GConfig(value = "config", visibleName = "AnnoyanceFix Config")
    public static ConfigFields config = new ConfigFields();

    public static class ConfigFields {

        @ConfigName("Boat Fixes Enabled")
        public static Boolean boatFixesEnabled = true;

        @ConfigName("Bookshelf Fixes Enabled")
        public static Boolean bookshelfFixesEnabled = true;

        @ConfigName("Fence Fixes Enabled")
        public static Boolean fenceFixesEnabled = true;

        @ConfigName("Pick Block Fixes Enabled")
        public static Boolean pickBlockFixesEnabled = true;

        @ConfigName("Stair Fixes Enabled")
        public static Boolean stairFixesEnabled = true;
    }
}
