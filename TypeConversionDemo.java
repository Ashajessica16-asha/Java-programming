public class TypeConversionDemo {
 // Class used for class-to-class conversion
 static class Fahrenheit {
    double temp;
    Fahrenheit(double t) { temp = t; }
    double getTemp() { return temp; }
 }
 static class Celsius {
   double temp;
   // Converting constructor: Fahrenheit object -> Celsius object
   Celsius(Fahrenheit f) {
    temp = (f.getTemp() - 32) * 5 / 9;
   }
   void show() { System.out.println("Temperature = " + temp + " Celsius"); }
 }

 public static void main(String[] args) {
   System.out.println("----- Implicit/Widening Conversion (int to double) -----");
   int a = 10;
   double b = a; // implicit widening
   System.out.println("int " + a + " converted to double " + b);
   System.out.println("\n----- Explicit/Narrowing Conversion (double to int) -----");
   double f = 9.8;
   int x = (int) f; // explicit narrowing
   System.out.println("double " + f + " converted to int " + x);
   System.out.println("\n----- Autoboxing (int to Integer) -----");
   int num = 25;
   Integer boxedNum = num; // autoboxing
   System.out.println("Primitive int " + num + " autoboxed to Integer " + boxedNum);
   System.out.println("\n----- Unboxing (Integer to int) -----");
   Integer wrapObj = 40;
   int unboxed = wrapObj; // unboxing
   System.out.println("Integer " + wrapObj + " unboxed to primitive int " + unboxed);
   System.out.println("\n----- Primitive to String -----");
   double val = 25.5;
   String strVal = String.valueOf(val);
   System.out.println("double " + val + " converted to String \"" + strVal + "\"");
   System.out.println("\n----- String to Primitive -----");
   String numStr = "123";
   int parsedInt = Integer.parseInt(numStr);
   System.out.println("String \"" + numStr + "\" converted to int " + parsedInt);
   System.out.println("\n----- Class type to Class type -----");
   Fahrenheit fTemp = new Fahrenheit(98.6);
   Celsius cTemp = new Celsius(fTemp); // Fahrenheit -> Celsius
   cTemp.show();
 }
}
