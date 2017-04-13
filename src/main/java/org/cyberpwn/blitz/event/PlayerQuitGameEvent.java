package org.cyberpwn.blitz.event;

import org.bukkit.entity.Player;
import wraith.CancellablePhantomEvent;

public class PlayerQuitGameEvent extends CancellablePhantomEvent
{
	private Player player;
	
	public PlayerQuitGameEvent(Player player)
	{
		this.player = player;
	}

	public Player getPlayer()
	{
		return player;
	}
}
