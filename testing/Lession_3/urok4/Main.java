package urok4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str = "qwr, wqrsa wrq!!";
        List<String> strList = new ArrayList<>();
        strList.addAll(List.of(str.split(" ")));

        System.out.println("Size = " + strList.size());
    }

}
