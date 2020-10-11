class Main {
 
 public static void main(String[] args) {
   CalculatorApp app = new CalculatorApp ();
   int a = app.add(1,2);
   int b = app.subtract(4,3);
   double c = app.divide(6,5);
   double f = app.divide(6,6);
   double d = app.divide(6,5);
   int e = app.multiply(6,6);
   System.out.println("adding 1 and 2 gives: " + a);
   System.out.println("subtracting 4 and 3 gives: " + b);
   System.out.println("dividing 6 and 5 gives: " + c);
   System.out.println("dividing 6 and 5 gives: " + d);
   System.out.println("multiplying 6 and 6 gives: " + e);
   System.out.println("dividing 6 and 6 gives: " + f);
 }
 
}

