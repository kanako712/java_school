import javax.management.monitor.MonitorSettingException;

public class Main{
    public static void main(String[] args) {

         //1.敵を生成
        Slime s = new Slime();
        Monster m = new Slime();

        //2.フィールドに初期値をセット
        
        //冒険のはじまり
        s.run();
        s.run();
   }
}
