import sun.applet.Main;

/**
 * Created by wanglong on 16/12/5.
 */
public class MainTest {

    /**
     * 静态代码块
     */
    static {
        System.out.println("I'm a static block.");
    }

    /**
     * 构造方法
     * 可以有多个构造方法
     * 不能有返回值，可以有参数
     * new的时候调用
     * 主要是完成对象的初始化工作
     * 不能被继承、可以被重载
     * 子类可以通过super显示的调用父类的构造方法
     * 如果父类没有提供无参构造函数时，子类的构造函数必需显示的调用父类的构造方法
     */
    MainTest() {
        System.out.println("Construct function.");
    }

    /**
     * 非静态代码块
     */ {
        System.out.println("I'm not a static block.");
    }

    public static void main(String[] args) {
        test02();
        new MainTest();
    }

    /**
     * 静态方法
     */
    static void test01() {
        int x = 20;

        do {
            System.out.print("value of x : " + x);
            x++;
            System.out.print("\n");
        } while (x < 20);
    }

    static void test02() {
        String str01 = null;
        if (str01 == null) {
            System.out.print("string is Object.\n");
        }
    }

}

