import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
 * 3章　switch文　1）
 * 【class EvenOrOddS】　★
    入力した値が偶数か奇数かを判定するプログラムを作成せよ
 */

public class EvenOrOddS {
	public static void main(String[] args) {
		// InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		//3章1）switch文　入力した値が偶数か奇数かを判定するプログラムを作成せよ
		try {
			System.out.println("整数の値を入力してください");
			String StrText = reader.readLine();//キーボードから入力
            
            int num = Integer.parseInt(StrText);//数字に変換
            
            switch(num % 2){//余り0偶数
                case 0://余り0
                    System.out.println("偶数です");
                    break;
                case 1://余り1
                    System.out.println("奇数です"); 
                    break;
            }
            
			
		} catch(IOException e) {
			System.out.println(e);

		} catch(NumberFormatException e) {
            System.out.println(e);
        }
	}
}
