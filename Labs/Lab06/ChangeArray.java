// Collin Blinder
// cblinder@students.pitzer.edu
import java.util.Arrays;
class ChangeArray{
  public static int[] changeOddNumbers(int[] array){
    for(int i=0; i<array.length;i++){
      if(array[i]%2!=0){
        array[i] = array[i]*2;
      }else{
      }
    }
    return array;
  }
  public static void main(String[] args){
  int[] arr = {3, 18, 5, 18, 100, 1, 201};
  changeOddNumbers(arr);
  System.out.println(Arrays.toString(arr));
  }
}
