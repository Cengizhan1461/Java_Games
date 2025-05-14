package at.cengizhan.Amazon.GUI;

import at.cengizhan.Amazon.Product.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GUI1 implements GUI{
    private Scanner scanner = new Scanner(System.in);
    private List<Product> procuts = new ArrayList<>();

    @Override
    public void start() {
        while(true){
            System.out.println("1) Show all Products");
            System.out.println("2) Show all Products");
            int selection = scanner.nextInt();

            if(selection == 1){
                for (Product product:this.procuts){
                    System.out.println(product.getTitel());
                    System.out.println(product.getID());
                    System.out.println(product.getDescribtion());
                    System.out.println(product.getPrice());
                }
            }
        }

    }

    @Override
    public void addProduct(Product product) {
        this.procuts.add(product);

    }
}
