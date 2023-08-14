import java.io.*;
import java.util.Scanner;

public class AddNumbers{
  public static void main(String... agrs){
    Scanner read = new Scanner(System.in);
    int a , b ;
    System.out.println("Enter First Number");
    a = read.nextInt();
    System.out.println("Enter Second Number");
    b = read.nextInt();
    System.out.println("Sum of two numbers is : "+ (a+b));
  }
}
