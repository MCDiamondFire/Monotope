package com.mcdiamondfire.monotope;

import com.mcdiamondfire.monotope.server.entity.MonoPlayer;
import org.bukkit.entity.Player;

/**
 * Utility class for converting Bukkit API instances to extended Mono instances.
 */
public class Mono {

    /**
     * Gets a {@link MonoPlayer} instance from a {@link Player}.
     * @param player A {@link Player} instance to convert.
     * @return A {@link MonoPlayer} instance.
     */
    public static MonoPlayer player(Player player) {
        requireCastable(MonoPlayer.class, player);
        return (MonoPlayer) player;
    }

    private static void requireCastable(Class<?> monoClass, Object instance) {
        if (!monoClass.isInstance(instance)) {
            throw new RuntimeException("Cannot cast " + instance.getClass().getName() + " to " + monoClass.getName() + ". Is the server running on Tesseract?");
        }
    }
}
