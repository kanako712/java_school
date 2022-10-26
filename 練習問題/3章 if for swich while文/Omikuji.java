/*
 * 3章　switch文　2）
 * 【class Omikuji】　★★
    大吉、中吉、小吉、吉、凶、大凶をランダムに出力するプログラムを作成せよ。
    （乱数の発生には Math.random()メソッドAPIやネットで調べて使用）
    ※可能であれば、switch文を使って、出る目の割合を変えてください。
 */

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


