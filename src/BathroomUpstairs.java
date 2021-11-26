/**
 *
 * @author Khy
 */
public class BathroomUpstairs extends Room  {
	
	private String roomName = "Second Floor Bathroom";
	private String[] nextRooms = {"Bedroom One", "Bedroom Two"};
	private String[] objectsInRoom = {"Mirror", "Shower"};
	private String iconName = "Bathroom2.jpg";
	private String roomMessage = "With old bath water still in the tub, this bathroom is your least favorite room.";	

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
	
	public String[] getObjectsInRoom(){
		return this.objectsInRoom;
	}
	
	public String objectEffect(int selection){
		if (selection == 0)
			return "There is a bloody face looking back at you!";
		else if (selection == 1)
			return "Room suddenly steams up and you feel fingers touching the back of your neck!";
		return "You decided this house was too scary and blew yourself up!";
	}
}
    

