class Fizzbuzz {
  public static void FizzBuzz(int number){
    for(int i=0;i<=number;i++){
      if(number==0){
        System.out.println("nothing to report.");
      } else if(i%2==0){
          System.out.println("fizz");
      } else if (i%5==0) {
          System.out.println("buzz");
      } else if (i%2==0 && i%5==0){
          System.out.println("fizzbuzz");
      } else{
        System.out.println(i);
      };
    };
  };

  public static void main(String[] args) {
    FizzBuzz(5);
    // FizzBuzz(26);
    // FizzBuzz(0);
  }
}
