//15-12　6つのint値とDate型の相互変換;
import java.util.Calendar;
import java.util.Date;


public class Main {
    public static void main(String[] args){
        //Calendarインスタンス生成
        Calendar c = Calendar.getInstance();
        
        //Calendarインスタンスにint型で日時を指定
        c.set(2019,8,22,1,23,45);
        //月を8から9へ、9月から10月へ変更　(一月が0)
        c.set(Calendar.MONTH,9);
        //CalendarインスタンスからDateインスタンスを生成
        Date d = c.getTime();
        System.out.println(d);

        //Dateインスタンスをnewして現在日時を取得
        Date now = new Date();
        //CalendarインスタンスにDateインスタンスをSetし日時設定
        c.setTime(now);

        //Calendarインスタンスから年を取得し表示
        int y = c.get(Calendar.YEAR);
        System.out.println("今年は"+ y + "年です");
    }
    
}
