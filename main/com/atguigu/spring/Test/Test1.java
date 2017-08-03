package main.com.atguigu.spring.Test;

/**
 * Created by Administrator on 2017/8/3 0003.
 */
public class Test1 extends Test {

    private String c;
    private String d;

    static {
        System.out.println("this is son static method!");
    }

    public Test1(String c, String d) {
        System.out.println("this is son constructor with parameters!");

        this.c = c;
        this.d = d;
    }

    public Test1() {
        System.out.println("this is son constructor without parameters!");
    }
}
