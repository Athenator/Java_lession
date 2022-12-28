package read;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) throws Exception{
        ReadInput readF = new ReadInput();
        // readF.inputReader();
        PowAndWrite ts = new PowAndWrite();

        ts.computing(readF.inputReader("a"),readF.inputReader("b"));
    }


}