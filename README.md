# ChrisS3-Java-QAP2
Java assessment covering object composition and aggregation. 

# QAP 2Java (Campus Map)

## Project Description
[cite_start]This project demonstrates **Object-Oriented Programming (OOP)** concepts like **Aggregation** and **Composition** using Java[cite: 31, 32, 132]. [cite_start]I have built a system that models a University Campus by combining simpler objects (Points and Shapes) into complex systems (Credit Cards and Campus Maps)[cite: 36, 133].

## Project Structure
The project is organized into packages to keep the code clean and modular:

* [cite_start]**Financial Classes**: `Money` and `CreditCard` (Handles secure transactions and balances)[cite: 45, 54].
* [cite_start]**Geometry Classes**: `MyPoint`, `MyLine`, `MyCircle`, and `MyRectangle` (The building blocks for the map)[cite: 113, 124, 136].
* [cite_start]**Campus System**: `CampusMap` (Aggregates the shapes to create a full campus layout)[cite: 133, 138].

## Key Features
* [cite_start]**Aggregation**: Building a `CreditCard` that "has a" `Person` and `Money`[cite: 36, 37].
* [cite_start]**Logic**: Calculating total walkway lengths and fountain areas across the campus[cite: 148, 150].
* [cite_start]**Security**: Using copy constructors to ensure data isn't accidentally changed when passing objects[cite: 40, 59].

## How to Run
1.  Clone the repository.
2.  Compile all files: `javac *.java`
3.  Run the test drivers:
    * [cite_start]`java CreditCardDemo` [cite: 75]
    * [cite_start]`java TestCampusMap` [cite: 165]

---
[cite_start]*Completed by Christopher Britten -SD 15  Keyin College (2026)*[cite: 3, 5].
