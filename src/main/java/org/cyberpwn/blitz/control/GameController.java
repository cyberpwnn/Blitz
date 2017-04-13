package org.cyberpwn.blitz.control;

import wraith.ConfigurableController;
import wraith.Controllable;
import wraith.Keyed;
import wraith.TickHandle;
import wraith.TickHandler;
import wraith.Ticked;

@Ticked(5)
@TickHandle(TickHandler.SYNCED)
public class GameController extends ConfigurableController
{
	private MapController mapController;
	
	private boolean gameActive;
	private boolean gameRunning;
	
	@Keyed("basic.team-size")
	public int teamSize = 6;
	
	public GameController(Controllable parent)
	{
		super(parent, "game");
		
		mapController = new MapController(this);
	}
	
	@Override
	public void onStart()
	{
		gameRunning = false;
		gameActive = false;
		loadCluster(this);
	}
	
	@Override
	public void onStop()
	{
		gameRunning = false;
		gameActive = false;
	}

	public MapController getMapController()
	{
		return mapController;
	}

	public boolean isGameActive()
	{
		return gameActive;
	}

	public boolean isGameRunning()
	{
		return gameRunning;
	}
}
