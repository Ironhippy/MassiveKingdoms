package net.graystone.java.kingdoms;

public enum Perm
{
	
	CREATE_KINGDOM("kingdom.create"),
	DISSOLVE_KINGDOM("kingdom.dissolve"),
	
	CREATE_TOWN("town.create"),
	MERGE_TOWNS("town.merge"),
	
	CHANGE_IMMIGRATION("immigration.set"),
	INVITE_PLAYER("kingdom.invite"),
	
	JOIN_KINGDOM("kingdom.join"),
	LEAVE_KINGDOM("kingdom.leave"),
	
	CREATE_RANK("rank.create"),
	REMOVE_RANK("rank.remove"),
	SET_RANK("rank.set"),
	
	WAR_DECLARE("war.declare"),
	WAR_SURRENDER("war.surrender");
	
	private String node;
	
	Perm(String node)
	{
		this.node = "massivekingdoms."+node;
	}
	
	@Override
	public String toString()
	{
		return this.node;
	}
	
}
