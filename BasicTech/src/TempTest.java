/**
 * Created by wanglong on 16/12/5.
 */
public class TempTest {

    /**
     * 静态代码块
     * Java程序初始化顺序： 父类静态变量、父类静态代码块、子类静态变量、子类静态代码块、
     * 父类非静态变量、父类非静态代码块、父类构造函数、子类非静态变量、子类非静态代码块、子类构造函数
     */
    static {
        System.out.println("static block is called before main()...");
    }
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);
        }
        System.out.println("test1方法中的staticVarOfA=" + A.staticVarOfA);
    }

    private void test1(A a) {
        a = new A();
        a.age = 20;
        System.out.println("test1方法中的age=" + a.age);
    }
}

class A {
    public int age = 0;
    public static int staticVarOfA;
}
