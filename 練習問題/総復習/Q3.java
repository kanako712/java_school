/*
人数を入力したら予約する会議室を表示するプログラムをif文を使用して作成してください。
会議室は以下の条件で予約します。
・4人以下なら「小会議室」
・5人以上10人以下なら「大会議室」
・それ以外なら「イベントホール」
 */

import java.util.*; 
public class Q3 {
    public static void main(String[] args){

        System.out.println("参加人数を入力してください");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num <= 4){
            System.out.println("予約する会議室：小会議室");
        }else if(5 <= num && num <= 10){
            System.out.println("予約する会議室：大会議室");
        }else{
            System.out.println("予約する会議室：イベントホール");
        }
        

    }

    
}
