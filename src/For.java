public class For {
  public static void main(String[]args){
    //for( int n = 1, x = 2 ; n <= 8 ; n++, x *= 2 )
    //System.out.println( "2の" + n + "乗=" + x );
    
    /*int x =1;
    for(int n =2; n <= 7;n++)
    x *= n;
    System.out.println(x);*/

  //SPAMを10回表示する
    /*for (int i = 1; i<=10; i++){
      System.out.println("SPAM");
    }*/
    
  //九九、三の段（ 3 ～ 27 の 3 の倍数）を表示する
    /*for (int i =1;i<=9;i++){
      System.out.println(i*3);
    }*/

  //2 の 1 乗から 8 乗までを計算し表示する
    /*int x = 1;
    for (int i = 1; i <=8; i++){
      x *= 2;
      System.out.println("2の"+i+"乗は"+x);
    }*/

    /*for (int i =1, x=2; i<=8; i++, x*=2)
      System.out.println("2の"+i+"乗は"+x);*/

  //7 の階乗を計算し、表示するプログラム
    /*int x = 1;
    for (int i = 2; i <=7; i++){
      x *= i;
    }
    System.out.println(x);*/

  //整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
  //要らないint i = (int)(Math.random()*10 +1);
    /*int sum = 0;
    for (int i = 1; i <=10; i++){
    sum += i;
    }
    System.out.println(sum/10);*/
 }
}