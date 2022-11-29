/*
 * 2）	1)のプログラムを、メソッドで発生する例外をメソッドでは処理せずにスローして、
	メインメソッドで例外処理するように改造してください。
	【クラス名: ExceptionTest2】
 */
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ExceptionTest2 {
    public static void main(String[] args) {
        //メソッドの呼び出し
        int num2 ;
        try{
            num2 = inputIntNumber();
            //入力された文字が正の数なら表示
            if(num2 >=0){
                System.out.println("入力値"+ num2);
            //負の数が入力された場合には「負の数は表示しません」と表示してください。
            }else{
            System.out.println("負の数は表示しません");
            }  
        //例外処理は inputIntNumberメソッド内で行い、例外が発生したら-1を戻り値とします。
        }catch(Exception e) {
        num2 = -1;
        System.out.println(num2);
        }    
    }

	//int型数値を返す inputIntNumberメソッドを作成してください。
    //throws をつけることでここでは例外出さない
    public  static int inputIntNumber()throws IOException {  //インスタンス化するならstaticつけない
    int num = 0;
        // InputStreamReaderとBufferedReaderを用意する
        InputStreamReader iSR = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(iSR);

        System.out.println("整数の値を入力してください");
        String text = reader.readLine();//キーボードから入力
        num = Integer.parseInt(text);//数字に変換
                     
    return num;
    }
}

