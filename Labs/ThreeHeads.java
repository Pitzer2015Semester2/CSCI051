// Collin Blinder
// cblinder@students.pitzer.edu
import java.util.*;
class ThreeHeads{
  public static void threeHeads(){
    Random rnd = new Random();
    int heads = 0;
    int flips = 0;
    for(int i=0; heads<3; i++){
      int flip = rnd.nextInt();
      if(flip%2==0){
        flips++;
        heads++;
      }else{
        flips++;
      }
    }
    System.out.println("Congrats! You got 3 heads in "+flips+" flips!");
  }
  public static void main(String[] args){
    threeHeads();
  }
}
