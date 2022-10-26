import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
 * 3章　if文　1）
 * 入力した値（整数）が偶数か奇数かを判定するプログラムを作成せよ	
	チャレンジ）整数以外が入力された場合でも正しく動作するようにしてください。
 */


public class EvenOrOdd {
	public static void main(String[] args) {
		// InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		
		try {
			System.out.println("整数の値を入力してください");
			String StrText = reader.readLine();//キーボードから入力
            
            int num = Integer.parseInt(StrText);//数字に変換
            
            if (num % 2 == 0 ){//余りなし＝偶数
                System.out.println("偶数です");
            }else{
                System.out.println("奇数です");
            }
            
			
		} catch(IOException e) {
			System.out.println(e);

		} catch(NumberFormatException e) {
            System.out.println(e);
        }
	}
}
