/*
 * 1)	BufferedReaderを使って標準入力から文字列を受け取り、
	int型数値を返す inputIntNumberメソッドを作成してください。
	例外処理は inputIntNumberメソッド内で行い、例外が発生したら-1を戻り値とします。
	メインメソッドは inputIntNumberメソッドを呼び出して、正の整数を表示するだけの機能を持ちます。
	負の数が入力された場合には「負の数は表示しません」と表示してください。
	【クラス名: ExceptionTest】
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class ExceptionTest {
    public static void main(String[] args) {
        //メソッドの呼び出し
        int num2 = inputIntNumber();
        
        //入力された文字が正の数なら表示
        if(num2 >=0){
            System.out.println("入力値"+ num2);
        //負の数が入力された場合には「負の数は表示しません」と表示してください。
        }else{
        System.out.println("負の数は表示しません");
        }   
    }

		//int型数値を返す inputIntNumberメソッドを作成してください。
    public  static int inputIntNumber() {  //インスタンス化するならstaticつけない
    int num = 0;
        try {
            // InputStreamReaderとBufferedReaderを用意する
            InputStreamReader iSR = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(iSR);

            System.out.println("整数の値を入力してください");
            String text = reader.readLine();//キーボードから入力
            num = Integer.parseInt(text);//int数字に変換
                

        //例外処理は inputIntNumberメソッド内で行い、
        }catch(IOException | NumberFormatException e) {//(Exception e)なんでもキャッチする
            //例外が発生したら-1を戻り値とします。
            num = -1;//return -1;だけでもOK
            System.out.println(num);       
        }    
    return num;
    }
}
