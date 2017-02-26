/**
 * Created by wanglong on 16/12/5.
 */
public class TempTest {
    static {
        System.out.println("static block is called before main()...");
    }
    public static void main(String[] args) {
        for (int i=0; i<args.length;i++){
            System.out.println(args[i]);
        }
    }

    private void test1(A a) {
        a = new A();
        a.age = 20;
        System.out.println("test1方法中的age=" + a.age);
    }
}

class A {
    public int age = 0;
}
