import java.io.FileWriter;
import java.io.IOException;

public class seminar {
    public static void main(String[] args) {

        String line = "aaaabbbcdd";
        StringBuilder newString = new StringBuilder();
        char first = line.charAt(0);
        int count = 1;

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == first) { // Находим повторяющийся символ
                count++;
            }
            else {
                // count = line.charAt(i);
                newString.append(count);
                newString.append(first);
                first = line.charAt(i);
                count = 1;
                }

            }
        System.out.println(newString);
        }


        private static String repeatTest(String word) {
            int x = 100;
            StringBuilder build2 = new StringBuilder();
            for (int i = 0; i < x; i++) {
                build2.append(word);
            }
            return build2.toString();
            }
    
        private static void file() {
            try(FileWriter writer = new FileWriter("notes3.txt", false))
            {
                String text = repeatTest("TEST");
                writer.write(text);
                writer.flush();
            }
            catch(IOException ex){
                 
                System.out.println(ex.getMessage());
            } 
            
        }
    
    }

