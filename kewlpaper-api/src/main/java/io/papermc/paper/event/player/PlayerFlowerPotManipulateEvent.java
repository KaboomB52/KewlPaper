package io.papermc.paper.event.player;

import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.player.PlayerEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/**
 * Called when a player places an item in or takes an item out of a flowerpot.
 */
@NullMarked
public class PlayerFlowerPotManipulateEvent extends PlayerEvent implements Cancellable {

    private static final HandlerList HANDLER_LIST = new HandlerList();

    private final Block flowerpot;
    private final ItemStack item;
    private final boolean placing;

    private boolean cancelled;

    @ApiStatus.Internal
    public PlayerFlowerPotManipulateEvent(final Player player, final Block flowerpot, final ItemStack item, final boolean placing) {
        super(player);
        this.flowerpot = flowerpot;
        this.item = item;
        this.placing = placing;
    }

    /**
     * Gets the flowerpot that is involved in this event.
     *
     * @return the flowerpot that is involved with this event
     */
    public Block getFlowerpot() {
        return this.flowerpot;
    }

    /**
     * Gets the item being placed, or taken from, the flower pot.
     * Check if placing with {@link #isPlacing()}.
     *
     * @return the item placed, or taken from, the flowerpot
     */
    public ItemStack getItem() {
        return this.item;
    }

    /**
     * Gets if the item is being placed into the flowerpot.
     *
     * @return if the item is being placed into the flowerpot
     */
    public boolean isPlacing() {
        return this.placing;
    }

    @Override
    public boolean isCancelled() {
        return this.cancelled;
    }

    @Override
    public void setCancelled(final boolean cancel) {
        this.cancelled = cancel;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLER_LIST;
    }

    public static HandlerList getHandlerList() {
        return HANDLER_LIST;
    }
}
