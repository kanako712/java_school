import java.io.IOException;

/*
 * 3）	methodA、methodB、methodCの三つのメソッドを持つクラスを作成し、
	どれか一つのメソッドで例外を発生させ(何を発生させるかは自由！)、
	printStackTraceを使って、例外がどこから投げられたのかを表示するサンプルコードを考えなさい。
	ｔry ～ catch 文はメインメソッドに置いてください。
	【クラス名: StackTraceTest】
 */

public class StackTraceTest {
    public static void main(String[] args){
        try{
            mathodA();
            mathodB();
            mathodC();

        }catch(IllegalArgumentException e){
            //例外がどこから投げられたのかを表示するサンプルコード
            e.printStackTrace();

        }

    }

    public static void mathodA(){
        
    }

    public static void mathodB(){
        //例外を発生させる
        throw new IllegalArgumentException();
        
    }

    public static void mathodC(){
        
    }
}
