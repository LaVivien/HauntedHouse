/**
 *
 * @author Khy
 */
public class BedroomOne extends Room {
	
	private String roomName = "Bedroom One";
	private String[] nextRooms = {"Second Floor Bathroom"};
	private String[] objectsInRoom = {"Rocking Chair", "Window"};
	private String iconName = "BabyRoom.jpg";
	private String roomMessage = "An old baby's crib is a shock to you.";

	
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
		
	public String[] getObjectsInRoom() {
		return this.objectsInRoom;
	}
	
	public String objectEffect(int selection) {
		if (selection == 0)
			return "Chair starts rocking by itself with no one in it!";
		else if (selection == 1)
			return "See a child outside on a swing who suddenly disappears!";
		return "You decided this house was too scary and blew yourself up!";
	}
}

