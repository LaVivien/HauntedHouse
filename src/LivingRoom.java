/**
 *
 * @author Khy
 */
public class LivingRoom extends Room {
	private String roomName = "Living Room";
	private String[] nextRooms = {"First Floor Bathroom"};
	private String[] objectsInRoom = {"Chest"};
	private String iconName = "LivingRoom.jpg";
	private String roomMessage = "Living, but less alive you feel your life's essence draining as you step into the living room.";	
	
	public  String getRoomName() {
		return roomName;
	}
	
	public  String getIconName() {
		return iconName;
	}
	
	public  String getRoomMsg() {
		return roomMessage;
	}
	
	public String[] getNextRooms(){
		return this.nextRooms;
	}	
	
	public String[] getObjectsInRoom()
	{
		return this.objectsInRoom;
	}
	
	public String objectEffect(int selection)
	{
		if (selection == 0)
			return "Ghost escapes and scares you to death!";
		return "You decided this house was too scary and blew yourself up!";
	}
}
