package part01;

//Imports the local date
import java.time.LocalDate;

/**
 * The image record creates the getters, setters and toString method for the
 * program
 */
public class ImageRecord {

	// Instance Variables - Data used to store inside the object
	private int id;
	private String title;
	private String description;
	private ImageType genre;
	private LocalDate dateTaken;
	private String thumbnail;

	/**
	 * Constructor - Creating the record object
	 * 
	 * @param id          - ID of image
	 * @param title       - Title of image
	 * @param description - Description of image
	 * @param genre       - Genre of image
	 * @param dateTaken   - Date Taken of image
	 * @param thumbnail   - Thumbnail of image
	 */
	public ImageRecord(int id, String title, String description, ImageType genre, LocalDate dateTaken,
			String thumbnail) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.genre = genre;
		this.dateTaken = dateTaken;
		this.thumbnail = thumbnail;
	}

	// Accessors (Getters) - allowing you to get the values of the objects

	/**
	 * Returns the ID
	 * 
	 * @return - Returns the ID of the image
	 */
	public int getId() {
		return id;
	}

	/**
	 * Returns the title
	 * 
	 * @return - Returns the Title of the image
	 */
	public String getTitle() {
		return title;

	}

	/**
	 * Returns the description
	 * 
	 * @return - Returns the description of the image
	 */
	public String getDescription() {
		return description;

	}

	/**
	 * Returns the genre from the Image Type enum
	 * 
	 * @return - Returns the Image Type of the image
	 */
	public ImageType getGenre() {
		return genre;

	}

	/**
	 * Returns the date taken
	 * 
	 * @return - Returns the Date Taken of the image
	 */
	public LocalDate getDateTaken() {
		return dateTaken;

	}

	/**
	 * Returns the thumbnail
	 * 
	 * @return - Returns the thumbnail of the image
	 */
	public String getThumbnail() {
		return thumbnail;
	}

	// Mutators (Setters) - Allows modification of variables

	/**
	 * Sets the ID
	 * 
	 * @param id - Sets the ID to a specific value
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Sets the title
	 * 
	 * @param title - Sets the Title to a specific value
	 */
	public void setTitle(String title) {
		this.title = title;

	}

	/**
	 * Sets the description
	 * 
	 * @param description - Sets the Description to a specific value
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Sets the genre
	 * 
	 * @param genre - Sets the Genre to a specific value
	 */
	public void setGenre(ImageType genre) {
		this.genre = genre;

	}

	/**
	 * Sets the date Taken
	 * 
	 * @param dateTaken - Sets the Date Taken to a specific value
	 */
	public void setDateTaken(LocalDate dateTaken) {
		this.dateTaken = dateTaken;
	}

	/**
	 * Sets the thumbnail
	 * 
	 * @param thumbnail - Sets the Thumbnail to a specific value
	 */
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	/**
	 * To String Method - Formats the text and shows what each value is
	 */
	@Override
	public String toString() {
		return "ID: " + id + " Title: " + title + " Description: " + description + " Genre: " + genre + " Date Taken: "
				+ dateTaken + " Thumbnail: " + thumbnail;

	}
}
