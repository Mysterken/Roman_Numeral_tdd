# Java Roman Numeral Converter

This project is a simple Java application that converts decimal numbers to Roman numerals.

## Prerequisites

- Java 22
- Maven

## Building the Project

1. Open a terminal in the project root directory.
2. Run the following command to build the project:

```bash
mvn clean install
```

This command cleans the project, compiles the source code, runs the tests, and packages the compiled code into a JAR file.

## Running the Tests

The tests are run automatically during the build process. If you want to run the tests separately, you can do so with the following command:

```bash
mvn test
```

This command runs all the tests in the project and outputs the results to the console.

## Using the Application

The `RomanNumeralConverter` class contains a `convertToRoman` method that converts a decimal number to a Roman numeral. Here's an example of how to use it:

```java
RomanNumeralConverter converter = new RomanNumeralConverter();
String roman = converter.convertToRoman(1990);
System.out.println(roman);  // Outputs: MCMXC
```