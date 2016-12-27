/**
 * Created by zjwlong on 16/12/6.
 */
public class TestDemo01 {
    public static void main(String[] args) {
        Integer f1 = 100, f2 = 100, f3 = 150, f4 = 150;
        Integer f5 = new Integer(100);
        /**
         自动装箱
         自动装箱会根据基础数据类型的值创建对应的包装器类型对象。由于自动装箱机制，代码Integer i = 1000;
         等价于Integer i = new Integer(1000);。

         实现方式
         自动装箱机制是通过自动调用包装器类的valueOf()方法实现的，但为了节省内存、提高性能，
         部分包装器类型缓存了值在[-128 — 127]区间内的对象。这些包装器类型包括Character、Byte、Short、 Integer和Long。

         f3和f4是新new出来的，所以并不是一个对象
         */
        System.out.println(f1 == f2); //只对自动装箱的情况有效
        System.out.println(f1 == f5);
        System.out.println(f3 == f4);
    }
}
