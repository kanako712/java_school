/*
3章　which文　2)
 * 【class OverPointNumber2】　※while文を使ってください。
   1 + 2 + 3 + 4 と足していき、総和が１万を超えたら、そのときの総和と最後に足した数を出力してください。
   （答え）　総和 = 10011 、　最後に足した数 = 141　になります。
 */

public class OverPointNumber2 {
    public static void main(String[] args) {
        int intLimit = 10000;
        int intSouwa = 0;
        int intSaigo = 0;

        while(intSouwa <= intLimit){  
            intSaigo++;
            intSouwa = intSouwa +intSaigo;}   

        System.out.println("一番小さなn"+intSaigo+"その時の値"+intSouwa);
    }
}
