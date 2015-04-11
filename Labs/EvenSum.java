// Collin Blinder
// cblinder@students.pitzer.edu
class EvenSum{

  public static int evenSum(int number){
    int counter = 0;
    for(int i=0; i<=number; i++){
      if(i%2==0){
        counter = counter+i;
      }
    }
    return counter;
  }
  public static void main(String[] args) {
    System.out.println(evenSum(100));
  }
}
