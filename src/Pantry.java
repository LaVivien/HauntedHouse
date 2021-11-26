/**
 *
 * @author Khy
 */
public class Pantry extends Room {	
	private String roomName = "Pantry";
	private String[] nextRooms = {};
	private String[] objectsInRoom = {"Dusty Recipe Box", "Broom"};
	private String iconName = "Pantry.jpg";
	private String roomMessage = "Dustry jars and a dustry shelf, none of the items look good to you.";
	
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
			return "You open it up and a recipe for chocolate devils food cake appears out of no where!";
		else if (selection == 1)
			return "flies up in the air as soon as you touch it!";
		return "You decided this house was too scary and blew yourself up!";
	}  
}
