package part01;

//Image Type stores all the different types of images in one enum
public enum ImageType {

//Different image types

	ASTRONOMY("Photography or imaging of astronomical objects, celestial events, or areas of the night sky."),
	ARCHITECTURE("Focuses on the capture of images that accurately represent the design and feel of buildings."),
	SPORT("Covers all types of sports and can be considered a branch of photojournalism."),
	LANDSCAPE("The study of the textured surface of the Earth and features images of natural scenes."),
	PORTRAIT("Images of a person or a group of people where the face and facial features are predominant."),
	NATURE("Focused on elements of the outdoors including sky, water, and land, or the flora and fauna."),
	AERIAL("Images taken from an aircraft or other airborne platforms."),
	FOOD("Captures everything related to food, from fresh ingredients and plated dishes to the cooking process."),
	OTHER("Covers just about any other type of image and photography genre.");

	/**
	 * Description variable
	 */
	private String description;

	/**
	 * Connecting this description object to the description object
	 * 
	 * @param description - The description of the image
	 */
	ImageType(String description) {
		this.description = description;
	}

	/**
	 * Returns the value of description
	 * 
	 * @return - Returns the description of image
	 */
	public String getDescription() {
		return description;
	}

}
