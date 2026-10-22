package part01;

//Imports local date
import java.time.LocalDate;

//Imports scanner
import java.util.Scanner;

//This brings in the Menu that we are given
import part01.Menu;

//QUB images is the menu based text console
public class QUBImages {

	public static void main(String[] args) {

		// Creates an image manager object
		ImageManager manager = new ImageManager();
		loadSampleImages(manager);

		Scanner scan = new Scanner(System.in);

		// Creates an array of all the options for the menu
		String options[] = { "Add Image", "Search by ID", "Search by Title", "Search by Description", "Search by Type",
				"Search by Date Range", "Display all images", "Exit" };

		// Sets the Next ID to 10
		int nextId = 10;

		// Creates a menu object
		Menu menu = new Menu("QUB Image System", options);

		// Switch statement which prints text based on the user choice
		int choice;

		do {

			choice = menu.getUserChoice();

			switch (choice) {

			// Adding an image selected
			case 1:
				System.out.println("Add image selected");

				System.out.println("Enter title: ");
				String title = scan.nextLine();

				System.out.println("Enter descrption: ");
				String description = scan.nextLine();

				System.out.println("Enter type (Genre): ");
				ImageType genre = ImageType.valueOf(scan.nextLine().toUpperCase());

				System.out.println("Enter date (YYYY-MM-DD): ");
				String date = scan.nextLine();

				System.out.println("Enter thumbnail: ");
				String thumbnail = scan.nextLine();

				ImageRecord image = new ImageRecord(nextId, title, description, genre, LocalDate.parse(date),
						thumbnail);

				manager.addImage(image);
				nextId++;

				System.out.println("Image added!");

				break;

			// Searching via the ID
			case 2:
				System.out.println("Search by ID selected");

				System.out.println("Enter ID: ");
				int searchId = scan.nextInt();
				scan.nextLine();

				ImageRecord result = manager.searchId(searchId);

				if (result != null) {
					System.out.println(result);
				} else {
					System.out.println("Image not found.");
				}

				break;

			// Searching via the Title
			case 3:
				System.out.println("Search by Title selected");

				System.out.println("Enter title: ");
				String searchTitle = scan.nextLine();

				ImageAlbum titleResults = manager.searchTitle(searchTitle);

				ImageRecord currentTitle = titleResults.getFirst();

				while (currentTitle != null) {
					System.out.println(currentTitle);
					currentTitle = titleResults.getNext();
				}

				break;

			// Searching via the description
			case 4:
				System.out.println("Search by Description");

				System.out.println("Enter description");
				String searchDesc = scan.nextLine();

				ImageAlbum descResults = manager.searchDescription(searchDesc);

				ImageRecord currentDesc = descResults.getFirst();

				while (currentDesc != null) {
					System.out.println(currentDesc);
					currentDesc = descResults.getNext();
				}

				break;

			// Searching via the type (genre)
			case 5:
				System.out.println("Search by type (genre)");

				System.out.println("Enter Image Type: ");
				ImageType searchType = ImageType.valueOf(scan.nextLine().toUpperCase());

				ImageAlbum typeResults = manager.searchGenre(searchType);

				ImageRecord currentType = typeResults.getFirst();

				while (currentType != null) {
					System.out.println(currentType);
					currentType = typeResults.getNext();
				}

				break;

			// Searching via the date range
			case 6:
				System.out.println("Search by date range");

				System.out.println("Enter start date (YYYY-MM-DD): ");
				LocalDate start = LocalDate.parse(scan.nextLine());

				System.out.println("Enter end date (YYYY-MM-DD): ");
				LocalDate end = LocalDate.parse(scan.nextLine());

				ImageAlbum dateResults = manager.searchDates(start, end);

				ImageRecord currentDate = dateResults.getFirst();

				while (currentDate != null) {
					System.out.println(currentDate);
					currentDate = dateResults.getNext();
				}

				break;

			// Displaying all of the images
			case 7:
				System.out.println("Display all images");

				ImageAlbum album = manager.getAllImages();
				ImageRecord current = album.getFirst();

				while (current != null) {
					System.out.println(current);
					current = album.getNext();
				}
				break;

			// Exiting the program
			case 8:
				System.out.println("Exiting program");
				System.exit(0);
				break;

			// Default message if one of the options isn't chosen
			default:
				System.out.println("Invalid Option");
				break;

			}

		} while (choice != 8);

	}

	/**
	 * Sample Images
	 * 
	 * @param manager - Stores and manages the image collection
	 */
	private static void loadSampleImages(ImageManager manager) {
		manager.addImage(new ImageRecord(1, "Andromeda Galaxy", "Image of the Andromeda galaxy.", ImageType.ASTRONOMY,
				LocalDate.of(2023, 1, 1), "Andromeda.png"));
		manager.addImage(new ImageRecord(2, "Lanyon QUB", "An image of the QUB Lanyon building.",
				ImageType.ARCHITECTURE, LocalDate.of(2023, 2, 1), "LanyonQUB.png"));
		manager.addImage(new ImageRecord(3, "Kermit Plays Golf", "An image of Kermit the frog playing golf.",
				ImageType.SPORT, LocalDate.of(2023, 3, 1), "KermitGolf.png"));
		manager.addImage(new ImageRecord(4, "Mourne Mountains", "A panoramic view of the Mourne mountains.",
				ImageType.LANDSCAPE, LocalDate.of(2023, 4, 1), "Mournes.png"));
		manager.addImage(new ImageRecord(5, "Homer Simpson", "Homer Simpson - a portrait of the man.",
				ImageType.PORTRAIT, LocalDate.of(2023, 3, 1), "Homer.png"));
		manager.addImage(new ImageRecord(6, "Red Kite", "A Red Kite bird of prey in flight.", ImageType.NATURE,
				LocalDate.of(2023, 4, 1), "RedKite.png"));
		manager.addImage(new ImageRecord(7, "Central Park", "An overhead view of Central Park New York USA.",
				ImageType.AERIAL, LocalDate.of(2023, 5, 1), "CentralPark.png"));
		manager.addImage(new ImageRecord(8, "Apples", "A bunch of apples.", ImageType.FOOD, LocalDate.of(2023, 6, 1),
				"Apples.png"));
		manager.addImage(new ImageRecord(9, "Programming Meme", "A Chat GPT programming meme.", ImageType.OTHER,
				LocalDate.of(2023, 7, 1), "ChatGPT.png"));

	}
}
