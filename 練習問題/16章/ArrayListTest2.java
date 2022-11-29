/*
 * 標準入力から、ArrayListに複数の文字列を入力できるようにし、	
　　入力終了後、格納された文字列の全件表示と、格納された個数を表示させてください。	
　【クラスファイル名：ArrayListTest2】
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest2 {
    public static void main(String[] args){
        // InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		

		try {
            //文字表示
            System.out.println("格納したい文字列を入力してください");
            System.out.println();//改行
            System.out.println("終了する場合にはendを入力してください");

            //ArrayListを準備
            List<String>mozi = new ArrayList<String>();
                    
            //endと入力されるまで入力受け付け
            while(true){//無限ループ
                //文字列入力の受付
                String text = reader.readLine();
                    //endと入力されたらループ抜ける
                    if(text.equals("end")){
                        System.out.println(mozi+"プログラム終了します");
                        break;
                    }
            //入力させた文字をリストに追加
            mozi.add(text);
            }          
            //格納後の文字列の表示
            System.out.println("格納された文字列を表示します-----");
                for(String i : mozi){
                System.out.println(i);
                }

            System.out.println();//改行

            //全ての要素の個数を表示してください。	
            System.out.println("以上、格納された文字列は"+mozi.size()+"個です");
            
        } catch(IOException e) {
			System.out.println(e);
		}
    }
}
