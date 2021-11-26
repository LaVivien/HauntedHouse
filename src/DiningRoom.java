/**
 *
 * @author Khy
 */
public class DiningRoom extends Room {
	private String roomName = "Dining Room";
	private String[] nextRooms = {"Kitchen"};
	private String[] objectsInRoom = {"Candelabra"};
	private String iconName = "DiningRoom.jpg";
	private String roomMessage = "Did you spot Moaning Myrtle? No, but you definately saw a ghost!";	
	
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
			return "Light up by themselves and you see a death shadow!";
		return "You decided this house was too scary and blew yourself up!";
	}
}
    
