import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Product product1 = new Product("Xiaomi", "12.03.2023.", "Xiaomi",
                "China", 12.2, true);
        Product.toPrint();

        Product[] productsArray = new Product[5];
        productsArray[0] = new Product("Samsung TV_32' ", "21.12.2015.", "Samsung corp.",
                "China", 250, true);
        productsArray[1] = new Product("Samsung S20+ ", "04.05.2020.", "Samsung corp. ",
                "Indonesia", 800, true);
        productsArray[2] = new Product("Xiaomi 11 Lite 5G ", "12.03.2023.", "Xiaomi",
                "China", 12.2, true);
        productsArray[3] = new Product("Apple iPhone 15", "02.06.2023", "Apple inc.",
                "China", 900, false);
        productsArray[4] = new Product("HONOR Magic 7Pro", "15.10.2024.", "Honor",
                "China", 1200, true);

        Park.Attraction attraction = new Park.Attraction("Автодром", "09.00 - 17.00", 4.50);
    }
}