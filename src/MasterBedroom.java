/**
 *
 * @author Khy
 */
public class MasterBedroom extends Room {
	
	private String roomName = "Master Bedroom";
	private String[] nextRooms = {"Master Bathroom"};
	private String[] objectsInRoom = {"Jewerly Box"};
	private String iconName = "Master2.png";
	private String roomMessage = "There's a ghost queen in the master bedroom!";	
	
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
			return "You found the cursed Hope Diamond and feel your doom!";
		return "You decided this house was too scary and blew yourself up!";
	}
}
