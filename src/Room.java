
public abstract class Room {
	
	public  abstract String getRoomName() ;
	
	public abstract String getIconName() ;
	
	public abstract String getRoomMsg() ;
	
	public abstract String[] getNextRooms();
	
	public abstract  String[] getObjectsInRoom();
	
	public  abstract String objectEffect(int selection);
}
