class CTriangle {
    protected int base; 
    protected int height; 
    protected void show() {
        System.out.println("base=" + base + ", height=" + height);
    }
}
class CData extends CTriangle {
    public CData(int base, int height) {
        this.base = base; // 使用提供的值初始化'base'成員變數。
        this.height = height; // 使用提供的值初始化'height'成員變數。
    }
    public void area() {
        super.show(); // 呼叫父類的 show() 方法以顯示 'base' 和 'height'。
        double t = 0.5 * base * height; // 計算三角形的面積。
        System.out.println("area=" + t); // 顯示計算出的面積。
    }
}

public class Class06 {
    public static void main(String[] args) {
        CData obj = new CData(3, 8); // 創建一個具有底邊 3 和高度 8 的 CData 實例。
        obj.area(); // 呼叫 'area' 方法以顯示三角形的資訊和其面積。
    }
}
