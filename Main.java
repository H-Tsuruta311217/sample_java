// public class Main {
//   public static void main(String[] args) {
//     String word1 = "こんにちは。";
//     String word2 = "私はjavaです。";
//     String word3 = word1 + word2;
//     System.out.println(word3);
//   }
// }

// public class Main {
//   public static void main(String[] args){
//     String word = "こんにちは。私はjavaです。";
//     word = word.replace("java", "いろは");
//     System.out.println(word);
//   }
// }

// public class Main {
//   public static void main(String[] args){
//     int a = 10;
//     int b = 20;
//     String question = a + "x" + b + "=?";
//     System.out.println(question);
//   }
// }


// import java.util.Random;
// public class Main {
//   public static void main(String[] args) {
//     Random rnd = new Random(); //    ランダムな数を出す部品
//     System.out.println(rnd.nextInt(10)); //    0~9のランダムな数を表示
//   }
// }



// import java.util.Random;
// public class Main {
//   public static void main(String[] args) {
//     Random rnd = new Random(); //    ランダムな数を出す部品
//     int a = rnd.nextInt(100); //      0~99のランダムな数値を出す
//     int b = rnd.nextInt(100); //      0~99のランダムな数値を出す
//     String question = a + "x" + b "=?"; //    つなげて変数questionに入れる
//     System.out.println(question); //    変数questionの文字列を表示
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     double doubleA = 1234.5678; //   double型の変数doubleAに値を入れる
//     int  intA = 12345; //    int型の変数intAに値を入れる
//     doubleA = intA;
//     System.out.println(doubleA);
//   }
// }



// public class Main {
//   public static void main(String[] args) {
//     double doubleA = 1234.5678; //   double型の変数doubleAに値を入れる
//     int  intA = 12345; //    int型の変数intAに値を入れる
//     intA = (int)doubleA; //    doubleAの値をキャスト変換してintAに入れる
//     System.out.println(intA);
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     String [] lunch = {"スペシャルハンバーガー", "４種のチーズピッツァ", "ローストチキンサンド", "生ハムサンド"}; //    ４つの要素（文字列）を収めた配列
//     System.out.println(lunch[2]); //    2番の要素を取り出して表示
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     int score = 90;   //変数scoreの90を入れる
//     if (score >= 80) {
//         System.out.println("やったね！次もこの調子だ");
//     }
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     int score = 60;   //変数scoreの60を入れる
//     if (score >= 80) {
//         System.out.println("やったね！次もこの調子だ");
//     } else {
//         System.out.println("残念でした");
//     }
//   }
// }


// import java.util.Random;
// public class Main {
//   public static void main(String[] args) {
//     Random rnd = new Random();     //ランダムな数を出す部品
//     int score = rnd.nextInt(100);   // 100までのランダムな数
//     if (score >= 90) {    // 90以上なら当たり
//         System.out.println("当たり！");
//     } else {
//         System.out.println("ハズレ");
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     for(int i = 0; i <= 9; i++) {   //変数iは０から９までを足していく
//       System.out.println("5 X " + i + " = " + (5 * i));   //変数iを含めた掛け算の式。5X0〜5X9の１０個の掛け算をする
//     }
//   }
// }

// import java.util.Random;
// public class Main {
//   public static void main(String[] args) {
//     Random rnd = new Random();     //ランダムな数を出す部品
//     int answer = rnd.nextInt(10);   //かける数
//     String question ="";
//     for(int i = 0; i <= 9; i++) {
//       //問題文変数に[answer*i]を足していきます
//       question = question + "[" + (answer * i) + "]";
//     }
//     System.out.println("何の段の九九でしょう？");
//     System.out.println(question);
//     System.out.println("答え：" +answer);
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     int [] scorelist= {64, 100, 78, 80, 72};  //配列
//     for(int i:scorelist) {   //配列の全ての要素について表示することを繰り返す
//       System.out.println(i);
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     int [] scorelist= {64, 100, 78, 80, 72};  //配列
//     int total = 0;    //0にリセット
//     for(int i:scorelist) {   //配列の全ての要素について表示することを繰り返す
//       total += i;
//     }
//     System.out.println(total);    //変数totalの値を表示
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     for(int i = 0; i <= 9; i++) {
//       for(int j = 0; j <= 9; j++) {
//         System.out.println(i+"x"+j+"="+(i*j));
//       }
//     }
//   }
// }

// public class Main {
//   public static void main(String[] args) {
//     sayhello();
//     sayhello();
//     sayhello();   //あいさつを表示するメソッドの呼び出し
//   }
//   static void sayhello(){
//     System.out.println("こんにちは");
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     sayhello2("いろは");   //あいさつを表示するメソッドの呼び出し
//     sayhello2("オオカミ先生");
//   }
//   static void sayhello2(String name){   //作成した名前付きであいさつを表示するメソッド
//     System.out.println("こんにちは、" + name + "さん。");
//   }
// }

// import java.util.Random;
// public class Main {
//   public static void main(String[] args) {
//     int d = dice();    //メソッドを呼び出してサイコロの目を変数に入れる
//     System.out.println("サイコロは、"+d);   //結果を表示
//   }
//   static int dice() {
//     Random rnd = new Random();
//     int ans = rnd.nextInt(6) + 1;
//     return ans;    //作成したサイコロの目を返すメソッド
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     double ans = postTaxPrice(980);     //金額を渡して消費税計算の結果を変数に入れる
//     System.out.println(ans + "円");    //結果を表示
//   }
//   static double postTaxPrice(int price) {
//     double ans = price * 1.08;
//     return ans;    //渡された金額で消費税を計算して返すメソッド
//   }
// }


import java.util.Random;
public class Main {
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      makeQuestion();     //計算問題を表示するメソッドを繰り返し呼び出す
    }
  }
  static void makeQuestion() {
    Random rnd = new Random();
    int a = rnd.nextInt(100);
    int b = rnd.nextInt(100);
    String question = a + "x" + b + "=?";
    System.out.println(question);    //計算問題を表示するメソッド
  }
}

