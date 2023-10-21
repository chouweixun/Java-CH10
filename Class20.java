class CRectangle {
    protected int length;  
    protected int width;   
    public CRectangle(int l, int w) {// 建構元，初始化長度和寬度
        length = l;  
        width = w;   
    }
    public int getArea() {// 計算長方形的面積
        return length * width;  
    }
    public String toString() {// 覆寫Object類別的toString方法，以提供長方形資訊的字串表示
        return "length=" + length + ", width=" + width + ", area=" + getArea();
    }
    public String toString(int a, int b) {// 自定義的toString方法，帶有兩個整數引數a和b
        if (a >= b) {
            return super.toString();  // 使用父類的toString()方法
        } else {
            return "Argument Error";  // 如果a < b，返回"Argument Error"字串
        }
    }
}
public class Class20 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle(2, 6);  // 建立CRectangle物件並設定初始值
        System.out.println(rect.toString());// (a) 當toString()沒有引數時，調用CRectangle類別的toString()
        int a = 3; // (b) 當toString()的引數為2個整數a和b時
        int b = 2;
        System.out.println(rect.toString(a, b)); // 呼叫CRectangle的toString(int a, int b)
        a = 1;
        b = 4;
        System.out.println(rect.toString(a, b)); // 呼叫Object的toString()
    }
}
(c)方法重載允許在同一個類別中定義多個方法，它們具有相同的名稱，但具有不同的參數列表。這使得您可以根據方法的不同參數來執行不同的操作，從而提高程式的靈活性和可讀性。
