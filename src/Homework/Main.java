package Homework;

import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Main {
    public static void main(String[] args) {
        Path subject = Path.of("C:\\Users\\Nikita\\Desktop\\Text Document.txt");
        Path target = Path.of("C:\\Users\\Nikita\\Desktop\\TextCopy.txt");
        try(FileChannel inputChannel = FileChannel.open(subject, StandardOpenOption.READ);
            FileChannel outputChannel = FileChannel.open(target,StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)){
            ByteBuffer buffer = ByteBuffer.allocate(8192);
            int ch;
            while((ch = inputChannel.read(buffer)) != -1){
                buffer.flip();
                while(buffer.hasRemaining()){
                    outputChannel.write(buffer);
                }

                buffer.clear();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
