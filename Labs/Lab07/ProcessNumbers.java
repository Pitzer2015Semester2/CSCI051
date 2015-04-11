// Collin Blinder
// cblinder@students.pitzer.edu
import java.util.*;
import java.io.*;
class ProcessNumbers{


  public static void main(String[] args)
    throws FileNotFoundException {
      String path = "numbers.txt";
      File file = new File(path);
      Scanner reader = new Scanner(file);

      int sumTotal = 0;
      int totalNumbers = 0;
      double evenNumbers = 0;
      while(reader.hasNextInt()){
        int nextInt = reader.nextInt();
        sumTotal = sumTotal + nextInt;
        totalNumbers++;
        if(nextInt%2==0){
          evenNumbers++;
        }
      }
      double percentEvens = (double)Math.round(evenNumbers/totalNumbers * 10000)/100;
      System.out.print(totalNumbers + " numbers, ");
      System.out.println("sum = " + sumTotal);
      System.out.println("percent evens: " + percentEvens );
  }
}
