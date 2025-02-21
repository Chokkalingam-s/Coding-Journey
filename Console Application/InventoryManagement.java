import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;
    private int soldQuantity;

    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.soldQuantity = 0;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSoldQuantity() {
        return soldQuantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increaseSoldQuantity(int quantity) {
        this.soldQuantity += quantity;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Available Quantity: " + quantity);
        System.out.println("Sold Quantity: " + soldQuantity);
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[10]; // Array to hold up to 10 products
        int productCount = 0;
        double totalSales = 0;

        while (true) {
            System.out.println("\n** Welcome to eMart Grocery Shop Inventory Management System **");
            System.out.println("1. Add a new product");
            System.out.println("2. Update product quantity");
            System.out.println("3. Sell a product");
            System.out.println("4. Restock a product");
            System.out.println("5. Display product details");
            System.out.println("6. Display inventory list");
            System.out.println("7. Display total sales");
            System.out.println("8. Remove a product");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    if (productCount < 10) {
                        System.out.print("Enter product ID: ");
                        String productId = scanner.next();
                        System.out.print("Enter product name: ");
                        String productName = scanner.next();
                        System.out.print("Enter price: ");
                        double price = scanner.nextDouble();
                        System.out.print("Enter initial quantity: ");
                        int initialQuantity = scanner.nextInt();
                        products[productCount] = new Product(productId, productName, price, initialQuantity);
                        productCount++;
                        System.out.println("Product added successfully.");
                    } else {
                        System.out.println("Maximum product limit reached.");
                    }
                    break;
                case 2:
                    System.out.print("Enter product ID: ");
                    String updateProductId = scanner.next();
                    Product updateProduct = findProduct(products, updateProductId);
                    if (updateProduct != null) {
                        System.out.print("Enter new quantity: ");
                        int newQuantity = scanner.nextInt();
                        updateProduct.setQuantity(newQuantity);
                        System.out.println("Quantity updated successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter product ID: ");
                    String sellProductId = scanner.next();
                    Product sellProduct = findProduct(products, sellProductId);
                    if (sellProduct != null) {
                        System.out.print("Enter quantity to sell: ");
                        int sellQuantity = scanner.nextInt();
                        if (sellQuantity <= sellProduct.getQuantity()) {
                            sellProduct.setQuantity(sellProduct.getQuantity() - sellQuantity);
                            sellProduct.increaseSoldQuantity(sellQuantity);
                            double totalSaleAmount = sellQuantity * sellProduct.getPrice();
                            totalSales += totalSaleAmount;
                            System.out.println("Sale successful. Total amount: $" + totalSaleAmount);
                        } else {
                            System.out.println("Insufficient quantity.");
                        }
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 4:
                    System.out.print("Enter product ID: ");
                    String restockProductId = scanner.next();
                    Product restockProduct = findProduct(products, restockProductId);
                    if (restockProduct != null) {
                        System.out.print("Enter quantity to restock: ");
                        int restockQuantity = scanner.nextInt();
                        restockProduct.setQuantity(restockProduct.getQuantity() + restockQuantity);
                        System.out.println("Restock successful.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 5:
                    System.out.print("Enter product ID: ");
                    String displayProductId = scanner.next();
                    Product displayProduct = findProduct(products, displayProductId);
                    if (displayProduct != null) {
                        displayProduct.displayProductDetails();
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 6:
                    displayInventory(products);
                    break;
                case 7:
                    System.out.println("Total Sales: $" + totalSales);
                    break;
                case 8:
                    System.out.print("Enter product ID: ");
                    String removeProductId = scanner.next();
                    boolean removed = removeProduct(products, removeProductId);
                    if (removed) {
                        System.out.println("Product removed successfully.");
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 9:
                    System.out.println("Thank you for using our inventory management system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static Product findProduct(Product[] products, String productId) {
        for (Product product : products) {
            if (product != null && product.getProductId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    private static void displayInventory(Product[] products) {
        System.out.println("\nInventory List:");
        for (Product product : products) {
            if (product != null) {
                System.out.println("---------------------");
                product.displayProductDetails();
            }
        }
        System.out.println("---------------------");
    }

    private static boolean removeProduct(Product[] products, String productId) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getProductId().equals(productId)) {
                // Shift elements to the left to remove the product
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[products.length - 1] = null; // Set the last element to null
                return true;
            }
        }
        return false;
    }
}