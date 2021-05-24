/*
Write a class DataSet that stores a number of values of type double. Provide a constructor

public DataSet(int maximumNumberOfValues)
and a method

public void add(double value)
that adds a value, provided there is still room.

Provide methods to compute the sum, average, maximum, and minimum value.

*/
import java.util.ArrayList;
import java.util.Scanner;

public class DataSet {

  ArrayList<Double> array;

  public DataSet() {

    array = new ArrayList<Double>();

  }

  public  void add(double value) {
    array.add(value);
  }
  public int sum() {
    int sum = 0;
    for(double element : array) {
      sum += element;
    }
    return sum;

  }
  public  double  average() {
    double sum = 0;
    for(double element : array) {
      sum += element;
    }
    double average = sum / array.size();
    return average;
  }

  public double max() {
    double max = -999999;
    for(int i = 0; i < array.size(); i ++) {
      if(max > array.get(i)) {
        max = array.get(i);
      }
    }
    System.out.println("glester");
    return max;

  }

  public double min() {
    System.out.println("glester1");
    double min = 999999;

    for(int i = 0; i < array.size(); i ++) {
      System.out.println("glester2");
      if(min < array.get(i)) {
        min = array.get(i);
        System.out.println("glester3");
      }
    }
    System.out.println("glester4");
    return min;
    

  }

}