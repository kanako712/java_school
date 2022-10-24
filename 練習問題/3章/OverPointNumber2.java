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
