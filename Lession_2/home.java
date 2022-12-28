import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

public class home {
    public static void main(String[] args) {
        Path path = Paths.get("home_1.txt");

        String contents = null;
        try {
            contents = Files.readString(path, StandardCharsets.UTF_8);
            String[] words = contents.split(",");
            Map<String, String> map = new LinkedHashMap<>();
            for (String s : words) {
                String first = s.trim().split(":")[1];
                String second = s.trim().split(":")[0];
                map.put(second, first);
            }
            System.out.println(getQuery(map));

        }

        catch (IOException ex) {
        }
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder WHERE = new StringBuilder();
        WHERE.append("SELECT * FROM students WHERE ");
        for (Map.Entry<String, String> pair : params.entrySet()) {
            if (pair.getValue() != null) {
                WHERE.append(pair.getKey() + " = " + "" + pair.getValue() + "" + " and ");
            }
        }
        WHERE.delete(WHERE.length() - 4, WHERE.length());
        return WHERE.toString();
    }

}

