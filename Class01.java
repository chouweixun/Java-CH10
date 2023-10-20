class Caaa {
    public int num1; // 第一個整數成員
    public int num2; // 第二個整數成員 
    public Caaa() { // 父類別的建構元
        num1 = 0; // 初始化 num1 為 0
        num2 = 0; // 初始化 num2 為 0
    }
}
class Cbbb extends Caaa {// 子類別 Cbbb 繼承自 Caaa
    public void set_numO(int n1, int n2) {
        num1 = n1; // 設定從父類別繼承而來的成員 num1
        num2 = n2; // 設定從父類別繼承而來的成員 num2
    }
    public void show() {
        System.out.println("num1: " + num1); // 顯示 num1 的值
        System.out.println("num2: " + num2); // 顯示 num2 的值
    }
}
public class Class01 {
    public static void main(String args[]) {
        Cbbb bb = new Cbbb(); // 建立子類別 Cbbb 的物件
        bb.set_numO(5, 10); // 設定 num1 和 num2 的值
        bb.show(); // 顯示 num1 和 num2 的值
    }
}
