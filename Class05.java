class Caaa {
    private int num; // 聲明一個私有整數型變數num
    public Caaa(int n) { // 建構函數，用於初始化num
        num = n;
    }
    public int get() { 
        return num;
    }
}
class Cbbb extends Caaa {
    public Cbbb(int n) { // 建構函數，繼承自Caaa並使用傳入的參數初始化的 num
        super(n);//父類別建構函數的語句
    }
    public void show() { 
        System.out.println("num=" + get());
    }
}
public class Class05 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2); // 創建 Cbbb 類的實例，並傳入初始化參數2
        bb.show(); // 呼叫show方法來輸出num的值
    }
}
