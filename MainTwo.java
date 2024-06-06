import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    double a,b,c = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to My Quadratic Formula Solver");
    System.out.println("Please enter a,b, and c where ax^2 + bx + c = 0");
    System.out.print("a=");
    a = input.nextDouble();
    System.out.print("b=");
    b = input.nextDouble();
    System.out.print("c=");
    c = input.nextDouble();

    System.out.println("");
    
    //Step 1
    System.out.println("x = " + b*-1 + " +/- sqrt(" + b + "^2 -4*" + a + "*" + c + ")");
    System.out.println("     ___________________________________________________________");
    System.out.println("     2*" + a);
    
    System.out.println("\n");
    
    //Step 2
    System.out.println("x = " + b*-1 + " +/- sqrt(" + Math.pow(b, 2) + " + " + -4*a*c + ")");
    System.out.println("     ___________________________________________________________");
    System.out.println("              " + 2*a);
    
    System.out.println("\n");
    
    //Step 3
    System.out.println("x = " + b*-1 + " +/- sqrt(" + (Math.pow(b, 2) + -4*a*c) + ")");
    System.out.println("     ___________________________________________________________");
    System.out.println("              " + 2*a);
    
    System.out.println("\n");
    
    //Step 4
    System.out.println("x = " + b*-1 + " +/- " + Math.sqrt(Math.pow(b, 2) + -4*a*c));
    System.out.println("     ___________________________________________________________");
    System.out.println("              " + 2*a);
    
    System.out.println("\n");
    
    //Step 5
    System.out.println("x=(" + (b*-1 + Math.sqrt(Math.pow(b, 2) + -4*a*c))/(2*a) + "," + (b*-1 - Math.sqrt(Math.pow(b, 2) + -4*a*c))/(2*a) + ")");

  }
}