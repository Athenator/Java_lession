
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class home_2 {
    public static void main(String[] args) {
        String filePath = "log.txt";
        int[] array = { 50, 3, 53, 144, 2, 201 };
        int temp;
        try (final FileWriter writer = new FileWriter(filePath, false)) {
            for (int i = array.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                        final String s = Arrays.toString(array);
                        writer.write(s);
                        writer.write(System.lineSeparator());
                        System.out.println(s);
                    }

                    System.out.println(Arrays.toString(array));
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }


}
