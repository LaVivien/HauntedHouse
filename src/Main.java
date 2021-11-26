/**
 *
 * @author Khy
 */
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Please enter your name");		
		HauntedHouse house = new HauntedHouse(name);	
		house.game();
	}
}
