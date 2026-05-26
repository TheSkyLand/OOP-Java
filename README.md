# OOP Patterns Training Project

Educational repository containing implementations of classic Creational Design Patterns in Java. 

## Project Structure

The project is divided into 5 independent packages, each focusing on a specific design pattern:

* **`task1`**: Singleton pattern implementation.
* **`task2`**: Factory Method pattern implementation.
* **`task3`**: Abstract Factory pattern implementation.
* **`task4`**: Builder pattern implementation.
* **`task5`**: Prototype pattern implementation.

## Features

### Task 1: Singleton
* Ensures a class has only one instance.
* Provides a global access point to that instance.
* Implemented using a thread-safe lazy initialization approach.

### Task 2: Factory Method
* Defines an interface for creating an object.
* Allows subclasses to alter the type of objects that will be created.
* Delegates instantiation logic to specialized factory subclasses.

### Task 3: Abstract Factory
* Provides an interface for creating families of related or dependent objects.
* Prevents concrete classes from binding directly to client code.
* Ensures compatibility between created objects.

### Task 4: Builder
* Separates the construction of a complex object from its representation.
* Allows step-by-step object creation.
* Enables the generation of different representations using the same construction process.

### Task 5: Prototype
* Allows cloning existing objects without making the code dependent on their classes.
* Uses a built-in or custom clone interface.
* Optimizes performance when object creation is resource-heavy.

## Requirements

* Java Development Kit (JDK) 17 or higher
* Maven or Gradle (optional, for dependency management)

## Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com
   ```
2. Navigate to the project directory:
   ```bash
   cd oop-patterns-training
   ```
3. Open the project in your preferred IDE (IntelliJ IDEA, Eclipse, or VS Code) and run the `main` methods inside each task package to see the patterns in action.
