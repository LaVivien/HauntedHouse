/**
 *
 * @author Khy
 */
public class Stairs extends Room  {

	private String roomName = "Stairs";
	private String[] nextRooms = {"Master Bedroom", "Bedroom One", "Bedroom Two"};
	private String[] objectsInRoom = {};
	private String iconName = "Staircase.jpg";
	private String roomMessage = "Light from the rustic window hits the stairwell as you climb upstairs.";

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
		return "You decided this house was too scary and blew yourself up!";
	}
}
