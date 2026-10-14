package Task3;


import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        File file = new File("C:\\Users\\Nikita\\Desktop\\data.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
        long result = 1;
        int num = 0;
        String [] dividers  = null;
        while(scanner.hasNextLine()){
            num = Integer.parseInt(scanner.nextLine().trim());
            dividers = scanner.nextLine().trim().split("\\s");
        }
        for(int i = 1; i <= num; ++i){
            for(String item : dividers){
                if(i % Integer.parseInt(item) == 0)
                    result *= i;
            }
        }
        System.out.println(result);
        scanner.close();
    }
}
