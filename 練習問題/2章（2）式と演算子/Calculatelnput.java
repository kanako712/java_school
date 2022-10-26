import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
 *2章　4）
 * キーボードから2つの整数値を入力して、その和、差、積、商を計算し、計算結果を表示してください。	
    Class名：CalculateInput	
	String型をint型に変換するには、
	Integer.parseInt("文字列")というメソッドを使います。
	【例】
	文字を入力してください
	もしくは
	String strNum = "20";
	int  intNum = Integer.parseInt(strNum); 
 */

public class CalculateInput {
	public static void main(String[] args) {
		// InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		
		try {
			System.out.println("整数の値を入力してください");
            String value1 = new java.util.Scanner(System.in).nextLine();//キーボードから入力
			int intV1 = Integer.parselnt(value1);// 文字入力を受け付けて、変数inputStringに代入

            System.out.println("整数の値を入力してください");
            String value2 = new java.util.Scanner(System.in).nextLine();//キーボードから入力
			int intV2 = Integer.parselnt(value2);// 文字入力を受け付けて、変数inputStringに代入

			String strText = reader.readLine();//
                  
            // 入力された文字列を表示
            System.out.println("足し算"+ (intV1+intV2) + "です。");
            System.out.println("引き算"+ (intV1-intV2) + "です。");
            System.out.println("掛け算"+ (intV1*intV2) + "です。");
            System.out.println("割り算"+ (intV1+intV2) + "です。");

			System.out.println(strText);
			
		} catch(IOException e) {
			System.out.println(e);
		}
	}
}
