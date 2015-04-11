// Collin Blinder
// cblinder@students.pitzer.edu
class Division{

  public static void division(int a, int b){
    int dividend = a/b;
    int remainder = (a%(dividend*b));
    System.out.println(a+" divided by "+b+" is "+dividend+" with a remainder of "+remainder+".");
  }

  public static void main(String[] args) {
    division(23, 6);
  }
}
