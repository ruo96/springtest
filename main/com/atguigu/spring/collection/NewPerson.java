package main.com.atguigu.spring.collection;

import main.com.atguigu.spring.beans.Car;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/8/2 0002.
 */
public class NewPerson {

    private String name;
    private int age;

    private Map<String,Car> cars;

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

    public Map<String, Car> getCars() {
        return cars;
    }

    public void setCars(Map<String, Car> cars) {
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

    public NewPerson(String name, int age, Map<String, Car> cars) {
        this.name = name;
        this.age = age;
        this.cars = cars;
    }

    public NewPerson() {
    }
}
