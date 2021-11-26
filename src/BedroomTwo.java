/**
 *
 * @author Khy
 */
public class BedroomTwo extends Room {	
	private String roomName = "Bedroom Two";
	private String[] nextRooms = {"Second Floor Bathroom"};
	private String[] objectsInRoom = {"Doll House", "Dresser"};
	private String iconName = "Master1.png";
	private String roomMessage = "This bedroom feels warmer than the others.";	
	
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
			return "The dolls start dancing on their own!";
		else if (selection == 1)
			return "A ghost flies out of the dresser and goes right though your body!";
		return "You decided this house was too scary and blew yourself up!";
	}
}
    

