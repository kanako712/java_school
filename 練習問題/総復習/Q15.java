/*
 * HushSetに「塩」、「味噌」、「醤油」、「豚骨」、「塩」を順に追加し、	
   全て取り出して表示させるプログラムを作成してください。	
   ※実行例と順序が違ってもよいです。	
 */
import java.util.HashSet;
public class Q15 {
    public static void main(String[] args){
        HashSet<String> name = new HashSet<>();

        name.add("塩");
        name.add("味噌");
        name.add("醤油");
        name.add("豚骨");
        name.add("塩");

        for(String food : name){
            System.out.println(food);
        }

    }
    
}
