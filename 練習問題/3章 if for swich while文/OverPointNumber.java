/*
 * 3章　while文　
 * 【class OverPointNumber】　※while文を使ってください。	
　　2のn乗  ＞ 100,000を満たす一番小さなｎと、そのときの値を表示してください。	
　　（答え）　n = 17 、　num = 131072　になります。	
 */

public class OverPointNumber {
    public static void main(String[] args) {

       int intNum = 100000;
       int intNum2 = 1;//結果
       int intNum3 = 0;//n乗

        while(intNum2 <= intNum ){
          intNum3++;
          intNum2 = intNum2 * 2;
        }  
           
        System.out.println("一番小さなn"+intNum3+"その時の値"+intNum2);
        }
    }

