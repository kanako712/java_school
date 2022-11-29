/*
 * 1)文字列５個を一つずつ ArrayListクラスに格納し、	
	コマンドライン引数から入力された文字列と一致した要素を削除し、残り全ての要素を表示してください。	
	※文字列は重複しないものとする。
	【クラスファイル名：ArrayListTest】
 */

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args){
        //コマンドライン引数からの受け取り
        //String text1 = args[0];
        //String text2 = args[1];勝手にされるからいらない

        //ArrayListを準備
        List<String>names = new ArrayList<>();

        //5人を追加 文字列５個を一つずつ ArrayListクラスに格納
        names.add("ノブナガ");
        names.add("ヒデヨシ");
        names.add("イエヤス");
        names.add("ミツヒデ");
        names.add("ミツナリ");

   
        System.out.println("格納された5個の文字列を表示-----");
        for(String i : names){//繰り返しでnameの格納表示
        System.out.println(i);
        }

        //コマンドライン引数から入力された文字列と一致した
        for(String s : args){//コマンドライン引数の数字args配列に入ってくる
            if (names.contains(s) == true){//指定要素が含まれているか判定
                names.indexOf(s);//要素の何番目にあるか判定
                names.remove(s);//（）番目の要素を消去
            }

            /*//指定要素が含まれているか判定
             * if(name.contain(s)){
             * //要素の何番目にあるか判定
             * int index = name.indexOf(s);
             * //消去
             * list.remove(index);
             * }
             */

             /*//1行でもかける
              * name.remove(s);だけでもOK
              */
        }

        System.out.println("コマンドライン引数で入力された文字列を消去-------");
      
        System.out.println("消去後の文字列を表示");
        for(String i : names){//繰り返しで格納表示
        System.out.println(i);
        }
    }
}
