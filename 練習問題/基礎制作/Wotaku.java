/**
 * ヲタク診断クラス
 * @author 都築　璃麗
 * @version 2022/12/06
 */

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Wotaku {
    String oshi;
    int year;
    public static void Kazari(){
        System.out.println();
        System.out.println();
        System.out.println("・。｡・ﾟ・。｡・ﾟ・。｡・ﾟ・｡・ﾟ・。｡・ﾟ・。｡・ﾟ・。｡・ﾟ・。｡・ﾟ・。｡・ﾟ");
        System.out.println();
        System.out.println();
    }
    // InputStreamReaderとBufferedReaderを用意する
	InputStreamReader iSR = new InputStreamReader(System.in);
	BufferedReader reader = new BufferedReader(iSR);
    
    
    /**
     * 推しの名前を入力するメソッド
     * @param oshiName
     */
    public static void oshiName(){
        try {
            while(true){//falseの場合はループ設定
            System.out.println("まず始めにあなたの推しについて教えてください！");
            Name.Enter();
            System.out.println();
            System.out.println("あなたの推しの名前を入力してください!!");
            Name.Enter();
            System.out.println();
            String oshi = new java.util.Scanner(System.in).nextLine();//キーボードから入力
            //this.oshiName = oshi;
            
            if(oshi.length() >= 1){ // 入力された文字列が1文字以上なら表示
                Kazari();
                System.out.println(/*name +*/"推しは【"+ oshi + "】ですね！");
                Kazari();
                Name.Enter();
                oshiYear();   
                break;
            }else if(oshi.isEmpty()){ //入力された文字が0文字の場合
                System.out.println("推しの入力がありません");
            }else{ //それ以外の入力の場合
                System.out.println("もう一度入力してください");
            }	
            }   
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    /**
     * 推し歴を入力するメソッド
     * @param oshiYear
     */
    public static void oshiYear(){
        try {
            while(true){//falseの場合はループ設定
            System.out.println(); 
            System.out.println("推してる年数を入力してください(数字)");
            System.out.println();
            Name.Enter();
            System.out.println("《 例 》　”3年”なら【 3 】を入力"); 
            System.out.println();
            Name.Enter();
            System.out.println("※1年未満の場合は【 0 】と入力してください");
            System.out.println();
            int year = new java.util.Scanner(System.in).nextInt();//キーボードから入力
            
            if(year == 0){//1年未満の場合の出力
                Kazari();
                System.out.println("あなたは"+ /*oshiName +*/"と出会って1年未満ですね");
                Kazari();
                break;
            }else if(year >= 1){ // 1年以上の場合の出力
                Kazari();
                System.out.println(/*name +*/"さんの推し歴は【"+ year + "年】ですね！");
                Kazari();
                break;
            }else{ //それ以外の入力の場合
                System.out.println("もう一度入力してください");
            }	
            }   
        } catch(Exception e) {
            System.out.println(e);
        }
        Name.Enter();
        System.out.println();
        System.out.println("///////////////////////////////");
        System.out.println();
        System.out.println("それでは診断を始めます。");
        System.out.println();
        System.out.println("///////////////////////////////");
        System.out.println();
        Name.Enter();
        System.out.println("質問に対して” Y E S ”なら【 1 】を入力");
        Name.Enter();
        System.out.println("質問に対して” N O ”なら【 2 】を入力");
        System.out.println();
        System.out.println();
        Name.Enter();
        WotakuQuestion.wotakuQ1();

    } 

    
}
