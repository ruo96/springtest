package main.com.atguigu.spring.autowire;



/**
 * Created by Administrator on 2017/8/3 0003.
 */
public class Person {

    private String name;
    private Address address;

    private Car car;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", address=").append(address);
        sb.append(", car=").append(car);
        sb.append('}');
        return sb.toString();
    }
}
