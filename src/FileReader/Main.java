package FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int countLine = 0;
        File file = new File("C:\\Users\\Nikita\\Desktop\\text.txt");
        try(FileReader fr = new FileReader(file)){
            BufferedReader buffR = new BufferedReader(fr);

            while((buffR.readLine()) != null){
                countLine++;
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(countLine);
    }
}
