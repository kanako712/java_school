
public class Creature {
    private String name;//①名前をあらわすString型のフィールド
    private int seimeiti;//②生命値をあらわすint型のフィールド

    public Creature(String name,int seimeiti){//1で作ったクラスに、名前と生命値を設定できるコンストラクタを作成してください。
        this.name = name;
        this.seimeiti = seimeiti;
    }

    public Creature(String name){//1で作ったクラスに、名前と生命値を設定できるコンストラクタを作成してください。
        this(name,10);
    }

    public Creature(int seimeiti){//1で作ったクラスに、名前と生命値を設定できるコンストラクタを作成してください。
        this("スライム",seimeiti);
    }

    public Creature(){//コンストラクタで指定しない場合は、名前には「スライム」、生命値には「10」を設定するようにします。
        this("スライム",10);
    }
    

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    } 

    public int getSeimeiti(){
        return this.seimeiti;
    }
    public void setSeimeiti(int seimeiti){
        this.seimeiti = seimeiti;
    } 

}
