`This readme.md file has been generated with assistance from Perplexity AI. The rest of the codes were without AI.`

# Simple Car Inheritance

A small Java project demonstrating inheritance, method overriding, simple formatting helpers, and equality comparisons between objects.

## Overview

This project contains a base class `Car` and two subclasses: `NewCar` and `UsedCar`.
A `Helper` class provides simple number formatting utilities. The `CarDriver` class is the driver to exercise these classes.

Files (in package `OOP_A2`):

- `Car.java` — Superclass that stores a calculated `price` (price = cost * 2).
- `NewCar.java` — Extends `Car`, adds `color`, implements `equals()` and `display()`.
- `UsedCar.java` — Extends `Car`, adds `mileage`, implements `equals()` and `display()`.
- `Helper.java` — Formatting helpers: `formatTwoDecimals`, `formatfourDecimals`, `formatCommas`.
- `CarDriver.java` — `main` method that creates and compares objects, printing details when equal.

## Quick class summary

- `Car`
  - Private field: `double price` (set as `cost * 2` in constructor)
  - `getPrice()` returns the calculated price

- `NewCar`
  - Field: `String color`
  - Constructor: `NewCar(double cost, String color)` calls `super(cost)`
  - `equals(Object obj)` compares `color` and `getPrice()`
  - `display()` prints price (formatted) and color

- `UsedCar`
  - Field: `int mileage`
  - Constructor: `UsedCar(double cost, int mileage)` calls `super(cost)`
  - `equals(Object obj)` compares `mileage` and `getPrice()`
  - `display()` prints price (formatted) and mileage (formatted)

- `Helper`
  - `formatTwoDecimals(double)` — returns string with two decimal places and grouping separators
  - `formatfourDecimals(double)` — returns string with four decimal places and grouping separators
  - `formatCommas(double)` — returns string with zero decimal places and grouping separators

## Build & run (Windows)

Assuming your source files are in the current directory (package path `OOP_A2`) or in `src\OOP_A2` relative to the workspace root.

1. Open Command Prompt (cmd.exe) and change to the project root where the `OOP_A2` folder exists.

2. Compile all classes and put class files into an `out` directory:

```bat
javac -d out OOP_A2\*.java
```

(If your sources are under `src\OOP_A2`, run:)

```bat
javac -d out src\OOP_A2\*.java
```

3. Run the driver class:

```bat
java -cp out OOP_A2.CarDriver
```

## Expected output

Given the provided `CarDriver` code, expected console output is two lines (one for `NewCar`, one for `UsedCar`):

```
price = $16,000.66, color = silver 
price = $5,000.00, mileage = 100,000 
```

Explanation:
- `NewCar(8000.33, "silver")` => price = 2 * 8000.33 = 16000.66 (formatted to `16,000.66`).
- `UsedCar(2500, 100000)` => price = 2 * 2500 = 5000.00 and mileage `100,000`.



## Contact

For questions or issues regarding this project, please refer to the course materials or author.



