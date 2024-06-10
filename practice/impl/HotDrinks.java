package practice.impl;

import java.time.LocalDate;

import practice.Product;

public class HotDrinks extends Product{
    private int temperature;

    public HotDrinks(String name, double price, LocalDate releaseDate, int temperature, double volume) {
        super(name, price, releaseDate, volume, temperature);
        this.temperature = temperature;
    }
    
    public int getTemperature() {
        return temperature;
    }
}
