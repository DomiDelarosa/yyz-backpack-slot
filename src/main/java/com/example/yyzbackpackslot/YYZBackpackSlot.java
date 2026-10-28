package com.example.yyzbackpackslot;

import eu.pb4.trinkets.api.TrinketsApi;
import net.fabricmc.api.ModInitializer;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;

public class YYZBackpackSlot implements ModInitializer {
    public static final String MOD_ID = "yyz-backpack-slot";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static final Set<Identifier> ALLOWED_BACKPACKS = Set.of(
        Identifier.fromNamespaceAndPath("yyzsbackpack", "iron_backpack"),
        Identifier.fromNamespaceAndPath("yyzsbackpack", "gold_backpack"),
        Identifier.fromNamespaceAndPath("yyzsbackpack", "diamond_backpack"),
        Identifier.fromNamespaceAndPath("yyzsbackpack", "netherite_backpack")
    );

    @Override
    public void onInitialize() {
        TrinketsApi.registerTrinketPredicate(
            id("backpacks_only"),
            (stack, slot, entity) ->
                ALLOWED_BACKPACKS.contains(
                    BuiltInRegistries.ITEM.getKey(stack.getItem())
                )
        );

        LOGGER.info("YYZ Backpack Slot initialized");
    }

    public static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(MOD_ID, path);
    }
}
