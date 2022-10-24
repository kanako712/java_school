import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CalculateInputM  {
    //２つの値（整数）を受取り、その値の四則演算結果を表示するクラスを作ります
	
    public static int calcShisoku(int x,int y) {   
        int wa = x + y;
        return wa;
    }
    public static int calcShisoku2(int x,int y) {   
        int sa = x - y;
        return sa;
    }
    public static int calcShisoku3(int x,int y) {   
        int seki = x * y;
        return seki;
    }
    public static double calcShisoku4(double x,double y) {   
        double syou = x / y;
        return syou;
    }


    public static void main(String[] args) {
	// InputStreamReaderとBufferedReaderを用意する
	InputStreamReader iSR = new InputStreamReader(System.in);
	BufferedReader reader = new BufferedReader(iSR);
		
		try {
			System.out.println("1つ目の整数を入力してください");
			String StrText = reader.readLine();//キーボードから入力
            int intNum1 = Integer.parseInt(StrText);//数字に変換

            System.out.println("2つ目の整数を入力してください");
			String StrText2 = reader.readLine();//キーボードから入力
            int intNum2 = Integer.parseInt(StrText2);//数字に変換
        
            int wa = calcShisoku(intNum1,intNum2);
            int sa = calcShisoku2(intNum1,intNum2);
            int seki = calcShisoku3(intNum1,intNum2);
            double syou = calcShisoku4(intNum1,intNum2);

            System.out.println("和"+wa+"差"+sa+"積"+seki+"商"+syou);

        }catch(IOException e) {
			System.out.println(e);
	    }catch(NumberFormatException e) {
            System.out.println(e);
        }
    }
}
 