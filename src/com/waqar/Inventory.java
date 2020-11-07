package com.waqar;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        this.guitars = new ArrayList<>();

    }

    public void addGuitar(String serialNumber,
                          double price,
                          String builder,
                          String model,
                          String type,
                          String backWood,
                          String topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }
}
