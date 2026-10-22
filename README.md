# Java Image Manager

An Object-Oriented Java application built to store, manage, and dynamically filter a collection of image metadata. This project was developed to demonstrate core OOP principles, including encapsulation, custom enumerations, object state management, and algorithmic filtering, using standard Java libraries.

## Features
* **Data Modeling:** Utilizes custom `ImageRecord` objects to securely store detailed metadata (ID, title, description, genre, date, thumbnail filename).
* **Robust Searching & Filtering:** Traverses ArrayLists to filter image records dynamically by unique ID, title keyword, description text, enum-based `ImageType` (e.g., ASTRONOMY, ARCHITECTURE), or chronological date ranges.
* **Interactive Console Interface:** Features a continuous, menu-driven command-line loop allowing users to intuitively add new records or query existing ones without exiting the application.

## Technologies Used
* **Java (Standard Edition):** Core logic, control flow, and I/O operations.
* **Data Structures:** `ArrayList` for dynamic memory allocation and storage of custom objects.
* **Time API:** `java.time.LocalDate` for parsing and evaluating date-based search parameters.

## How to Run
This application relies exclusively on standard Java libraries and requires no external dependencies. 

1. Clone the repository and navigate to the project directory.
2. Compile the Java files:
   ```bash
   javac part01/*.java
