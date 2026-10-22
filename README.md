# Java Image Manager

An Object-Oriented Java application built to store, manage, and filter a collection of image records. This project demonstrates core OOP principles including encapsulation, custom enumerations, object state management, and algorithmic filtering.

## Features
* **Data Models:** Utilizes `ImageRecord` objects to store detailed metadata (ID, title, description, genre, date, thumbnail).
* **Robust Searching:** Filters images dynamically by ID, title keyword, description text, enum-based `ImageType` (e.g., ASTRONOMY, ARCHITECTURE), or date ranges.
* **Dual Interfaces:**
  * `QUBImages.java` (Part 01): A standard, lightweight command-line interface.
  * `QUBMediaImages.java` (Part 02): An enhanced console interface implementing color-coded text and GUI-based thumbnail rendering.

## Project Structure
* **`part01/`**: Contains the core logic classes (`ImageAlbum`, `ImageManager`, `ImageRecord`, `ImageType`, `Menu`) and the standard execution file (`QUBImages.java`).
* **`part02/`**: Contains the GUI-enhanced execution file (`QUBMediaImages.java`). 

## Note on Execution
To compile and run `QUBMediaImages.java`, a custom `console.jar` graphics library must be present in the build path. If you are reviewing this code without the library, `QUBImages.java` serves as the primary standalone executable.
