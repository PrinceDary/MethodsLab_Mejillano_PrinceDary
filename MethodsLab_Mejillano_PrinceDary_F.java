/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package methodslab_mejillano_princedary_f;

import java.util.Scanner;

/**
 *
 * @author Prince Dary
 */
public class MethodsLab_Mejillano_PrinceDary_F {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner ML = new Scanner(System.in);
        // TASK 1
        greetings();
        int mlt;

        do {
            choice();
            mlt = ML.nextInt();
            if (mlt < 0 || mlt > 9) {
                System.out.println("Invalid choice. Please pick a number from 0 to 9.");
            }
            
            switch (mlt) {
        
            case 1: // TASK 2
                System.out.println("Welcome to Arithmetic Methods!");
                System.out.println("Please enter the first number:");
                double num1 = ML.nextDouble();
                System.out.println("Please enter the second number:");
                double num2 = ML.nextDouble();
                System.out.println("Results:");

                System.out.println("Addition: " + add(num1, num2));
                System.out.println("Subtraction: " + subtract(num1, num2));
                System.out.println("Multiplication: " + multiply(num1, num2));
                if (num2 == 0) {
                    System.out.println("Division: Any number divided by zero is undefined.");
                } 
                
                System.out.println("Division: " + divide(num1, num2));
                break;

                
            case 2: // TASK 3
                System.out.println("Welcome to Facotrial of a Number!");
                System.out.println("Please enter a number:");
                int N = ML.nextInt();
                if (N < 0) {
                    System.out.println("Invalid. Factorial of a negative number does not exist.");
                }
                System.out.println("Factorial of " + N + " is = " + factorial(N));
                break;
                
                
            case 3: // TASK 4
                System.out.println("Welcome to the Sum of Numbers in an Array!");
                int SA [] = new int [5];
                System.out.println("Please enter the first number:");
                for (int i = 0; i < SA.length; i++) {
                    System.out.println("Enter number " + (i + 1) + ":");
                    SA [i] = ML.nextInt();
                } 
                System.out.println("The Sum of Numbers is " + sA (SA));
                break;
            
            
            case 4: // TASK 5
                System.out.println("Welcome to Prime Number Checker!");
                System.out.println("Please enter a number:");
                int num = ML.nextInt();
                if (PNC (num)) {
                    System.out.println(num + " is a prime number. ");
                } else {
                    System.out.println(num + " is not a prime number.");
                }
                break;
        
                
            case 5: // TASK 6
                System.out.println("Welcome to Maximum Number in an Array.");
                System.out.println("How many numbers?");
                int n = ML.nextInt();
                int MNA [] = new int [n];
                for (int i = 0; i < n; i++) {
                        System.out.println("Enter number " + (i + 1) + ": ");
                        MNA [i] = ML.nextInt();
                    }
                System.out.println("The Maximum Number in the Array is " + mna (MNA));
                break;
                
                
            case 6: // TASK 7
                System.out.println("Welcome to GCD and LCM of Number!");
                System.out.println("Please enter the first positive number:");
                int Num1 = ML.nextInt();
                System.out.println("Please enter the second positive number:");
                int Num2 = ML.nextInt();
                
                if (Num1 < 0 || Num2 < 0) {
                    System.out.println("Invalid. Please enter positive and numbers greater than zero.");
                } else if (Num1 == 0 && Num2 == 0) {
                    System.out.println("LCM is Mathematically undefined.");
                } else {
                    System.out.println("The GCD of " + Num1 + " and " + Num2 + " is " + GCD(Num1, Num2));
                    System.out.println("The LCM of " + Num1 + " and " + Num2 + " is " + LCM(Num1, Num2));
                } break;
                
            case 7: // CHALLENGE 1
                System.out.println("Welcome to Recursive Factorial!");
                System.out.println("Please enter a number: ");
                int NUM = ML.nextInt();
                
                if (NUM < 0) {
                    System.out.println("Invalid. The Recursive Factorial of a negative number does not exist.");
                }
                
                System.out.println("The Recursive Factorial of " + NUM + " is " + RF (NUM));
                break;
                
                
            case 8: // CHALLENGE 2
                System.out.println("Welcome to Recursive Fibonacci!");
                System.out.println("Please enter a number: ");
                int numf = ML.nextInt();
                
                if (numf < 0) {
                    System.out.println("Invalid value.");
                }
                
                System.out.println("The Recursive Fibonacci of " + numf + " is " + FS (numf));
                break;
                
                
            case 9: // CHALLENGE 3
                System.out.println("Welcome to Palindrome word checker!");
                System.out.println("Please enter a word: ");
                String word = ML.next ().trim ();
                
                if (PALINDROME (word)) {
                    System.out.println("\"" + word + "\" is a palindrome.");
                } else {
                    System.out.println("\"" + word + "\" is not a palindrome.");
                } 
                break;
                
                
                
                
                
                
                
                
        
// -----MAIN----- //
    }
    } while (mlt != 0);
        if (mlt == 0) {
            System.out.println("Thank you!");
        }
    }

