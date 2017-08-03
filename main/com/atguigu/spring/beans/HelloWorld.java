package main.com.atguigu.spring.beans;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class HelloWorld {

    private String name;

    //这个也会在启动的时候调用 顺序2
    public void setName(String name){
        System.out.println("setName: " + name);
        this.name = name;
    }

    public void hello(){
        System.out.println("hello: " + name);
    }

    //这个会在启动的时候调用  顺序1
    public HelloWorld(){
        System.out.println("HelloWorld's constructor");
    }

    //反转资源的控制方向  不用new 不用factory 现在采用依赖注入，自动获取对象
}
