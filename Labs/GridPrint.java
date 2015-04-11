
import java.util.*;
public class GridPrint{
  public static void gridPrint(){
    Scanner prompter = new Scanner(System.in);
    System.out.println("Please type in the number of rows: ");
    int first = prompter.nextInt();
    System.out.println("Thank you!");
    System.out.println("Please type in the number of columns: ");
    int second = prompter.nextInt();
    for(int i=1; i<=first; i++){
      int temp = i;
      for(int j=0; j<second; j++){
        System.out.print(temp+" ");
        temp = temp+4;
      }
      System.out.println("");
    }
  }
  public static void main(String[] args){
    gridPrint();
  }

}
