//code written by Tyler Roache, 11/2/2020, 
import java.util.Scanner;
class RopeTension {
  public static void main(String[] args) {
    System.out.println("This code does some sick maths, and given a rope with a maximum tension of 60N, an object of mass 2kg, and a rope of length 3m, and checks whether the rope will break for any velocity.");
    double m = 2; //kg
    double r = 3; //meters
    Scanner sus = new Scanner(System.in);
    System.out.println("Enter velocity of the swingert");
    double v = sus.nextDouble();


    double T = m * (v * v) / r; //t = mv^ / r
    if(T  >= 60) {
      System.out.println("broke");
    } else {
      System.out.println("fien");
    }
  }
}