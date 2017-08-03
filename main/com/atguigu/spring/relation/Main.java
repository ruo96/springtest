package main.com.atguigu.spring.relation;

import main.com.atguigu.spring.autowire.Address;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Created by wrh
 * @Description:
 * @Date: Created in 下午 5:43 2017/8/3 0003
 * @Modified By:
 */
public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans-relation.xml");

        Address address = (Address) ctx.getBean("address");
        System.out.println(address);

        Address address2 = (Address) ctx.getBean("address2");
        System.out.println(address2);
    }



}
