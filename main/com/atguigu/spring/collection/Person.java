package main.com.atguigu.spring.collection;

import main.com.atguigu.spring.beans.Car;

import java.util.List;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class Person {

    private String name;
    private int age;

    private List<Car> cars;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", cars=").append(cars);
        sb.append('}');
        return sb.toString();
    }

    public Person(String name, int age, List<Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public Person() {
    }
}
