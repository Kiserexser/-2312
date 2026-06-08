package com.example.speed;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SpeedBase implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("speedbase");

    @Override
    public void onInitialize() {
        LOGGER.info("Speed Base mod loaded! (without Fabric API)");
    }
}
