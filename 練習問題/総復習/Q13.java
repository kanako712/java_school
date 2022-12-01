/*
 * コマンドライン引数で文字を入力したら、その文字列の長さを表示するプログラムを作成してください。
 */

public class Q13 {
    public static void main(String[] args){
        
       for(String mozi : args){
        System.out.println("文字列の長さ："+mozi.length());
       }
    }
    
}
