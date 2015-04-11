class Distance2Points{

  public static void distance(){
    int x1=1;
    int y1=0;
    int x2=4;
    int y2=4;

    int d = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
    System.out.println(d);

  }

  public static void main(String[] args){
    distance();
  }
}
