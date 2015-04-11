class DrawShape{

  public static void drawStars(int j){
    for(int i=0; i<=j; i++){
      System.out.print("*");
    }
      System.out.print(" ");
    // for(int i=6; i>0; i--){
    //   System.out.print("*");
    // }
  }
  public static void drawFwdSlash(int j){
    for(int k=0;k<=j;k++){
      System.out.print("/");
    }
  }
  public static void drawBkwdSlash(int j){
    for(int i=j; i>=0; i--){
      System.out.print("\\");
    }
  }

  public static void main(String[] args) {
    for(int i=6; i>=0; i--){
      drawStars(i);
      for(int j=0; j<=5-i; j++){
        System.out.print(" ");
      }
      drawFwdSlash(i);
      for(int j=0; j<=5-i; j++){
        System.out.print("\\\\");
      }
      for(int j=0; j<=5-i; j++){
        System.out.print(" ");
      }
      drawStars(i);

      System.out.println("");
    // for(int k=i;k>=0;k--){
    //   System.out.print("\\");
    // }
    }
  }
}
