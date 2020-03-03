package com.company;



public class Human {
    public String firstName;
    public String lastName;
    protected Phone mobile;
    public Animal pet;
    private Double salary = 1200.00;
    private Car car;

public Double getsalary() {
    return salary;
}
public void risemysalary() {
    this.salary *=1.1;
}
public Car getCar() {
    return car;
}
public void setCar(Car car) throws Exception {
    if (car.value > this.salary *12) {
        throw new Exception ("nie masz siana");
    } else {
        this.car = car;
    }
}
}
