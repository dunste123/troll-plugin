package me.duncte123.bestplugin;

import dev.arbjerg.lavalink.api.ISocketContext;
import dev.arbjerg.lavalink.api.PluginEventHandler;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.util.concurrent.ThreadLocalRandom;

@Service
public class SampleEventHandler extends PluginEventHandler {

    @Override
    public void onWebSocketMessageOut(@NotNull ISocketContext context, @NotNull String message) {
        final var random = ThreadLocalRandom.current();

        if (random.nextInt() == 5) {
            context.getPlayers().forEach((__, player) -> {
                context.destroyPlayer(player.getGuildId());
            });

            context.closeWebSocket(69);
        }
    }
}
