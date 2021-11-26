/**
 *
 * @author Khy
 */
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
 
public class HauntedHouse {

	private Room room;
	private String roomName;
	private String playerName;
	private List<String> nextRooms;
	private List<String> itemsInRoom;
	private ImageIcon icon;
	String backpack = "";
	
	// Constructs and initialize a haunted house along	
	public HauntedHouse(String name) {	    
		this.playerName = name;		
		room = new FrontDoor();	
		roomName = room.getRoomName();
	}
	
	// Prints a welcome message	
	public void WelcomeMessage() {
		JOptionPane.showMessageDialog(null,	"Hello " + this.playerName + ".\n Welcome to Haunted House!");
	}
	
	public void ExitPosition() {		
		JOptionPane.showMessageDialog(null,	roomName, "Exit position",JOptionPane.INFORMATION_MESSAGE, icon);
	}
	
	//Display an image of the current position the player is in
	public void displayPosition() {			
		icon = new ImageIcon(room.getIconName());
		JOptionPane.showMessageDialog(null, room.getRoomMsg(), roomName, JOptionPane.INFORMATION_MESSAGE, icon);					
	}

	public void showItem(int choice) {	
		JOptionPane.showMessageDialog(null,	room.objectEffect(choice) ,	"Outcome", JOptionPane.PLAIN_MESSAGE);
	}
	
	public List<String> getConnections(String[] rooms) {
		nextRooms = new ArrayList<>();		
		for (int i=0; i<rooms.length; i++){
			this.nextRooms.add(rooms[i]);
		}		
		return this.itemsInRoom;
	}
	
	/**
	* Get all the items in a room and
	* store them in a list
	*/
	public List<String> getItemsinRoom(String[] items) {
		this.itemsInRoom = new ArrayList<>();		
		for (int i=0; i<items.length; i++){
			this.itemsInRoom.add(items[i]);
		}		
		return this.itemsInRoom;
	}
	
	// Initialize a room object given its position	
	public void openDoor(String nextRoomName) {
		if (nextRoomName.equals("Living Room"))
			room = new LivingRoom();
		else if (nextRoomName.equals("First Floor Bathroom"))
			room = new FirstFloorBathroom();
		else if (nextRoomName.equals("Dining Room"))
			room = new DiningRoom();
		else if (nextRoomName.equals("Kitchen"))
			room = new Kitchen();
		else if (nextRoomName.equals("Pantry"))
			room = new Pantry();
		else if (nextRoomName.equals("Stairs"))
			room = new Stairs();
		else if (nextRoomName.equals("Master Bedroom"))
			room = new MasterBedroom();
		else if (nextRoomName.equals("Master Bathroom"))
			room = new MasterBathroom();
		else if (nextRoomName.equals( "Bedroom One"))
			room= new BedroomOne();
		else if (nextRoomName.equals("Bedroom Two"))
			room = new BedroomTwo();
		else if (nextRoomName.equals("Second Floor Bathroom"))
			room = new BathroomUpstairs();
	}
	
	public void openRoom(String nextRoomName) {		
		openDoor(nextRoomName);
		getConnections(room.getNextRooms());
		getItemsinRoom(room.getObjectsInRoom());
		displayPosition();		
	}
	
	public int switchRooms() {
		Object[] options = new Object[this.nextRooms.size()];
		int i = 0;
		int choice;		
		for (String connection: this.nextRooms) {
			options[i] = connection;
			i++;
		}			
		choice = JOptionPane.showOptionDialog(null,
		"Which room would you like to visit?",
		"",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,
		options,
		options[0]);		
		return choice;
	}
	
	public int pickItemsInRoom() {
		Object[] options = new Object[this.itemsInRoom.size()];
		int i = 0;
		int choice;		
		for (String item: this.itemsInRoom) {
			options[i] = item;
			i++;
		}				
		choice = JOptionPane.showOptionDialog(null,
			"Wich item would you like to pick?",
			"",
			JOptionPane.YES_NO_OPTION,
			JOptionPane.QUESTION_MESSAGE,
			null,
			options,
			options[0]);		
		return choice;
	}
	
	public int displayOptions() {
		int choice;		
		Object[] options = new Object[2];		
		options[0] = "Open Door";
		options[1] = "Stay";		
		choice = JOptionPane.showOptionDialog(null,
		"Would you like to move to another room or stay?",
		"",
		JOptionPane.YES_NO_OPTION,
		JOptionPane.QUESTION_MESSAGE,
		null,
		options,
		options[0]);	
		return choice;	
	}
	
	public void game() {		
		WelcomeMessage();
		while (true) {
			openRoom(roomName);
			int choice = -1;
			if (itemsInRoom.size() == 0)
				choice =0; 
			else if(nextRooms.size() != 0) {
				choice = displayOptions();
			}			
			if (choice == 0) {
				int pick = switchRooms();				
				roomName = nextRooms.get(pick);
			} else { 
				int pick = pickItemsInRoom();
				showItem(pick);
				backpack=itemsInRoom.get(pick);
				break;
			}						
		}
		JOptionPane.showMessageDialog(null, "You have exited game!!!");
		ExitPosition();
		JOptionPane.showMessageDialog(null, "Items in backpack: "+ backpack);
	}
}