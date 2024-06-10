package practice;

//import practice.impl.BottleOfWater;
import practice.impl.HotDrinkVM;
import practice.impl.HotDrinks;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        Product kappuchino = new HotDrinks(
            "Капучино",
            50,
            LocalDate.of(2024, 5, 1),
            100,
            0.5
        );
        Product Latte = new HotDrinks(
            "Латте",
            90,
            LocalDate.of(2023, 4, 4),
            80,
            0.3
        );
        VendingMachine vhot = new HotDrinkVM();

        System.out.println(vhot.getProducts());

        vhot.addProducts(List.of(kappuchino, Latte));

        

        System.out.println(vhot.getProducts());


    }
}