package org.cyberpwn.blitz.object;

import org.bukkit.entity.Player;
import wraith.GList;

public interface PlayerSet
{
	public GList<Player> getPlayers();
	
	public void addPlayer(Player p);
	
	public void removePlayer(Player p);
	
	public boolean isFull();
	
	public void rebalance();
}
