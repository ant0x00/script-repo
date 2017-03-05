package com.ant0x00.test;

import java.io.*;

/**
 * Created by wanglong on 16/12/5.
 */
public class TempTest {

    private String memVar;
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
//        test4();
        short i =118; i += 1;
        Character c = new Character((char)i);
        System.out.println(c);
        System.out.println((byte)i);
    }

    /**
     * 只有非静态方法才能访问类的非静态成员变量
     * @param var
     */
    private void setMemVar(String var){
        memVar = var;
    }

    /**
     * 中间缓存变量机制实例
     * temp=j;
     * j=j+1;
     * j=temp;
     */
    static void test4() {
        int j = 0;
        for (int i = 0; i < 100; i++) {
            j = j++;
        }
        System.out.println(j);
    }

    /**
     * Java中字符只有一种形式存在，Unicode。
     * 分两种：面向字符I/O,面向字节流I/O
     * 面向字符Reader/Writer类，面向字节InputStream/OutPutStream
     */
    static void test3() {
        File f = new File("test");
        try {
            FileOutputStream fop = new FileOutputStream(f);
            OutputStreamWriter writer = new OutputStreamWriter(fop, "UTF-8");
            // 构建OutputStreamWriter对象,参数可以指定编码,默认为操作系统默认编码,windows上是gbk

            writer.append("中文输入");
            // 写入到缓冲区

            writer.append("\r\n");
            //换行

            writer.append("English");
            // 刷新缓存冲,写入到文件,如果下面已经没有写入的内容了,直接close也会写入

            writer.close();
            //关闭写入流,同时会把缓冲区内容写入文件,所以上面的注释掉

            fop.close();
            // 关闭输出流,释放系统资源
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void test2() {
        String str = "";
        // 使用 System.in 创建 BufferedReader
        BufferedReader br = new BufferedReader(new
                InputStreamReader(System.in));
        System.out.println("输入字符, 按下 'q' 键退出。");
        // 读取字符
        do {
            try {
                str = (String) br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(str);
        } while (!"end".equals(str));
    }

    static void test1(A a) {
        a = new A();
        a.age = 20;
        System.out.println("test1方法中的age=" + a.age);
    }
}

class A {
    public int age = 0;
    public static int staticVarOfA;
}
