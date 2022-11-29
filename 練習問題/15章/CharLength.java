/*
 * 【class CharLength】　※String型のメソッドを使います。		
入力された文字列が３文字以下なら”すこし”４文字以上なら”たくさん” 	
を表示するプログラムを作成してください。		
（右記のlengthメソッドを使用して下さい。）		
（追加機能1）この処理は繰り返し処理で、永久に繰り返されるプログラムに変更してください。		
（追加機能2）”end”の文字列が入力されたときに、プログラムが終了するように変更してください。		
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class CharLength {
	public static void main(String[] args) {
		// InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		
		try {
            //全体を回す
            for(int i = 1 ; i > 0 ; i++){
                //文字入力を受け付ける
                System.out.println("文字列を入力してください");
                //キーボードから入力
			    String mozi = reader.readLine();
                //endを
                String e = "end";
                    
                    if(mozi.equals(e)){
                    System.out.println(mozi+"プログラム終了します");
                    break;
                    //長さによって分岐する
                    //3文字以下なら”すこし”と表示
                    }else if(mozi.length() <= 3){
                        System.out.println(mozi+"  すこし");
                    //4文字以上なら”たくさん”と表示
                    }else if(mozi.length() >= 4){
                        System.out.println(mozi+"  たくさん");
                }
            }


		} catch(IOException e) {
			System.out.println(e);
		}
	}
}


    
