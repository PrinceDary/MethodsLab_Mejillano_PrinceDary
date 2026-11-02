# Methods Lab -- Prince Dary Mejillano

A Java console-based program that demonstrates the use of **methods**,
loops, arrays, conditional statements, and recursion.

## Overview

The program displays a menu that lets the user choose from nine
programming activities. Each activity calls a separate method to perform
a calculation or check.

## Features

  -----------------------------------------------------------------------
  Menu option             Feature                 Description
  ----------------------- ----------------------- -----------------------
  1                       Arithmetic Methods      Adds, subtracts,
                                                  multiplies, and divides
                                                  two numbers. Accepts
                                                  decimal values.

  2                       Factorial of a Number   Calculates the
                                                  factorial of an integer
                                                  using a loop.

  3                       Sum of Numbers in an    Accepts five integers
                          Array                   and returns their sum.

  4                       Prime Number Checker    Checks whether an
                                                  integer is prime.

  5                       Maximum Number in an    Accepts a user-selected
                          Array                   number of integers and
                                                  finds the largest
                                                  value.

  6                       GCD and LCM             Calculates the greatest
                                                  common divisor and
                                                  least common multiple
                                                  of two integers.

  7                       Recursive Factorial     Calculates a factorial
                                                  using recursion.

  8                       Recursive Fibonacci     Finds a Fibonacci
                                                  number using a
                                                  recursive method.

  9                       Palindrome Checker      Checks whether a word
                                                  reads the same forward
                                                  and backward, ignoring
                                                  letter case.

  0                       Exit                    Ends the program.
  -----------------------------------------------------------------------

## Requirements

-   Java Development Kit (JDK)
-   A Java IDE such as NetBeans, or a terminal/command prompt

## How to Run

### Using NetBeans

1.  Open the project in NetBeans.
2.  Locate `MethodsLab_Mejillano_PrinceDary_F.java`.
3.  Run the file or project.
4.  Follow the menu displayed in the console.
5.  Enter a menu number from `0` to `9`.

### Using a Terminal

1.  Open a terminal in the directory containing the Java file.

2.  Compile the program:

    ``` bash
    javac MethodsLab_Mejillano_PrinceDary_F.java
    ```

3.  Run the program:

    ``` bash
    java methodslab_mejillano_princedary_f.MethodsLab_Mejillano_PrinceDary_F
    ```

    If you are compiling and running from a directory layout that does
    not match the declared package, place the source file in a folder
    named `methodslab_mejillano_princedary_f` and run the commands from
    its parent directory.

## Program Structure

-   `main()` -- Displays the menu, receives user input, and calls the
    selected methods.
-   `greetings()` -- Prints the opening greeting.
-   `choice()` -- Displays the available menu options.
-   `add()`, `subtract()`, `multiply()`, `divide()` -- Perform
    arithmetic operations.
-   `factorial()` -- Calculates factorial using a loop.
-   `sA()` -- Calculates the sum of an integer array.
-   `PNC()` -- Checks whether a number is prime.
-   `mna()` -- Finds the maximum value in an integer array.
-   `GCD()` and `LCM()` -- Calculate the GCD and LCM.
-   `RF()` -- Calculates factorial recursively.
-   `FS()` -- Calculates a Fibonacci number recursively.
-   `PALINDROME()` -- Checks a word for palindrome symmetry without
    considering letter case.

## Notes and Input Limitations

-   The palindrome checker ignores uppercase and lowercase differences.
    For example, `Racecar` is considered a palindrome.
-   The palindrome option reads one word at a time; phrases containing
    spaces are not read as a complete phrase.
-   The array-sum option always accepts five integers.
-   The maximum-in-array option expects the user to enter a positive
    array size.
-   Factorial and Fibonacci values can exceed Java's numeric type limits
    for sufficiently large inputs.
-   Enter valid numeric input when prompted.

## Author

**Prince Dary Mejillano**
