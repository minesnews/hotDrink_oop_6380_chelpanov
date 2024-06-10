package practice;

import java.time.LocalDate;

public class Product {

    protected String name;
    protected double price;
    protected LocalDate releaseDate;
    protected int temperature;
    protected double volume;

    public Product(String name, double price, LocalDate releaseDate, double volume, int temperature) {
        this.name = name;
        this.price = price;
        this.releaseDate = releaseDate;
        this.temperature = temperature;
        this.volume = volume;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getVolume() {
        return volume;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                ", temperature=" + temperature +
                ", volume=" + volume +
                '}';
    }
}
