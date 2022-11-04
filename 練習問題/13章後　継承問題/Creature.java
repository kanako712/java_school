
public class Creature {
    String name;//①名前をあらわすString型のフィールド
    int seimeiti;//②生命値をあらわすint型のフィールド

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
    
}
