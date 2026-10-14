package Task2;

import  java.util.Scanner;
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args)  {
        int words = 0;

       try(Scanner scanner =  new Scanner(new FileInputStream("C:\\Users\\Nikita\\Desktop\\text.txt"))){
           while(scanner.hasNextLine()){
            String line = scanner.nextLine().trim();
            if(line.isEmpty())
                continue;
            String[] word = line.split("\\s+");
            words += word.length;
           }
       }catch (IOException e){
           System.out.println(e.getMessage());
       }
        System.out.println(words);
    }
}
