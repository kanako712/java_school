/*
 * 年齢を入力したら生まれ年を表示するプログラムを作成してください。
   今年の西暦は、プログラム中に「2022」と記述してしまってOKです。
 */
import java.util.*; 
public class Q2 {
    public static void main(String[] args){
        System.out.println("年齢を入力してください");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        int year = 2022;
        int birth = year - age;
        System.out.println("あなたの生まれ年は"+(birth-1)+"年か"+birth+"年ですね");
    }
    
}
