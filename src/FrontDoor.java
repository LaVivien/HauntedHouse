/**
 *
 * @author Khy
 */
public class FrontDoor extends Room  {	
	private String roomName = "Front Door";
	private String[] nextRooms = {"Living Room", "Dining Room", "Stairs"};
	private String[] objectsInRoom = {"key"};
	private String iconName = "FrontDoorKey.png";
	private String roomMessage = "With a flick of the wrist a rotten twist, enter the Haunted Mansion at your own risk.";

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
		return "Key to exit!";
	} 
}
