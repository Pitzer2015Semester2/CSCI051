import java.util.*;
import java.io.*; 
public class FilePractice{
   public static void main(String[] args)
     throws FileNotFoundException {
   Scanner f = new Scanner(new File("Practice.txt"));   
  //  Scanner input = new Scanner(new File("Practice.txt"));
//    System.out.println("exists? "+ input.exists());
//    System.out.println("can read? "+ input.canRead());
//    System.out.println("length? " + input.length());
//    System.out.println("Absolute path? "+ input.getAbsolutePath());
   String read_string = f.nextString(); //=> string from file(f) 
   Double read_number = f.nextDouble(); //=> double from file(f) 
   System.out.print(g);
  }
}