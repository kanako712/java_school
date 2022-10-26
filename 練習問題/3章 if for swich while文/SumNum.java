/*
   3章　for文　1）
 * 1から100まで足し算をして、結果を表示しなさい。 1+2+3+4+・・・・・・+100をする。
 */

public class SumNum {
    public static void main(String[] args) {
        //3章　for文　（1　1から100まで足し算をして、結果を表示しなさい。
        
        int intNum = 0;
        int intSouwa = 0;
        for(int i = 0 ; i <= 100 ; i++ ){
            intSouwa += i ;
        }

        System.out.println("1から100まで順番に足したら"+intSouwa+"になった");
    }
}

