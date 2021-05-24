import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("This is my cannonball code! Please input an angle and an initial velocity, and i'll do the maths!");

    System.out.println("Whats the Angle? Radians please");
    double angle = in.nextDouble();
    System.out.println("Whats the velocity?");
    double initial = in.nextDouble();
    System.out.println("how often do you want points?");
    double tiem = in.nextDouble();



    Cannonball shithead = new Cannonball(5);
    //shithead.shoot(initial, angle, tiem);

    System.out.println(shithead.shoot(initial, angle, tiem));
  }
}