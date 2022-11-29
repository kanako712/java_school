import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String,Integer> prefs = new HashMap<>();
        prefs.put("京都府",255);
        prefs.put("東京都",1261);
        prefs.put("熊本県",181);
        //値を取得する
        int tokyo = prefs.get("東京都");
        System.out.println("東京都の人口は"+tokyo);

        //削除する
        prefs.remove("京都府");

        //存在してるものに上から登録（上書き）
        prefs.put("熊本県",182);
        //値を取得する
        int kumamoto = prefs.get("熊本県");
        System.out.println("熊本県の人口は"+kumamoto);
        System.out.println(prefs.size());
        }
    }
    