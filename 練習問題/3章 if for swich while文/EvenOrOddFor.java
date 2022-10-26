/*
 * 3章　For文　1）
 * 1から10の数字の偶数、奇数を表示する。
 * [表示結果]
　　　1は奇数です。  
　　　2は偶数です。
　　　　　↓
　　　10は偶数です。
 */


public class EvenOrOddFor {
    public static void main(String[] args) {
    //3章　for文　2）1から10の数字の偶数、奇数を表示する。    
        int intNum = 0;
            for(int i = 0 ; i <= 10 ; i++ ){
                if(i % 2 == 0){//余りなし偶数
                    System.out.println(i+"は偶数です。");  
                }else{
                    System.out.println(i+"は奇数です。");  
                }
        }
    }
}
