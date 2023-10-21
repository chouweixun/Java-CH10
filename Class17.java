class Car
{
    protected String owner; // 車主姓名
    protected String id;    // 車牌號碼
    public Car(String own, String s) {
        owner = own;  // 使用建構元設定車主姓名
        id = s;       // 使用建構元設定車牌號碼
    }
    public void show() {
        System.out.println("車主姓名：" + owner);  // 顯示車主姓名
        System.out.println("車牌號碼：" + id);    // 顯示車牌號碼
    }
}
class CColor extends Car
{
    private String color;  // 車身顏色
    public CColor(String own, String s, String c) {
        super(own, s);  // 使用父類的建構元設定車主姓名和車牌號碼
        color = c;      // 設定車身顏色
    }
    public void show() {
        super.show(); // 呼叫父類的show()函數以顯示車主姓名和車牌號碼
        System.out.println("車身顏色：" + color);  // 顯示車身顏色
    }
}
public class Class17 {
    public static void main(String[] args) {
        CColor mycar = new CColor("Riaan", "A1-2345", "Black");
        mycar.show();  // 顯示車主姓名、車牌號碼和車身顏色
    }
}
(e)因為在CColor建構元中嘗試調用父類Car的建構元時出現問題。父類Car中的建構元不是public的，在不更動父類別的程式敘述的原則下，
可以使用super關鍵字在子類CColor的建構元中調用父類Car的建構元，通過使用super關鍵字來訪問父類的建構元，可以在不更動父類程式敘述的情況下解決問題，使程式可以正確執行。
