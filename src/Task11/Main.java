package Task11;

import java.nio.file.Path;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;

public class Main {
    public static void main(String[] args) {
        Path fileInput = Path.of("C:\\Users\\Nikita\\Desktop\\data.txt");
        Path fileOutput = Path.of("C:\\Users\\Nikita\\Desktop\\output.txt");
        try (Scanner scanner = new Scanner(new FileInputStream(fileInput.toFile()));
             FileWriter writer = new FileWriter(fileOutput.toFile())) {

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] operation = line.split(" ");
                int a = Integer.parseInt(operation[0]);
                int b = Integer.parseInt(operation[2]);
                switch (operation[1]) {
                    case "*":
                        writer.write(line + " = " + (a * b) + "\r\n");
                        break;
                    case "-":
                        writer.write(line + " = " + (a - b) + "\r\n");
                        break;
                    case "+":
                        writer.write(line + " = " + (a + b) + "\r\n");
                        break;
                }
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
