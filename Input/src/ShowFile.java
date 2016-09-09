import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class ShowFile {
    public static void main(String[] args) throws Exception {

        FileWriter write = new FileWriter("D:/text.txt",true);
        String text = "\n Hello World ";
        write.write(text);

        write.close();



        File fin = new File("D:/text.txt");
        BufferedReader f = new BufferedReader(new FileReader(fin));
        String line;
        while ((line = f.readLine()) != null) System.out.println(line);
        f.close();
    }


}

