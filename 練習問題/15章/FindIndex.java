/*
 * 【class FindIndex】　※String型のメソッドを使います。		
	コマンドライン引数に2つの文字列を指定し、1番目に指定された文字列の中に2番目に指定された文字列が存在する場合は、		
	「この文字列はあります。（●文字目）」と表示し、		
	存在しない場合は、		
	「この文字列は存在しません」と表示してください。		
	入力文字数は、1番目の文字列は10文字以上とし、2番目の文字列は2文字以上4文字以内とする。		
	文字列の入力には、コマンドライン引数を使ってください。		
	また、文字列は先頭から検索し、最初に見つかった文字のインデックス（位置番号）を表示することとする。		
	実行例：	> Java FindIndex  明日は雨が降るそうです。　雨が降る
			   > この文字列はあります。（4文字目）
			   >Java FindIndex  明日は雨が降るそうです。　雪が降る
			   > この文字列は存在しません
*/

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class FindIndex {
	public static void main(String[] args) {
		// InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		
		try {
			for(int i = 1 ; i > 0 ; i++){
            System.out.println("1つ目の文字列を入力してください(10文字以上)");
            String mozi1 = new java.util.Scanner(System.in).nextLine();//キーボードから入力
			String inputString = reader.readLine();

            System.out.println("2つ目の文字列を入力してください(2文字以上4文字以内)");
            String mozi2 = new java.util.Scanner(System.in).nextLine();//キーボードから入力

                if(mozi1.length() >= 10){
                	
					if(2 <= mozi2.length() || mozi2.length() >=4 ){
                    
                    	if(mozi1.contains(mozi2)){
                        	System.out.println("("+mozi1+")に("+mozi2+")はあります。("+mozi1.indexOf(mozi2)+"文字目)");
                    	}else{
                        	System.out.println("("+mozi1+")に("+mozi2+")は存在しません");
        
                    	}
                	}else{
						System.out.println("10文字以上ではありませんでした。");
					}
            	}else{
					System.out.println("2文字以上4文字以内ではありませんでした。");
				}
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}


