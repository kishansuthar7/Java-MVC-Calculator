
# Java MVC Calculator

A desktop calculator application developed using Java Swing and the Model-View-Controller (MVC) architecture.

## Features

- Addition, subtraction, multiplication and division
- Percentage calculation
- Graphical user interface using Java Swing
- Input validation
- Division-by-zero error handling
- Separation of Model, View and Controller

## Technologies Used

- Java
- Java Swing
- MVC Architecture
- Git and GitHub

## Project Structure

```text
CalculatorProject/
├── src/
│   └── Calculator/
│       ├── Main.java
│       ├── Models.java
│       ├── Views.java
│       └── Controller.java
├── .gitignore
└── README.md
```

## How to Run

### Prerequisites

- JDK installed
- Java compiler (`javac`) available in PATH

### Compile

```powershell
javac -d out src/Calculator/*.java
```

### Run

```powershell
java -cp out Calculator.Main
```

## MVC Architecture

- **Model:** Performs mathematical calculations.
- **View:** Displays the graphical calculator interface.
- **Controller:** Handles user actions and connects the Model with the View.

## Future Improvements

- Keyboard input support
- Improved user interface
- Calculation history
- Additional mathematical operations

## Author

Kishan Suthar
