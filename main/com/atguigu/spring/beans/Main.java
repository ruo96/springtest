package main.com.atguigu.spring.beans;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class Main {
    public static void main(String[] args) {

       /* //创建HelloWorld的一个对象
        HelloWorld helloWorld = new HelloWorld();
        //为name属性赋值
        helloWorld.setName("atguigu");*/

       //1,创建spring的ioc容器对象
        //ApplicationContext代表容器
        //ClassPathXmlApplicationContext是ApplicationContext的实现类，从类路径下加载配置文件
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2.从ioc容器中获取bean示例  里面的参数是对应的beanid，里面是重载
        //这个方式比较好，利用id定位到ioc容器中的bean
//        HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
        //这样做是否有缺点，就是xml里面如果配置了两个相同类型的，那就不行了，要求ioc容器中只有一个该类型的bean
//        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
//        System.out.println(helloWorld);


        //调用hello方法
//        helloWorld.hello();

        Car car = (Car) ctx.getBean("car");
        System.out.println(car);

        Car car2 = (Car) ctx.getBean("car2");
        System.out.println(car2);

        Person person = (Person) ctx.getBean("person3");
        System.out.println(person);

    }
}
