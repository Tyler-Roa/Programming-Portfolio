import java.math.BigInteger;
import java.math.*; 

class BigInteger{
  public static void main(String[] args) {
    System.out.println("Hello world!");
    BigInteger a = new BigInteger("12345678987654321");
    BigInteger b = a.pow(4);
    BigInteger c = a.sqrt();
    BigInteger d = a.pow(8);
    System.out.println("4th power");
    System.out.println(b);
    System.out.println("squared");
    System.out.println(c);
    System.out.println("8th power");
    System.out.println(d);
  }
}