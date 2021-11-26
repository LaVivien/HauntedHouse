/**
 *
 * @author Khy
 */
public class MasterBathroom extends Room {
	
	private String roomName = "Master Bathroom";
	private String[] nextRooms = {};
	private String[] objectsInRoom = {"Intricate Oil Lamp", "Shower"};
	private String iconName = "Bathroom2.jpg";
	private String roomMessage = "Plants shuffling in an absence of a wind, this bathroom has an erie feeling.";
	
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
			return "Rob the lamp and a genie pops out who says he'll grant you 3 wishes!";
		else if (selection == 1)
			return "Suddenly hear singing in the shower, but no one is there!";
		return "You decided this house was too scary and blew yourself up!";
	}  
}
