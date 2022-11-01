public class Matango{
    int hp = 10;
    char suffix;

    public Matango(char suffix){
        this.suffix = suffix;
    }

    public void attack(Hero h){
        System.out.println("キノコ"+this.suffix+"攻撃");
        System.out.println("10ダメージ");
        h.hp -= 10;
        
    }

    public void run(){
        System.out.println("お化けキノコ"+this.suffix+"は逃げ出した！");
    }

}  