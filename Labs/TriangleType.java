// Collin Blinder
// cblinder@students.pitzer.edu
import java.util.*;
class TriangleType{
  public static String getTriangleType(int a,int b,int c){
    Boolean isoceles = a==b || a==c || b==c;
    Boolean equilateral = a==b && a==c && b==c;
    if(isoceles && !equilateral){
      return "isoceles";
    } else if(equilateral){
        return "equilateral";
    } else{
        return "scalene";
    }
  }
  public static void main(String[] args){
    Scanner value = new Scanner(System.in);
    System.out.println("Please enter the first side length: ");
    int a = value.nextInt();
    System.out.println("Please enter the second side length: ");
    int b = value.nextInt();
    System.out.println("Please enter the third side length: ");
    int c = value.nextInt();
    System.out.println(getTriangleType(a,b,c));
  }
}
