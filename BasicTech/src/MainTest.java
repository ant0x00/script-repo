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
     * 非静态代码块
     */
    {
        System.out.println("I'm not a static block.");
    }
    public static void main(String[] args) {
        test02();
        new MainTest();
    }

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

