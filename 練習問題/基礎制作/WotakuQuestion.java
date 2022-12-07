/**
 * ヲタク診断　質問クラス
 * @author 都築　璃麗
 * @version 2022/12/06
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class WotakuQuestion {
    /**
     * 飾り上メソッド
     * @param KazariUe
     */
    public static void KazariUe(){
        System.out.println();
        System.out.println();
        System.out.println("ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ");
        System.out.println();
    }
    /**
     * 飾り下メソッド
     * @param KazariShita
     */
    public static void KazariShita(){
        System.out.println();
        System.out.println("ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ*｡，｡*ﾟ");
        System.out.println();
        Name.Enter();
        System.out.println("Y E S → 【 1 】と 入力　💻 🖱   N O → 【 2 】と 入力");
        System.out.println();
    }
    /**
     * Yesメソッド
     * @param Yes
     */
    public static void Yes(){
        System.out.println();
        System.out.println("Y E S → 【 1 】を 選択 🙆‍♀️");
        System.out.println();
        Name.Enter();
        System.out.println("次の質問です！");
        System.out.println();
    }
    /**
     * Noメソッド
     * @param No
     */
    public static void No(){
        System.out.println();
        System.out.println("N O → 【 2 】を 選択 🙅‍♀️");
        System.out.println();
        Name.Enter();
        System.out.println("次の質問です！");
        System.out.println();
    }

    /**
     * 質問1メソッド
     * @param wotakuQ1
     */
    public static void wotakuQ1(){
        while(true){//falseの場合はループ設定
            try {
                KazariUe();
                System.out.println("   現場への参戦回数は年50回以上だ");
                KazariShita();
                int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ2();
                    break;
                    case 2 :
                    No();
                    wotakuQ6();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }   
    }
    /**
     * 質問2メソッド
     * @param wotakuQ2
     */
    public static void wotakuQ2(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  仕事や学校以外の時間はほとんどヲタ活をしている");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ3();
                    break;
                    case 2 :
                    No();
                    wotakuQ7();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    } 
    /**
     * 質問3メソッド
     * @param wotakuQ3
     */
    public static void wotakuQ3(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  遠征には割といく方だ");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ4();
                    break;
                    case 2 :
                    No();
                    wotakuQ8();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    } 
    /**
     * 質問4メソッド
     * @param wotakuQ4
     */
    public static void wotakuQ4(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  推しのツイートの通知を取っている");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ5();
                    break;
                    case 2 :
                    No();
                    wotakuQ10();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    } 
    /**
     * 質問5メソッド
     * @param wotakuQ5
     */
    public static void wotakuQ5(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  ヲタ活のために何か犠牲にしたことがある");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    WotakuAnswer.wotakuA1();
                    break;
                    case 2 :
                    No();
                    wotakuQ10();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問6メソッド
     * @param wotakuQ6
     */
    public static void wotakuQ6(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  ガチ恋のヲタクに負けたくない");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ7();
                    break;
                    case 2 :
                    No();
                    wotakuQ11();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問7メソッド
     * @param wotakuQ7
     */
    public static void wotakuQ7(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  SNSに仲間との写真や自撮りをよく載せている");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ8();
                    break;
                    case 2 :
                    No();
                    wotakuQ12();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問8メソッド
     * @param wotakuQ8
     */
    public static void wotakuQ8(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();    
            System.out.println("  SNSなので推しに自分の行動を報告する");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ9();
                    break;
                    case 2 :
                    No();
                    wotakuQ13();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問9メソッド
     * @param wotakuQ9
     */
    public static void wotakuQ9(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  推しメンにガチ恋している");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ10();
                    break;
                    case 2 :
                    No();
                    wotakuQ14();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問10メソッド
     * @param wotakuQ10
     */
    public static void wotakuQ10(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  私服はハーフパンツとキャップが多い");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    WotakuAnswer.wotakuA2();
                    break;
                    case 2 :
                    No();
                    wotakuQ15();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問11メソッド
     * @param wotakuQ11
     */
    public static void wotakuQ11(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  自分もアイドルになりたいと思っている");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ12();
                    break;
                    case 2 :
                    No();
                    wotakuQ16();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問12メソッド
     * @param wotakuQ12
     */
    public static void wotakuQ12(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  髪型はロングだ");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ13();
                    break;
                    case 2 :
                    No();
                    wotakuQ17();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問13メソッド
     * @param wotakuQ13
     */
    public static void wotakuQ13(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  男ヲタからモテる方だと思う");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ14();
                    break;
                    case 2 :
                    No();
                    wotakuQ18();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問14メソッド
     * @param wotakuQ14
     */
    public static void wotakuQ14(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  SNSに加工した自撮りをよく載せる");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ15();
                    break;
                    case 2 :
                    No();
                    wotakuQ19();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問15メソッド
     * @param wotakuQ15
     */
    public static void wotakuQ15(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  コスプレが好きだ");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    WotakuAnswer.wotakuA3();
                    break;
                    case 2 :
                    No();
                    wotakuQ20();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問16メソッド
     * @param wotakuQ16
     */
    public static void wotakuQ16(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  女ヲタより男ヲタの方の知り合いが圧倒的に多い");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ17();
                    break;
                    case 2 :
                    No();
                    wotakuQ21();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問17メソッド
     * @param wotakuQ17
     */
    public static void wotakuQ17(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  すぐ” ○ ○ ギャル”って言いたがる");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ18();
                    break;
                    case 2 :
                    No();
                    wotakuQ22();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問18メソッド
     * @param wotakuQ18
     */
    public static void wotakuQ18(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  男ヲタの情報に詳しい");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ19();
                    break;
                    case 2 :
                    No();
                    wotakuQ23();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問19メソッド
     * @param wotakuQ19
     */
    public static void wotakuQ19(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  よく大きめのTシャツをワンピースみたいにして着る");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ20();
                    break;
                    case 2 :
                    No();
                    wotakuQ24();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問20メソッド
     * @param wotakuQ20
     */
    public static void wotakuQ20(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  ぶっちゃけアイドルより男ヲタ目当てだ");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    WotakuAnswer.wotakuA4();
                    break;
                    case 2 :
                    No();
                    wotakuQ25();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問21メソッド
     * @param wotakuQ21
     */
    public static void wotakuQ21(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  現場にはとにかく楽しさを求める");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ22();
                    break;
                    case 2 :
                    No();
                    wotakuQ26();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問22メソッド
     * @param wotakuQ22
     */
    public static void wotakuQ22(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  ライブはみんなでワイワイするのが好き");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ23();
                    break;
                    case 2 :
                    No();
                    wotakuQ27();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問23メソッド
     * @param wotakuQ23
     */
    public static void wotakuQ23(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  けっこう派手好きだ");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ24();
                    break;
                    case 2 :
                    No();
                    wotakuQ28();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問24メソッド
     * @param wotakuQ24
     */
    public static void wotakuQ24(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  野外ライブが好き");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ25();
                    break;
                    case 2 :
                    No();
                    wotakuQ29();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問25メソッド
     * @param wotakuQ25
     */
    public static void wotakuQ25(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  とにかく酒好きだ");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    WotakuAnswer.wotakuA5();
                    break;
                    case 2 :
                    No();
                    wotakuQ30();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問26メソッド
     * @param wotakuQ26
     */
    public static void wotakuQ26(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  推しとの年齢差は8歳以上だ");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ27();
                    break;
                    case 2 :
                    No();
                    wotakuQ31();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問27メソッド
     * @param wotakuQ27
     */
    public static void wotakuQ27(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  推しのことはとことん甘やかしてしまう");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ28();
                    break;
                    case 2 :
                    No();
                    wotakuQ32();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問28メソッド
     * @param wotakuQ28
     */
    public static void wotakuQ28(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  推しに手紙を書くのが好きだ");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ29();
                    break;
                    case 2 :
                    No();
                    wotakuQ33();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問29メソッド
     * @param wotakuQ29
     */
    public static void wotakuQ29(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  ライブでは騒ぐより推しをじっくりみたい");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ30();
                    break;
                    case 2 :
                    No();
                    wotakuQ34();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問30メソッド
     * @param wotakuQ30
     */
    public static void wotakuQ30(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  これは恋ではない母性だ");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    WotakuAnswer.wotakuA6();
                    break;
                    case 2 :
                    No();
                    wotakuQ35();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問31メソッド
     * @param wotakuQ31
     */
    public static void wotakuQ31(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  SNSには絶対顔出しをしない");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ32();
                    break;
                    case 2 :
                    No();
                    wotakuQ27();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問32メソッド
     * @param wotakuQ32
     */
    public static void wotakuQ32(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  なるべくグッズはコンプリートしたい");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ33();
                    break;
                    case 2 :
                    No();
                    wotakuQ28();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問33メソッド
     * @param wotakuQ33
     */
    public static void wotakuQ33(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  ハロプロやスタダ系のアイドルが好き");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ34();
                    break;
                    case 2 :
                    No();
                    wotakuQ29();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問34メソッド
     * @param wotakuQ34
     */
    public static void wotakuQ34(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  周りにはヲタバレしてない");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    wotakuQ35();
                    break;
                    case 2 :
                    No();
                    wotakuQ30();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
    /**
     * 質問35メソッド
     * @param wotakuQ35
     */
    public static void wotakuQ35(){
        while(true){//falseの場合はループ設定
            try {
            KazariUe();
            System.out.println("  一人参戦が多い");
            KazariShita();
            int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
                switch(number){
                    case 1 :
                    Yes();
                    WotakuAnswer.wotakuA7();
                    break;
                    case 2 :
                    No();
                    WotakuAnswer.wotakuA6();
                    break;
                }
            } catch(Exception e) {
                System.out.println(e);
            }    
        }
    }
}
        