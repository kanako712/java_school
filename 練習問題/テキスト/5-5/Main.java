public class Main {
    public static void main(String[] args){
        System.out.println("メソッドを呼び出します");
        add(100,20);
        add(200,50);
    }

    public static void add(int x,int y){
        int ans = x + y;
        System.out.println(x+"+"+y+"="+ans);
    }     
}

