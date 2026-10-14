package Task1;

import OOPTask3.Dog;

import  java.io.IOException;
import  java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        String lineList[];
        double result = 0;
        File file = new File("C:\\Users\\Nikita\\Desktop\\receipt.txt");
        try (BufferedReader buff = new BufferedReader(new FileReader(file))){
            String line;
            while((line = buff.readLine()) != null){
                lineList =  line.split(";");
                 result += Integer.parseInt(lineList[1]) * Double.parseDouble(lineList[2]);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.printf("%.2f",result);
    }
}
