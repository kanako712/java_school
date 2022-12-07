/*
ArrayListに1~100のランダムな数字を10個格納してください。
その後、格納した数字を順に表示してください。
その後、ArrayListの中身をバブルソートを用いて並べ替え、
再び、順に表示してください。

もし、余裕があればクイックソートも試してみてください。
要素数を増やして、バブルソートとクイックソートで処理速度にどの程度差があるか確認してみてください。
*/
import java.util.ArrayList;
import java.util.List;
public class Q18 {
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>();
        for(int i = 0 ; i < 10 ; i++){
            int suzi = new java.util.Random().nextInt(101);
            num.add(suzi);
            System.out.println(suzi);
        }

        //バブルソートを用いた並べ替え
        
    

    }
    
}
