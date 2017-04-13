package org.cyberpwn.blitz.event;

import org.bukkit.entity.Player;
import wraith.CancellablePhantomEvent;

public class PlayerJoinGameEvent extends CancellablePhantomEvent
{
	private Player player;
	
	public PlayerJoinGameEvent(Player player)
	{
		this.player = player;
	}

	public Player getPlayer()
	{
		return player;
	}
}
