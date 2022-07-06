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

  //1〜10までの整数をカンマ区切りで横並びで表示させる
  //(10にはカンマをつけない)
  /*int []a = {1,2,3,4,5,6,7,8,9,10};
    for(int i = 0; i < a.length; i++){
      System.out.print(a[i]);
      if(i < a.length - 1){
      System.out.print(",");
      }
    }*/

  //1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
  /*int count = 0;
  int sum = 0;
    for(int i = 1; i <=10; i++) {
      if (i % 2 == 0) {
        count++;
        sum += i;
      }
    }
      System.out.println(count);
      System.out.println(sum);*/

  //整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラム
   /*int win = 0;
   int lose = 0;

   for (int i = 0; i < 10; i++){
    int a = (int)(Math.random()*2+0);
      if (a == 1){
        win += 1;
      } else {
        lose += 1;
      }
    }
    System.out.println("勝ちは"+win+"回");
    System.out.println("負けは"+lose+"回");*/

  //要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。[0]~[10]の値の
  //奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる
    
  //お金の数を数えるプログラム
    /*int X_10000 = 5;
    int X_5000  = 3;
    int X_1000  = 4;
    int X_500   = 2;
    int X_100   = 1;
    int X_50    = 7;
    int X_10    = 8;
    int X_1     = 9;

    int ans = X_10000*10000+
              X_5000 *5000+
              X_1000 *1000+
              X_500  *500+
              X_100  *100+
              X_50   *50+
              X_10   *10+
              X_1    *1;
    System.out.println(ans);*/


   }
 }