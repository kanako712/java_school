
/**
 * 実行クラス
 * @author 都築　璃麗
 * @version 2022/12/06
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    // InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
        
    /**
     * 実行メソッド
     * @param args コマンドライン引数
     */ 
    public static void main(String[] args) {
        //Name n = new Name();
        nameGet();//【名前入力】メソッドの呼び出し
    }

    /**
     * 名前を入力するメソッド
     * @param nameGet
     */
    public static void nameGet(/*Name n*/){   
		try {
            while(true){//falseの場合はループ設定
            System.out.println();
			System.out.println("*.'---  名前を入力してください  ---'.*");
            String name = new java.util.Scanner(System.in).nextLine();//キーボードから入力
            //n.setName(name);
            if(name.length() >= 1){ // 入力された文字列が1文字以上なら表示
                System.out.println();
                int moziLength = name.length();//文字列の長さを数字に変換
                int kazariMozi = moziLength + 25;//文字の長さに25を足しkazariMoziへ代入
                for(int i = 0 ; i < kazariMozi ; i++){//□をkazariMozi分表示
                    System.out.print("❐");
                }
                System.out.println();
                System.out.println();
                System.out.println("【"+ name + "】さんようこそ！！");
                System.out.println();
                for(int i = 0; i < kazariMozi ; i++){//□をkazariMozi分表示
                    System.out.print("❐");
                }
                System.out.println();
                System.out.println();
                System.out.println();
                //n.setName(name);
                Name.Enter();
                break;
            }else if(name.isEmpty()){ //入力された文字が0文字の場合
                System.out.println("文字の入力がありません");
            }else{ //それ以外の入力の場合
                System.out.println("もう一度入力してください");
            }	
            }   
		} catch(Exception e) {
			System.out.println(e);
		}
        menu();//【メニュー】メソッドの呼び出し

    }

    /**
     * メニューメソッド
     * @param nameGet
     */
    public static void menu(){
        System.out.println();
        System.out.println("~ メニューから好きな項目を選んでください ~");
        Name.Enter();
        System.out.println();
        System.out.println("∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴∴'∴'∴'∴'∴'∴'∴");
        System.out.println();
        System.out.println(" 1 . 👚パーソナルカラー診断👗");
        System.out.println(" 2 . 🫶ヲタク診断🫰");
        System.out.println(" 3 . 🐈動物守り神診断🧸");
        System.out.println();
        System.out.println("∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴'∴∴'∴'∴'∴'∴'∴'∴");
        Name.Enter();
        System.out.println();
        System.out.println("項目の数字を入力してください✏️");
        System.out.println();
        Name.Enter();
        System.out.println("《 例 》パーソナルカラー診断なら【 1 】を入力");
        Name.Enter();
        System.out.println("《 例 》        ヲタク診断なら 【 2 】を入力");
        Name.Enter();
        System.out.println("《 例 》      動物守り神診断なら【 3 】を入力");
        System.out.println();
        int number = new java.util.Scanner(System.in).nextInt();//キーボードから入力
        
        switch(number){
            case 1:
            //
            break;
            case 2:
            System.out.println();
            System.out.println("✳︎ --- ✳︎ --- ✳︎ --- ✳︎ --- ✳︎ --- ✳︎ --- ✳︎ --- ✳︎");
            System.out.println();
            System.out.println("   2. ヲタク診断を始めます");
            System.out.println();
            System.out.println("✳︎ --- ✳︎ --- ✳︎ --- ✳︎ --- ✳︎ --- ✳︎ --- ✳︎ --- ✳︎");
            System.out.println();
            Name.Enter();
            Wotaku.oshiName();
            break;
            case 3:
            //
            break;

        }

    }

    

}


    
    

