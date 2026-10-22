package part01;

//Imports the array list
import java.util.ArrayList;

//Image album allows you to add an image, get the first image, 
//get the next image and get the previous image
public class ImageAlbum {

	/**
	 * Instance variables, keeps the image records and the position
	 */
	private ArrayList<ImageRecord> images;
	private int index;

	/**
	 * Constructor - Sets the variables values
	 */
	public ImageAlbum() {
		images = new ArrayList<>();
		index = -1;
	}

	/**
	 * Adds an image to the album
	 * @param image - The image getting added
	 */
	public void addImage(ImageRecord image) {
		int pos = 0;
		while (pos < images.size() && images.get(pos).getDateTaken().isBefore(image.getDateTaken())) {
			pos++;
		}
		images.add(pos, image);
	}

	/**
	 * Gets the first image in the album
	 * @return - Returns nothing or the index of the image
	 */
	public ImageRecord getFirst() {
		if (images.size() == 0) {
			return null;
		}
		index = 0;
		return images.get(index);
	}

	/**
	 * Gets the next record in the album
	 * @return - Returns nothing or the index of the image
	 */
	public ImageRecord getNext() {
		if (index == -1 || index + 1 >= images.size()) {
			return null;
		}
		index++;
		return images.get(index);
	}

	/**
	 * Gets the previous record in the album
	 * @return - Returns nothing or the index of the image
	 */
	public ImageRecord getPrevious() {
		if (index <= 0) {
			return null;
		}
		index--;
		return images.get(index);
	}
}
