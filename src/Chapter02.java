public class Chapter02 {
  public static void main(String[]args){
    int x,y,b;
    x = 3;
    y = 7;
    
    b = x;
    x = y;
    y = b;

    System.out.println( "x=" + x + ",y=" + y );
}
}

