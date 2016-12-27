/**
 * Created by wanglong on 16/12/5.
 */
public class TempTest {
    private void test1(A a) {
        a = new A();
        a.age = 20;
        System.out.println("test1方法中的age=" + a.age);
    }

    public static void main(String[] args) {
        TempTest t = new TempTest();

        char cTmp = '在';
        System.out.println(cTmp);
    }
}

class A {
    public int age = 0;
}
