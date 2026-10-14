package Task5;

import java.util.Locale;
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{

        File file = new File("C:\\Users\\Nikita\\Desktop\\data.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
        boolean isValid = true;
         while (scanner.hasNextLine()){
            isValid = isValid && isPalindrome(scanner.nextLine().trim());
         }
        scanner.close();
        System.out.println(isValid);

    }

    static boolean isPalindrome(String str){
        if(str.isEmpty())
            return false;
        int start = 0, end = str.length() - 1;
        str = str.toLowerCase(Locale.ROOT);

        while(true){

        while((str.charAt(start) < 'а'  || str.charAt(start) > 'я') && start < (str.length() -1) )
            start++;
        while((str.charAt(end) < 'а'  || str.charAt(end) > 'я') && end > 0)
            end--;

         if(str.charAt(start) != str.charAt(end))
            return false;
         else if(start >= end)
             return true;
            start++;
            end--;

        }
    }

}
