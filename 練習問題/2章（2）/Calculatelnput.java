import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

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
