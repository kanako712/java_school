/*
 * クラスの中に以下の内容のprintHelloメソッドと実行メソッドを作成してください。
printHelloメソッド...「HelloWorld」と表示するだけのメソッドです。
実行メソッド（mainメソッド）...printHelloメソッドを2度呼び出します。
 */

public class Q6 {
    public static void main(String[] args){
        printHello();
        printHello();
    }

    public static void printHello(){
        System.out.println("HelloWorld");
    }
}
