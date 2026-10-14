package Task7;

import java.io.File;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        File fileInput = new File("C:\\Users\\Nikita\\Desktop\\data.txt");
        File fileOutput = new File("C:\\Users\\Nikita\\Desktop\\output.txt");
        try(FileWriter writer = new FileWriter(fileOutput)){
        Scanner scanner = new Scanner(new FileInputStream(fileInput));
            int step = scanner.nextInt();
            scanner.nextLine();
            while(scanner.hasNextLine()){
                int num = scanner.nextInt();
                writer.write(String.valueOf( num / step));
                writer.write(" " + num % step);
                writer.write("\r\n");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }


    }
}
