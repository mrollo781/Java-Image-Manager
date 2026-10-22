package part01;

//Brings in the scanner
import java.util.Scanner;

/**
 * Instance variables - Items , title, input
 */
public class Menu {
	private String items[];
	private String title;
	private Scanner input;

	/**
	 * Menu constructor which connects these variables to the current instance
	 * 
	 * @param title - Title of Menu
	 * @param data  - Array of menu options
	 */
	public Menu(String title, String data[]) {
		this.title = title;
		this.items = data;
		this.input = new Scanner(System.in);
	}

	/**
	 * Displays the titles
	 */
	private void display() {
		System.out.println(title);
		for (int count = 0; count < title.length(); count++) {
			System.out.print("+");
		}
		System.out.println();
		for (int option = 1; option <= items.length; option++) {
			System.out.println(option + ". " + items[option - 1]);
		}
		System.out.println();
	}

	/**
	 * Asks the user for input and returns it
	 * 
	 * @return - Returns the value the user choose
	 */
	public int getUserChoice() {
		display();
		System.out.print("Enter Selection: ");
		int value = input.nextInt();
		return value;
	}
}
