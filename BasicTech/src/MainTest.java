/**
 * Created by wanglong on 16/12/5.
 */
public class MainTest {
    public static void main(String[] args) {
//        test01();
        test02();
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
            System.out.print("string is Object.");
        }
    }

}

