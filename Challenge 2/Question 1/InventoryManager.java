import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class InventoryManager {
    public static void main (String[] args){
        List<Product> products = new ArrayList<>();

        // init value for product
        products.add(new Product("Laptop", 999.99, 5));
        products.add(new Product("Smartphone", 499.99, 10));
        products.add(new Product("Tablet", 299.99, 0));
        products.add(new Product("Smartwatch", 199.99, 3));

        // calculate the total inventory value
        double totalInventoryValue = totalInventoryValue(products);
        System.out.printf("Total Inventory Value: %.2f%n", totalInventoryValue);

        // find the most expensive product
        String mostExpensiveProduct = mostExpensiveProduct(products);
        System.out.println("Most Expensive Product: " + mostExpensiveProduct);

        // check if "Headphones" is in stock
        boolean isHeadphonesInStock = isProductInStock(products, "Headphones");
        System.out.println("Is 'Headphones' in stock?: " + isHeadphonesInStock);

        // sort products 
        sortProducts(products);

        // show products after sorted
        System.out.println("Sorted Product List:");
        for (Product product : products) {
            System.out.printf("Name: %s, Price: %.2f, Quantity: %d%n",
                product.getName(), product.getPrice(), product.getQuantity());
        }
    }

    public static double totalInventoryValue(List<Product> products){
        double totalValue = 0;
        for (Product product : products) {
            totalValue += product.getInventoryValue();
        }
        return totalValue;
    }

    public static String mostExpensiveProduct(List<Product> products){
        Product mostExpensive = null;
        for (Product product : products) {
            if (mostExpensive == null || product.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = product;
            }
        }
        return mostExpensive != null ? mostExpensive.getName() : "No products available";
    }

    public static boolean isProductInStock(List<Product> products, String productName) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(productName) && product.getQuantity() > 0) {
                return true;
            }
        }
        return false;
    }

    public static void sortProducts(List<Product> products) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose sorting option:");
        System.out.println("1. By price");
        System.out.println("2. By quantity");
        int option = scanner.nextInt();

        System.out.println("Choose sorting order:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        int order = scanner.nextInt();

        Comparator<Product> comparator = null;

        if (option == 1) {
            comparator = Comparator.comparingDouble(Product::getPrice);
        } else if (option == 2) {
            comparator = Comparator.comparingInt(Product::getQuantity);
        } else {
            System.out.println("Invalid option selected. Defaulting to price.");
            comparator = Comparator.comparingDouble(Product::getPrice);
        }

        if (order == 2) {
            comparator = comparator.reversed();
        }

        products.sort(comparator);
        System.out.println("Products sorted successfully!");

        scanner.close();
    }
}
