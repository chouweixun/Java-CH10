class Caaa {
    public int num1; //第一個整數成員
    public int num2; //第二個整數成員
    public Caaa() {//(a)新增無引數的建構元，設定num1和num2初值為1
        num1 = 1;
        num2 = 1;
    }
    public Caaa(int a, int b) {//(b)新增有引數的建構元，設定num1為a，num2為b
        num1 = a;
        num2 = b;
    }
}
class Cbbb extends Caaa {//子類別 Cbbb 繼承自 Caaa
    public Cbbb(int a, int b) {//(c)新增有引數的建構元，呼叫父類別Caaa的有引數建構元
        super(a, b);
    }
}
public class Class03 {
    public static void main(String args[]) {
        Caaa aaa1 = new Caaa();//(a)無引數建構元
        System.out.println("aaa1.num1: " + aaa1.num1);
        System.out.println("aaa1.num2: " + aaa1.num2);
        Caaa aaa2 = new Caaa(5, 10);//(b)有引數建構元
        System.out.println("aaa2.num1: " + aaa2.num1);
        System.out.println("aaa2.num2: " + aaa2.num2);
        Cbbb bbb = new Cbbb(3, 7);//(c)子類別的建構元
        System.out.println("bbb.num1: " + bbb.num1);
        System.out.println("bbb.num2: " + bbb.num2);
    }
}
