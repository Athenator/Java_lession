package task_2;

import java.util.ArrayList;
import java.util.List;

import task_2.model.Product;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Абрикос", "Узбекистан", 300.2, 1, 500.5);
        Product product2 = new Product("Картофель", "Россия", 250.7, 4, 900.4);
        Product product3 = new Product("Мандарин", "Кавказ", 350.2, 2, 1000.0);
        Product product4 = new Product("Яблоко", "Казахстан", 150.2, 3, 250.5);
        Product product5 = new Product("Пшеница", "Дагестан", 600.2, 1, 300.5);
        Product product6 = new Product("Киви", "Татарстан", 1000.5, 4, 440.6);

        List<Product> listProduct = new ArrayList<>();

        listProduct.add(product1);
        listProduct.add(product2);
        listProduct.add(product3);
        listProduct.add(product4);
        listProduct.add(product5);
        listProduct.add(product6);
        Integer searchSort = 1;
        Double min = 100000.0; // Буду рад, если подскажете как правильно инициализировать переменную
        for (int i = 0; i < listProduct.size(); i++) {
            Product product = listProduct.get(i);
            if (product.getSort().equals(searchSort)) {
                min = Math.min(min, product.getPrice());
            }
            if (product.getPrice().equals(min)) {
                System.out.println("Наименование товара заданного сорта с наименьшей ценой = "
                        + product.getName());
            }

        }
        System.out.println("Минимальное значение цены этого сорта = " + min);
    }
}
