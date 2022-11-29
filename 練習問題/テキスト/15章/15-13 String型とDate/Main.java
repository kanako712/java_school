//15-13　
import java.text.SimpleDateFormat;
import java.util.Date;


public class Main {
    public static void main(String[] args)throws Exception{
        //SimpleDateFormatインスタンスを生成
        //引数で表示形式を指定
        SimpleDateFormat f = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        //文字列"2020/09/22 01:23:45"からparseメソッドを使用してDateインスタンスを生成
        Date d = f.parse("2020/09/22 01:23:45");
        //表示
        System.out.println(d);

        //Dateインスタンスをnewして現在日時を取得
        Date now = new Date();
        //Dateインスタンスにformatメソッドを利用して文字列に変更
        String s = f.format(now);
        //表示
        System.out.println("現在は"+ s +"です");
    }

}

