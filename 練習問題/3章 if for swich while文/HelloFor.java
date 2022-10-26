import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

/*
 * 3章　for文　3）
 * 【class HelloFor】★★
キーボードで数字を１回入力すると、その数字の回数分「Hello!」を
出力するプログラムを作成せよ。（受け付ける数字は１以上20以下）
 */


public class HelloFor {
	public static void main(String[] args) {
		// InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		
		try {
			System.out.println("整数の値を入力してください");
			String StrText = reader.readLine();//キーボードから入力
            
            int intNum = Integer.parseInt(StrText);//数字に変換
            
            for(int i = intNum ; i < 20 ;){
            System.out.println("Hello!"); 
            break;      
            }
            			
		} catch(IOException e) {
			System.out.println(e);

		} catch(NumberFormatException e) {
            System.out.println(e);
        }
	}
}