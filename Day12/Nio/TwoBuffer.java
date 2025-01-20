package Day12.Nio;

import java.io.*;
import java.nio.CharBuffer;

public class TwoBuffer {
    public static void main(String[] args){
        String source = "D:\\Skills\\Mindbridge Training\\src\\Day12\\Nio\\Source.txt";
        String destination = "D:\\Skills\\Mindbridge Training\\src\\Day12\\Nio\\Destination.txt";
        int size = 1024;
        CharBuffer buffer = CharBuffer.allocate(size);
        FileInputStream inputStream = null;
        InputStreamReader reader = null;
        FileOutputStream outputStream = null;
        OutputStreamWriter writer = null;
        try {
            inputStream = new FileInputStream(source);
            reader = new InputStreamReader(inputStream);
            outputStream = new FileOutputStream(destination);
            writer = new OutputStreamWriter(outputStream);
            int c;
            while ((c = reader.read()) != -1)
            {
                if(!buffer.hasRemaining())
                {
                    buffer.flip();
                    while (buffer.hasRemaining())
                    {
                        writer.write(buffer.get());
                    }
                    buffer.clear();
                }
                buffer.put((char) c);
            }
            if(buffer.position() > 0) {
                buffer.flip();
                while (buffer.hasRemaining()) {
                    writer.write(buffer.get());
                }
            }
            System.out.println("Successfully source file is copied to Destination");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) writer.close();
                if (outputStream != null) outputStream.close();
                if (reader != null) reader.close();
                if (inputStream != null) inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
