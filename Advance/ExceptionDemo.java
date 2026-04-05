/*
Concept: Exception Handling (try-catch-finally)
*/

class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;   // will cause exception
            System.out.println(result);
        } 
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } 
        finally {
            System.out.println("Execution completed");
        }
    }
}
