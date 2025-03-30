public class Product {

    private static String name;
    private static String productionDate;
    private static String manufacturer;
    private static String countryOfProduct;
    private static double price;
    private static boolean reserveStatus;

    public Product(String name, String productionDate, String manufacturer, String countryOfProduct,
                   double price, boolean reserveStatus) {
        this.name = name;
        this.productionDate = productionDate;
        this.manufacturer = manufacturer;
        this.countryOfProduct = countryOfProduct;
        this.price= price;
        this.reserveStatus = false;

    }

    public void reserve(){
        if (!reserveStatus) {
            reserveStatus = true;
        }
    }

   /* public static String getName() {return name;}

    public static void setName(String name) {
        Product.name = name;
    }

    public static String getProductionDate() {return productionDate;}

    public static void setProductionDate(String productionDate) {
        Product.productionDate = productionDate;
    }

    public static String getManufacturer() {return manufacturer;}

    public static void setManufacturer(String manufacturer) {
        Product.manufacturer = manufacturer;
    }

    public static String getCountryOfProduct() {return countryOfProduct;}

    public static void setCountryOfProduct(String countryOfProduct) {
        Product.countryOfProduct = countryOfProduct;
    }

    public static double getPrice() {return price;}

    public static void setPrice(double price) {
        Product.price = price;
    }

    public static boolean isReserveStatus() {return reserveStatus;}

    public static void setReserveStatus(boolean reserveStatus) {
        Product.reserveStatus = reserveStatus;
    }

    */


    public static void toPrint() {
        System.out.println(" Название товара: " + name + "\n Дата изготовления: " + productionDate +
                "\n Производитель: " + manufacturer + "\n Страна производства: " + countryOfProduct +
                "\n Цена: " + price + " у.е. " + "\n Наличие брони: " + reserveStatus + "\n");

    }

}