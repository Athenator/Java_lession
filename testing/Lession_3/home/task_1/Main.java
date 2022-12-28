package task_1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import task_1.model.Product;


public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Абрикосы, высший сорт ", 2550.0, 1);
        Product product2 = new Product("Яблоки, высший сорт", 1300.50, 2);
        Product product3 = new Product("Картофель, высший сорт", 230.20, 3);
        Product product4 = new Product("Апельсины, высший сорт", 2130.90, 2);
        Product product5 = new Product("Морковь", 260.80, 1);
        Product product6 = new Product("Арбузы, высший сорт", 660.80, 4);

        List<Product> listProduct = new ArrayList<>();

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        listProduct.add(product6);
        Double max = 0.0;
        for (int i = 0; i < listProduct.size(); i++) {
            Product product = listProduct.get(i);
            if((product.getSort() == 1 || product.getSort() == 2) && product.getName().indexOf("высший") != -1){
                max = Math.max(max, product.getPrice());
                
            }
        }
        System.out.println("Наибольшая цена, запрашиваемого товара = " + max);
    }
}
