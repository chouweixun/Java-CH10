class Caaa {
    public int num1; // 第一個整數成員
    public int num2; // 第二個整數成員
    public Caaa() { // 1. 新增無引數的建構元，設定num1和num2初值為1
        num1 = 1;
        num2 = 1;
    }
    public Caaa(int a, int b) { // 2.新增有引數的建構元，設定num1為a，num2為b
        num1 = a;
        num2 = b;
    }
}
class Cbbb extends Caaa { // 子類別 Cbbb 繼承自 Caaa
    public Cbbb(int a, int b) { // 3. 新增有引數的建構元，呼叫父類別Caaa的有引數建構元
        super(a, b); // 呼叫父類別 Caaa 的有引數建構元，設定num1和num2
    }
    public Cbbb() { // 4. 新增無引數的建構元，呼叫父類別Caaa的無引數建構元
        super(); // 呼叫父類別 Caaa 的無引數建構元，設定num1和num2
    }
}
public class Class13 {
    public static void main(String args[]) {
        Caaa aaa1 = new Caaa(); // 1.無引數建構元
        System.out.println("aaa1.num1: " + aaa1.num1);
        System.out.println("aaa1.num2: " + aaa1.num2);

        Caaa aaa2 = new Caaa(5, 10); // 2.有引數建構元
        System.out.println("aaa2.num1: " + aaa2.num1);
        System.out.println("aaa2.num2: " + aaa2.num2);

        Cbbb bbb = new Cbbb(3, 7); // 3.子類別的建構元，呼叫父類別有引數建構元
        System.out.println("bbb.num1: " + bbb.num1);
        System.out.println("bbb.num2: " + bbb.num2);

        Cbbb bbb2 = new Cbbb(); // 4.子類別的建構元，呼叫父類別無引數建構元
        System.out.println("bbb2.num1: " + bbb2.num1);
        System.out.println("bbb2.num2: " + bbb2.num2);
    }
}
