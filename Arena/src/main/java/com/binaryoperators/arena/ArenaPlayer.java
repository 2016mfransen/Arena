package com.binaryoperators.arena;

import org.spongepowered.api.entity.player.Player;

public class ArenaPlayer {
	private Player player;
	public ArenaPlayer(Player player) {
		this.player = player;
	}
	public Player getPlayer() {
		return player;
	}
}
