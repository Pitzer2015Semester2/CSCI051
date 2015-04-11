// Collin Blinder
// cblinder@students.pitzer.edu
class EvenDigit{
   public static Boolean isAllEvenDigit(int number){
    Boolean bool = true;
    for(int i=0; number>0; i++){
      int tester = number%10;
      if(tester%2!=0 && number!=0){
        bool = false;
      }
      number = number/10;
    }
    return bool;
  }
  public static void main(String[] args){
    System.out.println(isAllEvenDigit(2));
    System.out.println(isAllEvenDigit(248));
    System.out.println(isAllEvenDigit(23246));
    System.out.println(isAllEvenDigit(33333));
  }
}
