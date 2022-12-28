package task_3;

import java.util.ArrayList;
import java.util.List;

import javax.sound.sampled.Port;

import task_3.model.*;

public class Main {
    public static void main(String[] args) {
        Books Books1 = new Books("Искусство войны", "Сунь-цзы", 390.4, 2014, 100);
        Books Books2 = new Books("Наедине с собой", "Аврелий", 890.7, 2011, 311);
        Books Books3 = new Books("Так говорил Заратустра", "Ницше", 999.9, 2010, 800);
        Books Books4 = new Books("Диалоги", "Платон", 190.2, 2002, 560);
        Books Books5 = new Books("Политика", "Аристотель", 1200.2, 2010, 829);
        Books Books6 = new Books("Размышления", "Цицерон", 550.8, 2009, 140);

        List<Books> listBooks = new ArrayList<>();

        listBooks.add(Books1);
        listBooks.add(Books2);
        listBooks.add(Books3);
        listBooks.add(Books4);
        listBooks.add(Books5);
        listBooks.add(Books6);
        
        for (int i = 0; i < listBooks.size(); i++) {
            Books book = listBooks.get(i);
            if(book.getAuthor().indexOf("А") != -1 && Books.checkSimple(book.getPages()) && book.getYear() > 2010){
                System.out.println("Книги, которые вы искали: " + book.getName());
             
                
            }
        }
    }
}

