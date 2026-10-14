package FileCopyNio;

import java.nio.file.Path;
import java.nio.channels.FileChannel;
import java.nio.ByteBuffer;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main {
    public static void main(String[] args) throws IOException {
        Path sourcePath = Path.of("C:\\Users\\Nikita\\Desktop\\data.txt");
        Path targetPath = Path.of("C:\\Users\\Nikita\\Desktop\\");
        try(FileChannel inChannel = FileChannel.open(sourcePath, StandardOpenOption.READ)) {
            try(FileChannel outChannel = FileChannel.open(targetPath, StandardOpenOption.CREATE, StandardOpenOption.WRITE, StandardOpenOption.TRUNCATE_EXISTING)) {
            ByteBuffer buffer = ByteBuffer.allocate(8192);

            while(true){
                int bytesRead = inChannel.read(buffer);
                if(bytesRead == -1)
                    break;
                buffer.flip();
                while(buffer.hasRemaining()){
                    outChannel.write(buffer);
                }
                buffer.clear();
            }


        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        Files.copy(sourcePath,targetPath, StandardCopyOption.REPLACE_EXISTING);

    }
}
