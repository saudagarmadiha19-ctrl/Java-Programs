/*
Mini Project: Calculator with User Input
*/

import java.util.Scanner;
class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }
    int multiply(int a, int b) {
        return a * b;
    }
    int divide(int a, int b) {
        if(b != 0)
            return a / b;
        else {
            System.out.println("Cannot divide by zero");
            return 0;
        }
    }
}
class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Choose operation: +  -  *  /");
        char op = sc.next().charAt(0);
        switch(op) {
            case '+':
                System.out.println("Result: " + calc.add(a, b));
                break;
            case '-':
                System.out.println("Result: " + calc.subtract(a, b));
                break;
            case '*':
                System.out.println("Result: " + calc.multiply(a, b));
                break;
            case '/':
                System.out.println("Result: " + calc.divide(a, b));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
}
