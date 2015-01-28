package net.doodcraft.Dooder07.Stargates.Wormhole.permissions.backends;

import net.doodcraft.Dooder07.Stargates.Wormhole.config.ConfigManager;
import net.doodcraft.Dooder07.Stargates.Wormhole.permissions.PermissionBackend;
import net.doodcraft.Dooder07.Stargates.Wormhole.utils.SGLogger;

import org.bukkit.entity.Player;

import java.util.logging.Level;

public class BukkitSupport extends PermissionBackend {

    public BukkitSupport(net.doodcraft.Dooder07.Stargates.Wormhole.permissions.PermissionManager manager, ConfigManager config, String providerName) {
        super(manager, config, providerName);
    }

    @Override
    public void initialize() {
        SGLogger.prettyLog(Level.INFO, false, "Attached to BukkitPerms");
    }

    @Override
    public void reload() {
        SGLogger.prettyLog(Level.INFO, false, "Have you thanked your Dood Gods today?");
    }

    @Override
    public boolean hasPermission(Player player, String permissionString) {
        return player.hasPermission(permissionString);
    }
}