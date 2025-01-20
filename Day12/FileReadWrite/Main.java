package Day12.FileReadWrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public void writeFile()
    {
        BufferedWriter bw = null;
        try{
            bw = new BufferedWriter(new FileWriter("D:\\Skills\\Mindbridge Training\\src\\Day12\\FileReadWrite\\name.txt"));
            String name = "Vishnupriyan";
            bw.write(name);
            System.out.println("The name has written successfully");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try{
                if(bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        Main main = new Main();
        main.writeFile();
    }
}
