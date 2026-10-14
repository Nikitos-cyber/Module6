package Task10;


import java.nio.file.Path;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileInputStream;


public class Main {
    public static void main(String[] args) {
        Path fileInput = Path.of("C:\\Users\\Nikita\\Desktop\\data.txt");
        Path fileOutput = Path.of("C:\\Users\\Nikita\\Desktop\\output.txt");
        try(Scanner scanner = new Scanner(new FileInputStream(fileInput.toFile()));
        FileWriter writer = new FileWriter(fileOutput.toFile())){
            while (scanner.hasNextLine()){
                String[] nums = scanner.nextLine().split(" ");
                int x = Integer.parseInt(nums[0]);
                int y = Integer.parseInt(nums[1]);
                if(scanner.hasNextLine()) {
                    String[] numsNext = scanner.nextLine().split(" ");
                    int xNext = Integer.parseInt(numsNext[0]);
                    int yNext = Integer.parseInt(numsNext[1]);
                    System.out.println(((double)(xNext + x) * 0.5 * (double)(yNext - y)));
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
