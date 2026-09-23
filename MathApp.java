/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathapp;

import java.util.Scanner;

public class MathApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Math App Menu =====");
            System.out.println("1.  Addition of two numbers");
            System.out.println("2.  Subtraction of two numbers");
            System.out.println("3.  Multiplication of two numbers");
            System.out.println("4.  Division of two numbers");
            System.out.println("5.  Factorial of a number");
            System.out.println("6.  Power (x^y)");
            System.out.println("7.  Sum of numbers 1 to N");
            System.out.println("8.  Check if a number is prime");
            System.out.println("9.  Greatest Common Divisor (GCD)");
            System.out.println("10. Absolute value of a number");
            System.out.println("11. Average of N numbers");
            System.out.println("12. Maximum of N numbers");
            System.out.println("0.  Exit");

            System.out.println("Enter your choice:");

            while (!input.hasNextInt()) {
                System.out.println("Invalid choice. Try again.");
                input.next();
            }
            choice = input.nextInt();

            if (choice < 0) {
                System.out.println("Enter a positive whole number");
            } else if (choice > 12) {
                System.out.println("Your choice must be from 0 to 12 only.");
                System.out.println("Please try again.");
            } else {
                switch (choice) {
                    // Addition
                    case 1 -> {
                        System.out.println("Enter first number:");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }
                        double addn1 = input.nextDouble();

                        System.out.println("Enter second number");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        double addn2 = input.nextDouble();

                        double sum = addn1 + addn2;

                        System.out.println("Answer:" + sum);
                    }

                    // Subtraction
                    case 2 -> {
                        System.out.println("Enter first number");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        double subn1 = input.nextDouble();

                        System.out.println("Enter second number");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        double subn2 = input.nextDouble();

                        double difference = subn1 - subn2;

                        System.out.println("Answer:" + difference);
                    }

                    // Multiplication
                    case 3 -> {
                        System.out.println("Enter first number");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        double muln1 = input.nextDouble();

                        System.out.println("Enter second number");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        double muln2 = input.nextDouble();

                        double product = muln1 * muln2;

                        System.out.println("Answer:" + product);
                    }

                    // Division
                    case 4 -> {
                        System.out.println("Enter numerator");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }
                        double nume = input.nextDouble();

                        System.out.println("Enter denominator");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        double denomi = input.nextDouble();

                        if (denomi == 0) {
                            System.out.println("Error! Cannot divide a number by zero.");
                        } else {
                            double quotient = nume / denomi;
                            System.out.println("Answer:" + quotient);
                        }
                    }

                    // Factorial
                    case 5 -> {
                        System.out.println("Enter a positive whole number");

                        while (!input.hasNextInt()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }
                        int numfactorial = input.nextInt();

                        if (numfactorial < 0) {
                            System.out.println("Error: Factorials cannot be negative.");
                        } else {
                            long factorial = 1;
                            int i = 1;

                            while (i <= numfactorial) {
                                factorial = factorial * i;
                                i++;
                            }

                            System.out.println("Factorial:" + factorial);
                        }
                    }

                    //  Power
                    case 6 -> {
                        System.out.println("Enter the base(x):");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        double base = input.nextDouble();

                        System.out.println("Enter the exponent(y):");
                        double exponent = input.nextDouble();

                        double answer = Math.pow(base, exponent);

                        System.out.println("Answer:" + answer);
                    }

                    // Summation of 1 to N
                    case 7 -> {
                        System.out.println("Enter the number N:");
                        while (!input.hasNextInt()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }
                        int N = input.nextInt();

                        if (N < 1) {
                            System.out.println("Error! Number N must be at least 1");
                        } else {
                            int sum = 0;
                            int i = 1;

                            while (i <= N) {
                                sum = sum + i;
                                i++;
                            }
                            System.out.println("Answer:" + sum);
                        }
                    }

                    // Prime or not?
                    case 8 -> {
                        System.out.println("Enter the number you want to check:");

                        while (!input.hasNextInt()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }
                        int n = input.nextInt();
                        boolean isPrime = n > 1;
                        int i = 2;

                        while (i * i <= n) {
                            if (n % i == 0) {
                                isPrime = false;
                            }
                            i++;
                        }
                        System.out.println(n + (isPrime ? " is prime" : " is not prime"));
                    }

                    // Greatest Common Divisor (GCD)
                    case 9 -> {
                        System.out.println("Enter the first integer:");

                        while (!input.hasNextInt()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }
                        int a = input.nextInt();

                        System.out.println("Enter the second integer:");
                        while (!input.hasNextInt()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }
                        int b = input.nextInt();

                        int A = Math.abs(a);
                        int B = Math.abs(b);
                        int gcd = 1;

                        if (A == 0 && B == 0) {
                            System.out.println("Both numbers cannot be zero.");
                        } else if (A == 0) {
                            gcd = B;
                        } else if (B == 0) {
                            gcd = A;
                        } else {
                            int i = 1;

                            while (i <= A && i <= B) {
                                if (A % i == 0 && B % i == 0) {
                                    gcd = i;
                                }
                                i++;
                            }
                        }
                        System.out.println("GCD:" + gcd);

                    }

                    // Absolute value of a number
                    case 10 -> {
                        System.out.println("Enter a number:");

                        while (!input.hasNextDouble()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        double number = input.nextDouble();

                        double abs = Math.abs(number);

                        System.out.println("Absolute Value: " + abs);
                    }

                    // Average of N numbers 
                    case 11 -> {
                        System.out.println("How many (N) numbers?");

                        while (!input.hasNextInt()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        int numb = input.nextInt();

                        if (numb <= 0) {
                            System.out.println("ERROR! The number must be greater than zero.");
                        } else {

                            double[] numbers = new double[numb];

                            double total = 0;

                            int i = 0;

                            while (numb > i) {
                                System.out.println("Enter the number: " + (i + 1) + ":");
                                numbers[i] = input.nextDouble();

                                total = total + numbers[i];

                                i++;
                            }

                            double ave = total / numb;

                            System.out.println("Average: " + ave);

                        }
                    }

                    // Max of N numbers
                    case 12 -> {
                        System.out.println("How many (N) numbers?");

                        while (!input.hasNextInt()) {
                            System.out.println("Invalid choice. Try again.");
                            input.next();
                        }

                        int N = input.nextInt();

                        if (N <= 0) {
                            System.out.println("Error! N must be greater than 0.");
                        } else {
                            double[] nvalues = new double[N];

                            int i = 0;

                            while (i < N) {
                                System.out.println("Enter the number: " + (i + 1) + ":");
                                nvalues[i] = input.nextDouble();
                                i++;
                            }

                            double max = nvalues[0];

                            i = 1;

                            while (i < N) {
                                if (nvalues[i] > max) {
                                    max = nvalues[i];
                                }
                                i++;
                            }
                            System.out.println("Maximum Number: " + max);
                        }

                    }

                    // Exit option:
                    case 0 -> {
                        System.out.println("Thank you for using the Math App.");
                        System.out.println("Wishing you a great day ahead!");
                    }

                    default -> {
                        System.out.println("Invalid choice. Try again.");
                    }
                }

            }
        } while (choice != 0);
        input.close();

    }

}
