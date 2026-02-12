import java.util.ArrayList;
import java.util.List;


class Product {
    private String name; 
    private double price; 

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}

class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) { 
        products.add(product);
        System.out.println(product.getName() + " added.");
    }

    public void removeProduct(String productName) { 
        products.removeIf(p -> p.getName().equalsIgnoreCase(productName));
        System.out.println(productName + " removed.");
    }

    public double calculateTotalCost() { 
        double total = 0;
        for (Product p : products) total += p.getPrice();
        return total;
    }

    public void displayCart() { 
        System.out.println("\n--- Shopping Cart ---");
        for (Product p : products) System.out.println("- " + p);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}

public class ShoppingSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        cart.addProduct(new Product("Laptop", 999.99));
        cart.addProduct(new Product("Mouse", 25.50));
        
        cart.displayCart();
        
        cart.removeProduct("Mouse");
        cart.displayCart();
    }
}