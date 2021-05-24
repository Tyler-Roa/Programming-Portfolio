import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    float fib1 = 1;
    float fib2 = 1;
    Scanner scanny = new Scanner(System.in);
    System.out.println("print the numbi");

    int georg = scanny.nextInt();
    float fibf;
    System.out.print("1 then 1 then ");
    for(int i = 0; i < georg; i ++) {
      fibf = fib1 + fib2;
      System.out.print(fibf + " then ");
      fib1 = fib2;
      fib2 = fibf;
    }
    System.out.println("done!");
  }
}
