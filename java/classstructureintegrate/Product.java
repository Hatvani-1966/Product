package classstructureintegrate;

import java.util.Scanner;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void increasePrice (int amount){
        this.price +=amount;
    }

    public void dereasePrice (int amount){
        this.price -=amount;
    }

    public static void main(String[] args) {
        System.out.println( "type in product name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println( "type in product price");
        int price = scanner.nextInt();

        Product product = new Product(name, price);
        product.increasePrice(10);
        System.out.println(product.getPrice());
    }
}
