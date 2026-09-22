public class ExceptionDemo {
 static double divide(double num, double deno) {
    if (deno == 0)
       throw new ArithmeticException("Division by zero is not allowed!");
    return num / deno;
 }
 static int checkAge(int age) {
    if (age < 0)
       throw new IllegalArgumentException("Age cannot be negative!");
    return age;
 }
 public static void main(String[] args) {
   // Case 1: Division by zero (ArithmeticException)
   try {
      System.out.println("Result of 10 / 2 = " + divide(10, 2));
      System.out.println("Result of 10 / 0 = " + divide(10, 0));
   } catch (ArithmeticException e) {
     System.out.println("Exception caught: " + e.getMessage());
   } finally {

     System.out.println("Division block execution completed.");
   }
   // Case 2: Invalid argument (IllegalArgumentException)
   try {
      System.out.println("\nAge entered: " + checkAge(-5));
   } catch (IllegalArgumentException e) {
      System.out.println("Exception caught: " + e.getMessage());
   }
   // Case 3: Array index out of bounds, caught generically
   try {
     int[] arr = {1, 2, 3};
     int index = 5;
     System.out.println("\nValue: " + arr[index]);
   } catch (ArrayIndexOutOfBoundsException e) {
     System.out.println("\nException caught: Array index out of bounds - " + 
e.getMessage());
   } catch (Exception e) {
     System.out.println("\nAn unknown exception occurred: " + e);
   }
   System.out.println("\nProgram continues normally after exception handling.");
 }
}
