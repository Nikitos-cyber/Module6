package Task6;

import  java.util.Scanner;
import  java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
public class Main {
    public static void main(String[] args) {
        File fileInput = new File("C:\\Users\\Nikita\\Desktop\\data.txt");
        File fileOutput = new File("C:\\Users\\Nikita\\Desktop\\output.txt");
        try( BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileOutput))){
        Scanner scanner = new Scanner(new FileInputStream(fileInput));
            int num = scanner.nextInt();
            int valueLine = valueLine(fileInput);

            scanner.nextLine();
            bufferedWriter.write(String.valueOf(valueLine));
            bufferedWriter.newLine();

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                if(line.length() == valueLine || line.length() == valueLine - num || line.length() == valueLine + num){
                    bufferedWriter.write(line);
                    bufferedWriter.newLine();
                }
            }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static int valueLine(File fileInput){
        int sumLengthLine = 0;
        int valLine = 0;
        try(Scanner scanner = new Scanner(new FileInputStream(fileInput))){

        scanner.nextLine();
            while(scanner.hasNextLine()){
                sumLengthLine += scanner.nextLine().length();
                valLine ++;
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return sumLengthLine / valLine;
    }
}


