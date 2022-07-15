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
  /* 
  int a[] = new int[20];

    System.out.print("偶数:");
      for (int i = 0; i < a.length; i++){
          a[i] = i * 5;
            if(a[i] % 2 == 0){
              System.out.print(a[i]);
                if( i < 18){
                System.out.print(",");
                }
            }
      }

      System.out.println("");

      System.out.print("奇数:");
        for (int i = 0; i < a.length; i++){
          a[i] = i * 5;
            if(a[i] % 2 != 0){
              System.out.print(a[i]);
                if( i < 19){
                System.out.print(",");
                }
            }
        }*/

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

//巨人、阪神戦で毎回の得点を入力する。（１回～９回）
//入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
  /*int han = 0;
  int kyo = 0;

    for (int i = 1; i <= 9; i++){
      int a = (int)(Math.random() * 5 + 1);
      int b = (int)(Math.random() * 5 + 1);
        han  += a;
        kyo  += b;
        System.out.println(i + "回表、 阪神の得点は" + a + "点");
        System.out.println(i + "回裏、 巨人の得点は" + b + "点");
      }
      System.out.print("阪神：" + han + " ");
      System.out.print("巨人：" + kyo);

      System.out.println("");

      if (han > kyo){
        System.out.println("阪神の勝ち");
      } else  if (kyo > han){
        System.out.println("巨人の勝ち");
      } else {
        System.out.println("引き分け");
      }*/

//自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
    /*int[] intArray = {24, 2, 0, 34, 12, 110, 2};
    int maxNum = intArray[0];

      for (int j : intArray) {
          if (j > maxNum)
              maxNum = j;
      }
      System.out.println("Maximum number = " + maxNum);*/

  /*int maxNum = 0;

    for(int i = 1; i <= 10; i++){
      if (i > maxNum){
      maxNum = i;
      }
    }
    System.out.println(maxNum);*/

//整数を 10 回入力し、最小値を求めるプログラムを作成しなさい。

  /*int maxNum = 10;
    for(int i = 10; i >= 1; i--){
      if (i < maxNum){
      maxNum = i;
      }
    }
    System.out.println(maxNum);*/

  /*int[] a = {20,40,18,6,25,10};
  int minMax = a[0];
    
    for (int b : a){
      if (b < minMax){
        minMax = b;
      }
    }
    System.out.println(minMax);*/

//個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラム

    /*int count = 10;

    for (int i = 1; i <= count; i++){
      System.out.print(i+"*"+"個");
      System.out.print(" ");
    }*/

//個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。
//数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。

    /*int count = 14;

    for(int i = 0; i < count; i++) {
      System.out.print(i % 10);
    }*/

//ストライク・カウントを数えるプログラムを作成しなさい。
//１球ごとにストライクかボールかを入力する。
//３ストライクまたは４ボールになったら入力を止め、
//ストライクとボールのカウントを表示する。

//ファウルの何れかを入力する。

    /*int sut = 0;
    int bol = 0;

    while (sut < 3 && bol < 4){
      System.out.println("ピッチャー1球投げました");
      int a = (int)(Math.random() * 3 + 1);
      if(a == 1){
      System.out.println("ストライク");
      } else if(a == 2){
      System.out.println("ボール");
      } else {
      System.out.println("ファール");
      }

      if(a == 1){
        sut ++;
      } else if(a == 2){
        bol ++;
      } else if(a == 3 && sut < 2){
        sut ++;
      }
      System.out.println(bol + "ボール," + sut + "ストライク" );
      System.out.println("");
    }*/

//入力された数が素数かどうかを判定するプログラムを作成しなさい。
    /*int count = 4;
    int so    = 0;

    for(int i = 2; i <= count; i ++){
      if (count % i == 0 ){
        so = so + 1;
      }
      //System.out.println(so);
    }

      if(so == 1){
        System.out.println(count + "は素数です");
      } else {
        System.out.println(count + "は素数ではありません");
      }*/

//九九表（一の段～九の段）を表示するプログラムを作成しなさい。
      
      /*for(int i = 1; i <= 9; i++) {
        for(int j = 1; j <= 9; j++){
          System.out.print(i * j + " ");
        }
        System.out.println();
      }*/

//数値を繰り返して入力し、0 が入力されたら入力を止め、
//それまでの合計を表示するプログラムを作成しなさい。

    /*int count = 10;
    int sum = 0;

      for(int i = 0; i < count; i++){
        int a = (int)(Math.random() * 10 + 0);
        System.out.println(a);
        sum += a;
        if(a == 0)
          break;
      }
      System.out.println("合計は" + sum);*/



  }
}