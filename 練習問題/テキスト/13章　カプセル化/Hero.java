//13-13 setterメソッドの中で値の妥当性をチェックする

public class Hero{
    private String name; //名前をprivate
    int hp;

    public void setName(String name){//nullが代入
            if(name == null){
                throw new IllegalArgumentException("名前がnullである。処理を中断");
            }

            if(name.length() <= 1){//短すぎる
                throw new IllegalArgumentException("名前が短すぎる。処理を中断");
            }

            if(name.length() >= 8){//長すぎる
                throw new IllegalArgumentException("名前が長すぎる。処理を中断");
            }
            this.name = name;//検査完了。代入しても大丈夫
    }

    public void sleep(){
        this.hp = 100;
        System.out.println(this.name+"は、眠って回復した！");
    }

    public void sit(int sec){
        this.hp += sec;
        System.out.println(this.name+"は、"+sec+"秒座った！");
        System.out.println("HPが"+sec+"ポイント回復した");
    }

    public void slip(){
        this.hp -= 5;
        System.out.println(this.name+"は、転んだ！");
        System.out.println("5のダメージ！");
    }
    
    public void run(){
        System.out.println(this.name+"は、逃げ出した！");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは"+this.hp+"でした");
    }
    
    public Hero(String name){//コンストラクタ1
        this.hp = 100;
        this.name = name;
    }

    public Hero(){//コンストラクタ2
        this("ダミー");
    }

}
