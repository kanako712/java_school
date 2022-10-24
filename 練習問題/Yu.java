import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Yu {
	public static void main(String[] args) {
		// InputStreamReaderとBufferedReaderを用意する
		InputStreamReader iSR = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(iSR);
		
		try {
			System.out.println("お家からここまでの㎞数を整数で記入");
			String StrText = reader.readLine();//キーボードから入力
            int intkm = Integer.parseInt(StrText);//数字に変換
            
            if (intkm <= 5){
                System.out.println("とっても近いです");
            }else if(intkm <= 10){
                System.out.println("近いです");
            }else if(intkm <= 15){
                System.out.println("遠いです");
            }else {
                System.out.println("とても遠いです");
            }
            
			
		} catch(IOException e) {
			System.out.println(e);

		} catch(NumberFormatException e) {
            System.out.println(e);
        }
	}
}
