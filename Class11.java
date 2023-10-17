class CShape {
    public double area() {
        return 0.0; // 預設情況下，返回零作為面積，子類別需要覆蓋此方法以計算實際的面積。
    }
}
class CCircle extends CShape {
    private double radius;
    public CCircle(double radius) {
        this.radius = radius; // 通過建構函數傳入半徑來初始化圓的半徑。
    }
    public double area() {
        return Math.PI * radius * radius; // 使用圓形面積公式計算面積。
    }
}
class CSquare extends CShape {
    private double side;
    public CSquare(double side) {
        this.side = side; // 通過建構函數傳入邊長來初始化正方形的邊長。
    }
    public double area() {
        return side * side; // 使用正方形面積公式計算面積。
    }
}
class CTriangle extends CShape {
    private double base;
    private double height;
    public CTriangle(double base, double height) {
        this.base = base;
        this.height = height; // 通過建構函數傳入底和高來初始化三角形的底和高。
    }
    public double area() {
        return 0.5 * base * height; // 使用三角形面積公式計算面積。
    }
}
public class Class11 {
    public static void main(String[] args) {// 創建圓形、正方形、三角形各兩個實例
        CCircle c1 = new CCircle(5.0);
        CCircle c2 = new CCircle(3.0);
        CSquare s1 = new CSquare(4.0);
        CSquare s2 = new CSquare(6.0);
        CTriangle t1 = new CTriangle(3.0, 4.0);
        CTriangle t2 = new CTriangle(5.0, 7.0);
        CShape[] shapes = {c1, c2, s1, s2, t1, t2};// 將所有形狀的實例放入陣列中
        CShape lS = largest(shapes);// 呼叫 largest 函數找到具有最大面積的形狀
        System.out.println("最大面積：" + lS.area());// 輸出最大面積
    }
    public static CShape largest(CShape[] shapes) {
        CShape largest = shapes[0];
        for (int i = 1; i < shapes.length; i++) {
            if (shapes[i].area() > largest.area()) {
                largest = shapes[i];
            }
        }
        return largest;
    }
}
