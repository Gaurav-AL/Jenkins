import java.io.*;
import java.util.Scanner;

public class AddNumbers{
  public static void main(String... args){
    Scanner read = new Scanner(System.in);
    System.out.println("Sum of two numbers is : "+ (Integer.parseInt(args[0])+ Integer.parseInt(args[1])));
  }
}
