import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
2章　3）
 * 光の速度を秒速30万kmとします。	
   このとき、光が1日に進む距離をJava言語を使って計算して表示してください。	
   Class名：LightDistance	
	※いろんなパターンがありますよ。
 */


public class LightDistance {
	public static void main(String[] args) {
		// InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		
		try {
            long speed =300000;//光の速さ秒速30万km
            long hour = 24;//1日24時間
            long minute = 60;//1時間60分
			long second = 60;//1分60秒

            System.out.println("光が1日に進む距離は");
			System.out.println(speed*hour*minute*second);
            System.out.println("kmです。");
            
            //テキストを表示

            
			// 文字入力を受け付けて、変数inputStringに代入
			String strText = reader.readLine();
									
			// 入力された文字列を表示
			
			System.out.println(strText);
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}