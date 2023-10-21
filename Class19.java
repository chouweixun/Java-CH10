class CRectangle {
    protected int length;  // 長方形的長度
    protected int width;   // 長方形的寬度
    public CRectangle(int l, int w) {
        length = l;  // 使用建構元設定長方形的長度
        width = w;   // 使用建構元設定長方形的寬度
    }
    public int getArea() {
        return length * width;  // 計算並傳回長方形的面積
    }
    public String toString() {
        int area = getArea();  // 使用getArea方法計算長方形的面積
        return "length=" + length + ", width=" + width + ", area=" + area;  // 傳回包含長度、寬度和面積資訊的字串
    }
}
public class Class19 {
    public static void main(String[] args) {
        CRectangle rect = new CRectangle(2, 6);  // 建立CRectangle物件並設定初始值
        System.out.println(rect);  // 列印長方形的資訊，包括長度、寬度和面積
    }
}
