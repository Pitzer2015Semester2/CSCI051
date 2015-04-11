// Collin Blinder
// cblinder@students.pitzer.edu
class SixDays{
  public static void partridge(){
    System.out.println("a partridge in a pear tree.");
  }
  public static void turtle_doves(){
    System.out.println("two turtle doves, and");
  }
  public static void french_hens(){
    System.out.println("three French hens,");
  }
  public static void calling_birds(){
    System.out.println("four calling birds,");
  }
  public static void goldenRings(){
    System.out.println("five golden rings,");
  }
  public static void six_geese(){
    System.out.println("six geese a-laying,");
  }
  public static void refrain(){
    System.out.println("");
  }
  
  public static void verse1(){
    System.out.println("On the 1st day of 'Xmas', my true love sent to me");
    partridge();
    refrain();

  }
    public static void verse2(){
      System.out.println("On the 2nd day of 'Xmas', my true love sent to me");
      turtle_doves();
      partridge();
      refrain();
  }
    public static void verse3(){
      System.out.println("On the 3rd day of 'Xmas', my true love sent to me");
      french_hens();
      turtle_doves();
      partridge();
      refrain();
  }
    public static void verse4(){
      System.out.println("On the 4th day of 'Xmas', my true love sent to me");
      calling_birds();
      french_hens();
      turtle_doves();
      partridge();
      refrain();
  }
    public static void verse5(){
      System.out.println("On the 5th day of 'Xmas', my true love sent to me");
      goldenRings();
      calling_birds();
      french_hens();
      turtle_doves();
      partridge();
      refrain();
  }
    public static void verse6(){
      System.out.println("On the 6th day of 'Xmas', my true love sent to me");
      six_geese();
      goldenRings();
      calling_birds();
      french_hens();
      turtle_doves();
      partridge();
      refrain();
  }

  public static void main(String[] args) {
   verse1();
   verse2();
   verse3();
   verse4();
   verse5();
   verse6();
  }
}