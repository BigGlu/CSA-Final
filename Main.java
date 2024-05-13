import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[10];
        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        for (int i = 0; i < numLines; i++) {
            lines[i] = reader.readLine();
        }
        reader.close();

        for (String line : lines) {
            System.out.println(line);
        }

    }
}