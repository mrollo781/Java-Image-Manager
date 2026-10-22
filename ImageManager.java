package part01;

//imports the local date
import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Image manager allows adding images, searching different aspects of the images
 * and to get a whole album of images
 */
public class ImageManager {

//Instance Variables

	private ArrayList<ImageRecord> images;

	public ImageManager() {
		images = new ArrayList<>();
	}

	/**
	 * Adds an image to the album
	 * 
	 * @param image - The image being added
	 */
	public void addImage(ImageRecord image) {
		images.add(image);
	}

	/**
	 * Allows you to search for a specific ID
	 * 
	 * @param id - The unique identifier of the image
	 * @return - Returns the image
	 */
	public ImageRecord searchId(int id) {
		for (int i = 0; i < images.size(); i++) {

			if (images.get(i).getId() == id) {
				return images.get(i);
			}

		}
		return null;
	}

	/**
	 * Allows you to search for a specific Title of an image
	 * 
	 * @param str - Title name of image
	 * @return - Returns the album images
	 */
	public ImageAlbum searchTitle(String str) {

		ImageAlbum album = new ImageAlbum();

		for (int i = 0; i < images.size(); i++) {

			if (images.get(i).getTitle().toLowerCase().contains(str.toLowerCase())) {
				album.addImage(images.get(i));
			}
		}
		return album;
	}

	/**
	 * Allows you to search for a specific description of an image
	 * 
	 * @param str - Description of image
	 * @return - Returns the album images
	 */
	public ImageAlbum searchDescription(String str) {

		ImageAlbum album = new ImageAlbum();

		for (int i = 0; i < images.size(); i++) {

			if (images.get(i).getDescription().toLowerCase().contains(str.toLowerCase())) {
				album.addImage(images.get(i));
			}
		}
		return album;
	}

	/**
	 * Allows you to search for a specific Genre type from the Image Type enum
	 * 
	 * @param type - The type of image selected
	 * @return - Returns the album images
	 */
	public ImageAlbum searchGenre(ImageType type) {

		ImageAlbum album = new ImageAlbum();

		for (int i = 0; i < images.size(); i++) {

			if (images.get(i).getGenre() == type) {
				album.addImage(images.get(i));
			}

		}
		return album;
	}

	/**
	 * Allows you to search for a specific dates
	 * 
	 * @param start - Start date entered
	 * @param end   - End date entered
	 * @return - Returns the album images
	 */
	public ImageAlbum searchDates(LocalDate start, LocalDate end) {

		ImageAlbum album = new ImageAlbum();

		for (int i = 0; i < images.size(); i++) {

			LocalDate date = images.get(i).getDateTaken();

			if ((date.isEqual(start) || date.isAfter(start)) && (date.isEqual(end) || date.isBefore(end))) {
				album.addImage(images.get(i));
			}
		}
		return album;
	}

	/**
	 * Allows you to get all images from an album
	 * 
	 * @return - Returns the album images
	 */
	public ImageAlbum getAllImages() {

		ImageAlbum album = new ImageAlbum();

		for (int i = 0; i < images.size(); i++) {

			album.addImage(images.get(i));
		}
		return album;
	}
}
