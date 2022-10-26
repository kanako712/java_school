import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TriangleAreaM  {
	
    public static double calcArea(int intTeihen,int intTakasa) {   
        double ans = (intTeihen * intTakasa)/2.0;
        return ans;
    }
    

    public static void main(String[] args) {
	// InputStreamReaderとBufferedReaderを用意する
	InputStreamReader iSR = new InputStreamReader(System.in);
	BufferedReader reader = new BufferedReader(iSR);
		
		try {
			System.out.println("底辺を入力してください");
			String StrText = reader.readLine();//キーボードから入力
            int intTeihen = Integer.parseInt(StrText);//数字に変換

            System.out.println("高さを入力してください");
			String StrText2 = reader.readLine();//キーボードから入力
            int intTakasa = Integer.parseInt(StrText2);//数字に変換
        
            double ans = calcArea(intTeihen,intTakasa);

            System.out.println("底辺"+intTeihen+"㎝、高さ"+intTakasa+"㎝の面積は"+ans+"です。");

        }catch(IOException e) {
			System.out.println(e);
	    }catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}
 

