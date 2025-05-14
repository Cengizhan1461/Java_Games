package at.cengizhan.Amazon;

import at.cengizhan.Amazon.GUI.GUI;
import at.cengizhan.Amazon.GUI.GUI1;
import at.cengizhan.Amazon.Product.Phone;
import at.cengizhan.Amazon.Product.Shoe;

public class Main {
    public static void main(String[] args) {
        GUI gui = new GUI1();
        gui.addProduct((new Shoe(1, 99, "Nike Air Force", "Lederschuhe")));
        gui.addProduct(new Phone(2, 999, "IPhone", "Handy aus Originalem Titan"));
        gui.start();
    }
}
