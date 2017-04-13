package org.cyberpwn.blitz;

import wraith.ControllablePlugin;

public class Blitz extends ControllablePlugin
{	
	private BlitzController blitzController;
	
	@Override
	public void onStart()
	{
		
	}

	@Override
	public void onStop()
	{
		
	}

	@Override
	public void onConstruct()
	{
		blitzController = new BlitzController(this);
	}

	public BlitzController getBlitzController()
	{
		return blitzController;
	}
}
