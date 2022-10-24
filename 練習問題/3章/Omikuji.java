public class Omikuji {
    public static void main(String[] args) {
        System.out.println("占いますか？");
        int intOmikuji = new java.util.Random().nextInt(6);
        switch(intOmikuji){
            case 1:
            System.out.println("大吉");
            break;
            case 2:
            System.out.println("中吉");
            break;
            case 3:
            System.out.println("小吉");
            break;  
            case 4:
            System.out.println("吉");
            break;
            case 5:
            System.out.println("凶");
            break;
            case 6:
            System.out.println("大凶");
            break;
        }  
    }
}


