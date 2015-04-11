// Collin Blinder
// cblinder@students.pitzer.edu
import java.util.*;
class Distance2Points{
  public static double distance(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter your first x value(x1): ");
    double x1= input.nextDouble();
    System.out.println("Please enter your first y value(y1): ");
    double y1= input.nextDouble();
    System.out.println("Please enter your second x value(x2): ");
    double x2= input.nextDouble();
    System.out.println("Please enter your second y value(y2): ");
    double y2= input.nextDouble();
    double distance = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    return distance;
  }
  public static void main(String[] args){
    System.out.println(distance());
  }
}
