package main.com.atguigu.spring.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created by wrh
 * @Description:
 * @Date: Created in 下午 3:41 2017/8/3 0003
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-autowire.xml");

        Person persons = (Person) ctx.getBean("person");
        System.out.println(persons);
    }
}
