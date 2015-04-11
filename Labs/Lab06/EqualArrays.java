// Collin Blinder
// cblinder@students.pitzer.edu
class EqualArrays{
  public static Boolean equals(int[] array1, int[] array2){
    Boolean result = true;
    if(array1.length==array2.length){
      for(int i=0; i<array1.length;i++){
        if(array1[i]!=array2[i]){
          result = result&&false;
        }else{
        }
      }
    }else{
      result = false;
    }
      return result;
    }
  public static void main(String[] args){
    int[] a1 = {10, 20, 30, 40, 50, 60};
    int[] a2 = {10, 20, 30, 40, 50, 60};
    int[] a3 = {20, 3, 50, 10, 68};
    System.out.println(equals(a1, a2));
    System.out.println(equals(a1, a3));
  }
}
