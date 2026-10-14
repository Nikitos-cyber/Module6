package Task12;

import java.nio.file.Path;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String name = "Cherevik";
        Path fileInput = Path.of("C:\\Users\\Nikita\\Desktop\\data.txt");
        Path fileOutput = Path.of("C:\\Users\\Nikita\\Desktop\\output.txt");
        try(BufferedReader reader  = new BufferedReader(new FileReader(fileInput.toFile()));
        FileWriter writer = new FileWriter(fileOutput.toFile())){
            double sum = 0;
            reader.readLine();
            String line;
            while((line = reader.readLine()) != null){
                String[] lineParse = line.split(";");
                if(lineParse[1].equals(name)){
                    int d = Integer.parseInt(lineParse[3]) * Integer.parseInt(lineParse[4]);
                    sum += d;
                    writer.write(lineParse[2] + ", "  + lineParse[3] + ", " + lineParse[4] + ", " + d  + "\r\n");
                }
            }

            writer.write("tax: " + sum * 0.15 + "\r\n");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
