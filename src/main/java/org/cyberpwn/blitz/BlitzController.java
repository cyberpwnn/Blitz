package org.cyberpwn.blitz;

import org.cyberpwn.blitz.control.GameController;
import wraith.Controllable;
import wraith.Controller;

public class BlitzController extends Controller
{
	private final GameController gameController;
	
	public BlitzController(Controllable parent)
	{
		super(parent);
		
		gameController = new GameController(this);
	}

	@Override
	public void onStart()
	{
		
	}

	@Override
	public void onStop()
	{
		
	}

	public GameController getGameController()
	{
		return gameController;
	}
}
