/*
 * String型の配列animalsを作成し、「ニワトリ」、「ネコ」、「イヌ」、「ロバ」の4つを代入してください。
   その後、拡張for文を用いて順に表示するプログラムを作成してください。
 */
public class Q5 {
    public static void main(String[] args){
        
        String[] animals = {"ニワトリ","ネコ","イヌ","ロバ"};

        for(String value : animals){
            System.out.println(value);
        }
    }
    
}
