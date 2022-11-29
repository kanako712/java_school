public abstract class Character {//newによるインスタンス化できないようにabstractする
    String name;
    int hp;

    //逃げる
    public void run(){
        System.out.println(this.name+"は逃げ出した");
    }
    
    //戦う
    public abstract void attack(Matango m);//抽象メソッドにする
       
}
    

