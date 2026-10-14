package Task8;

import java.io.File;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;


public class Main {
    public static void main(String[] args) {
        solution(80);
    }

    public static void solution(double num) {
        File fileInput = new File("C:\\Users\\Nikita\\Desktop\\data.txt");
        try (Scanner scanner = new Scanner(new FileInputStream(fileInput))) {
            scanner.nextLine();
            while (scanner.hasNextLine()){
                String[] line = scanner.nextLine().trim().split(";");
                if(Double.parseDouble(line[2]) >= num)
                    System.out.println(line[0]);
            }


        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
