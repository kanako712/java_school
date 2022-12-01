/*
 * ArrayListに「まぐろ」、「えび」、「ぶり」、「たこ」、「あわび」を順に追加し、
   全て取り出して表示させるプログラムを作成してください。 
 */
import java.util.ArrayList;

public class Q14 {
    public static void main(String[] args){
        ArrayList<String> sushi = new ArrayList<>();
        //ネタの追加
        sushi.add("まぐろ");
        sushi.add("えび");
        sushi.add("ぶり");
        sushi.add("たこ");
        sushi.add("あわび");

        for(String name : sushi){
            System.out.println(name);
        }

    }
    
}
