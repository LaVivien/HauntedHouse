/**
 *
 * @author Khy
 */
public class FirstFloorBathroom extends Room {	
	private String roomName = "First Floor Bathroom";
	private String[] nextRooms = {};
	private String[] objectsInRoom = {"Mirror", "Shower"};
	private String iconName = "Bathroom1.jpg";
	private String roomMessage = "Shady cool musky and a creeky floor, the bathroom gives your a fright.";
	
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
			return "See a bloody face looking back at you!";
		else if (selection == 1)
			return "Room suddenly steams up and you feel fingers touching the back of your neck";
		return "You decided this house was too scary and blew yourself up!";
	}
}
