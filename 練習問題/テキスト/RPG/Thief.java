/* 　9章　さまざまなクラス機構　練習問題
　　1 このクラスは「new Thief("アサカ",40,5)」のように、
     名前とHPとMPだけを指定してインスタンス化
     ⇨コンストラクタ①
   2 このクラスは「new Thief("アサカ",35)」のように、
     名前とHPだけを指定してインスタンス化,この場合MPは5で初期化
     ⇨コンストラクタ②
   3 このクラスは「new Thief("アサカ")」のように、
     名前だけを指定してインスタンス化,この場合HPは40、MPは5で初期化
     ⇨コンストラクタ③
   4 このクラスは「new Thief()」のように、
     名前を指定しない場合にはインスタンス化できない
     ⇨コード書かない
　　5 コンストラクタは極力重複コードをなくす    
*/

public class Thief {
    String name;
    int hp;
    int mp;

    //コンストラクタ①
    public Thief(String name,int hp,int mp){
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    //コンストラクタ②
    public Thief(String name,int hp){//2個入力でも反応するようにMPはなしその代わり初期値入る設定
        this(name,hp,5);//コンストラクタ①呼び出し
        //this.name = name;こう書けるけど長くなるからthis();で呼び出しのが上を呼び出せて楽！
        //this.hp = hp;
        //this.mp = 5;

    }

    public Thief(String name){
        this(name,40,5);//コンストラクタ②→①呼び出し
        //this.name = name;
        //this.hp = 40;
        //this.mp = 5;
    }
    
}
