package net.graystone.java.kingdoms;

import com.massivecraft.massivecore.MassivePlugin;

public class MassiveKingdoms extends MassivePlugin
{
	
	private static MassiveKingdoms i;
	public MassiveKingdoms() { MassiveKingdoms.i = this; }
	public static MassiveKingdoms get() { return MassiveKingdoms.i; }
	
	@Override
	public void onEnableInner()
	{
		
	}
}
