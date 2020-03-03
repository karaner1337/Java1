package com.company;

public class Car {


    public double value = 4000;
    String producer;
    String model;
    Integer yearofproduction;
    private String plates;

    public String getPlates() {
        return plates;
    }

    public void setPlates(String plates) throws Exception {
        if (plates.length() > 8) {
            throw new Exception();

        } else {
            this.plates = plates;

        }
    }


}


