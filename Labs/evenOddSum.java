// Collin Blinder
// cblinder@students.pitzer.edu
import java.util.*;
class evenOddSum{

  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("How many integers?");
    int integers = input.nextInt();
    int even_sum = 0;
    int odd_sum = 0;
    for(int i=0; i<integers; i++){
      System.out.println("Enter an integer: ");
      int integer = input.nextInt();
      if(integer%2 == 0){
        even_sum = even_sum + integer;
      } else{
          odd_sum = odd_sum + integer;
      }
    }
    System.out.println("Even sum: " + even_sum);
    System.out.println("Odd sum: " + odd_sum);
  }
}
