import java.io.*;

public class Main {
    public static void main(String[] args) {

        String[] lines = new String[10];
        try {
            BufferedReader reader = new BufferedReader(new FileReader("./Resources/example.txt"));
            for (int i = 0; i < 10; i++) {
                lines[i] = reader.readLine();
            }
            reader.close();
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) { //took me so long to find out I had to add these
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

    }
}
