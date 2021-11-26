/**
 *
 * @author Khy
 */
public class Kitchen extends Room {

	private String roomName = "Kitchen";
	private String[] nextRooms = {"Pantry"};
	private String[] objectsInRoom = {"Refrigerator", "Cabinet"};
	private String iconName = "Kitchen.jpg";
	private String roomMessage = "Cling! Clack! You hear the pots but nothing is moving...";
	
	
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
			return "Open it and find some delicious soul food";
		else if (selection == 1)
			return "The dishes and glasses started flying at you!\n" +
			"You get hit in the head and feel you start moving towards a light!";
		return "You decided this house was too scary and blew yourself up!";
	}
}
