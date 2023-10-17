class Caaa {
    private int num; // 宣告一個私有整數型別的變數 num
    public Caaa(int n) { // 建構函式，用於初始化 num
        num = n;
    }
    public int get() {
        return num;
    }
    public void display() {
        System.out.println("printed from Caaa class"); 
    }
}
class Cbbb extends Caaa {
    public Cbbb(int n) { // 建構函式，繼承自Caaa並使用傳入的參數初始化 num
        super(n); // 呼叫父類別的建構函式
    }
    public void show() {
        System.out.println("num=" + get());
    }
    public void display() {
        System.out.println("printed from Cbbb class"); 
    }
}
public class Class09 {
    public static void main(String[] args) {
        Cbbb bb = new Cbbb(2); // 創建 Cbbb 類別的實例，並傳入初始化參數2
        bb.show(); // 呼叫show方法來輸出num的值
        Caaa aa = new Cbbb(3); // 創建Cbbb類別的實例並賦值給父類別的引用
        aa.display(); // 呼叫display方法
    }
}
