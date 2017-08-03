package main.com.atguigu.spring.Test;

/**
 * Created by Administrator on 2017/8/3 0003.
 */
public class Test {
    private String a;
    private String b;

    static {
        System.out.println("this is super static method!");
    }


    public Test() {
        System.out.println("this is super constructor without parameters");
    }
}
