package com.company;

public class Main {

    public static void main(String[] args) throws Exception {


        Human me = new Human();
        me.firstName = "Grzegorz";
        me.lastName = "Lewandowski";
        Animal dog = new Animal(  "dog");
        dog.name = "max";



        Car wolf = new Car();
        wolf.producer = "Audi";
        wolf.model = "rs3";
        wolf.yearofproduction = 2019;
        wolf.setPlates( "G1 WOLF");

        me.setCar(wolf);

        System.out.println(me.getCar().getPlates());
        System.out.println(me.getsalary());


























    }
}
