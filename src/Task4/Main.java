package Task4;


import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Nikita\\Desktop\\data.txt");
        File fileOut = new File("C:\\Users\\Nikita\\Desktop\\output.txt");
        FileWriter fw = new FileWriter(fileOut, StandardCharsets.UTF_8);
        Scanner scanner = new Scanner(new FileInputStream(file));
        int count = 1, num = 0, countLine = 0;
        while (scanner.hasNextLine()) {
            num = Integer.parseInt(scanner.nextLine().trim());
            if (count == num) {
                fw.write(String.valueOf(num));
                fw.write("\n");
                countLine++;
            }
            count++;
        }
        if (countLine == 0)
            fw.write(String.valueOf(0));
        scanner.close();
        fw.close();
    }
}
