/*
 * クラスの中に以下の内容のsquareメソッドと実行メソッドを作成してください。
squareメソッド...引数で与えられた整数を二乗して戻り値とします。
実行メソッド（mainメソッド）...squareメソッドに引数として5を与え、2乗した結果を表示します。
 */
public class Q7 {
    
    public static void main(String[] args){
        int num = 5;
        int ans = square(5);
        System.out.println(num+"の二乗は"+ans+"です");   
    }

    public static int square(int num){
        int ans = num * num ;   
        return ans;
    }
    
}