//----------------------------------------------------------------------------//
    // ----- METHODS ----- // 
    //TASK 1: Greetings
    static void greetings () {
        System.out.println("Good Day, Sir Jamie!");
    }

    static void choice() {
        System.out.println("Please choose among the following:");
        System.out.println("1. Arithmetic Methods");
        System.out.println("2. Factorial of a Number");
        System.out.println("3. Sum of Numbers in an Array");
        System.out.println("4. Prime Number Checker");
        System.out.println("5. Maximum Number in an Array");
        System.out.println("6. GCD and LCM of Number");
        System.out.println("7. Recursive factorial");
        System.out.println("8. Recursive Fibonacci");
        System.out.println("9. isPalindrome(String)");
        System.out.println("0. End");
    }

    // TASK 2: Arithemtic Methods
    // NOTE: I used double just in case the user chooses to input decimal/fractional numbers
    static double add (double num1, double num2) {
        return num1 + num2;
    }
    static double subtract (double num1, double num2) {
        return num1 - num2;
    }
    static double multiply (double num1, double num2) {
        return num1 * num2;
    }
    static double divide (double num1, double num2) {
        return num1 / num2;
    }

    // TASK 3: Factorial of a Number
    static int factorial (int num) {
        int Factorial = 1;
        for (int i = 1; i <= num; i++) {
            Factorial *= i;
        }
        return Factorial;
    }

    // TASK 4: sumArray(int[])
    static int sA (int SA []) {
        int sum = 0;
        for (int i = 0; i < SA.length; i++) {
            sum += SA[i];
        }
        return sum;
        
    }

    // TASK 5: isPrime(int)
    static boolean PNC (int num) {
        if (num < 2) {
            return false;
        } else {
            for (int i = 2; i * i <= num; i++) {
                if (num % 2 == 0) {
                    return false;
                }
            }   
        }
        return true;
    }

    // TASK 6: maxInArray(int[])
    static int mna(int MNA[]) {
        int max = MNA [0];
                    for (int i = 1; i < MNA.length; i++) {
                        if (MNA [i] > max) {
                            max = MNA [i];
                        }
                    } return max;
    }

    // TASK 7: gcd(int, int) and lcm(int, int)
    static int GCD (int num1, int num2) {
        int x = num1;
        int y = num2;
        
        while (y != 0) {
            int GCD = y;
            y = x % y;
            x = GCD;    
        } return x;
    }
    
    static int LCM (int num1, int num2) {
        return ((num1 / GCD (num1, num2)) * num2);
    }

    // CHALLENGE 1: Recursive factorial
    static long RF (int num) {
        if (num <= 1) {
            return 1;
        } return num * RF (num - 1); 
    }

    // CHALLENGE 2: Recursive Fibonacci
    static int FS (int num) {
        if (num <= 1) {
            return num;
        } return FS(num - 1) + FS(num - 2);
    } 

    // CHALLENGE 3: isPalindrome(String)
    static boolean PALINDROME (String P) {
        if (P == null) return false;
        
        String r = P.toLowerCase();
        int left = 0;
        int right = r.length () - 1;
        
        while (left < right) {
            if (r.charAt(left) != r.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
    
// ----- FINAL BRACKET ----- //    
}


