/*
要素数8の配列を作成し、文字’A’～’H’を順に格納し、
配列の要素数と配列の要素を全て表示するプログラムを作成してください。
*/

public class ArrayTest {
    public static void main (String[]args){
       
        char[]chaMozi = {'A','B','C','D','E','F','G','H'};//８個の箱にアルファベット代入
        System.out.println("要素数が"+chaMozi.length+"。");
        for(int i = 0; i<chaMozi.length;i++){//ループで配列を回す
            System.out.println("要素は"+chaMozi[i]+"です");
        }
    }
}