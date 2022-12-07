/*ユークリッドの互除法を用いて入力された2つの数字の最大公約数を求めるプログラムを作成してください。
  ユークリッドの互除法を知らない方は各自調べてみてください。
*/
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Q17 {
    public static void main(String[] args){
        // InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		
		try {
			System.out.println("整数の値を入力してください");
            String value1 = new java.util.Scanner(System.in).nextLine();//キーボードから入力
			int a = Integer.parselnt(value1);// 文字入力を受け付けて、変数inputStringに代入

            System.out.println("整数の値を入力してください");
            String value2 = new java.util.Scanner(System.in).nextLine();//キーボードから入力
			int b = Integer.parselnt(value2);// 文字入力を受け付けて、変数inputStringに代入

			//String strText = reader.readLine();//
                  
            // 入力された文字列を表示
            int d = a % b ;
            int f = b % d ;
            if(f == 0){
                System.out.println(d+"が最大公約数"); 
            }
         
			//System.out.println(strText);
			
		} catch(IOException e) {
			System.out.println(e);
		}

        public static int ans(int a,int b){
            

        } 
	}
}

