package File;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        File file = new File("C:\\Users\\Nikita\\Desktop\\sys-admidminstration-praktical-experience.txt");
        try(BufferedReader buff = new BufferedReader(new FileReader(file))){
            String str;
            while((str = buff.readLine()) != null)
                count++;
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

        System.out.printf("Количество строк в файле: %d", count);
    }


}
