package Task9;

import java.nio.file.Path;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        solution("Центральный", 2018, 2019);
    }
    public static void solution(String district, int fromYear, int toYear) {
        Path fileInput = Path.of("C:\\Users\\Nikita\\Desktop\\data.txt");
        Path fileOutput = Path.of("C:\\Users\\Nikita\\Desktop\\output.txt");
       try(Scanner scanner = new Scanner(new FileInputStream(fileInput.toFile()));
           FileWriter writer = new FileWriter(fileOutput.toFile())){
           String[] header = scanner.nextLine().split(";");
           int indexFromYear = 0, indexToYear = 0;
            for (int i = 2; i < header.length; ++i){
                if(Integer.parseInt(header[i]) == fromYear)
                    indexFromYear = i;
                else  if(Integer.parseInt(header[i]) == toYear)
                    indexToYear = i;
            }
           writer.write("Part; %d;%d\r\n".formatted(fromYear,toYear));
            while(scanner.hasNextLine()){
                String[] line = scanner.nextLine().trim().split(";");
                if(line[1].equals(district)){
                    if(Double.parseDouble(line[indexFromYear]) < 0) {
                        System.out.println("fromYear == 0");
                        break;
                    }
                    if((Double.parseDouble(line[indexToYear]) / Double.parseDouble(line[indexFromYear])) > 0.04){
                                    writer.write(line[0] + ";" + line[indexFromYear] + ";" + line[indexToYear] );
                                    writer.write("\r\n");
                    }
                }
            }

       }catch (IOException e){
           System.out.println(e.getMessage());
       }
    }
}
