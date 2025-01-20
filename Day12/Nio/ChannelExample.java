package Day12.Nio;

import java.nio.CharBuffer;

public class ChannelExample {
    public static void main(String[] args) {
        CharBuffer buffer = CharBuffer.allocate(8);
        String text = "Vishnu";
        for(int i =0;i<text.length();i++)
        {
            char c = text.charAt(i);
            buffer.put(c);
        }
        int buffPos = buffer.position();
        System.out.println("The current postion after adding text to buffer: "+buffPos);

        buffer.flip();
        buffPos = buffer.position();
        System.out.println("The current postion after using flip(): "+buffPos);

        int limit = buffer.limit();
        System.out.println("The buffer limit is; "+limit);

        while(buffer.hasRemaining())
        {
            System.out.print(buffer.get());
            System.out.println(buffer.limit());
        }
    }
}
