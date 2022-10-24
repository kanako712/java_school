//文字列と数値（整数）を渡すと、数値の回数だけ文字列を表示するクラスを作成します。

import java.io.InputStreamReader;

import javax.xml.validation.ValidatorHandler;
import java.io.BufferedReader;
import java.io.IOException;

public class PrintString  {
	
    public static void printStringNum(string strText,int intNum) {   
        for(int i = 1 ; i <= intNum ; i++){
            System.out.println(i+"回目"+strText);  
            }
        }
    
    

    public static void main(String[] args) {
	// InputStreamReaderとBufferedReaderを用意する
	InputStreamReader iSR = new InputStreamReader(System.in);
	BufferedReader reader = new BufferedReader(iSR);
		
		try {
			System.out.println("文字を入力してください");
			String strText = reader.readLine();//キーボードから入力

            System.out.println("繰り返したい回数を入力してください");
			String StrText2 = reader.readLine();//キーボードから入力
            int intNum = Integer.parseInt(StrText2);//数字に変換
        
            printStringNum(strText,intNum);

        }catch(IOException e) {
			System.out.println(e);
	    }catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}