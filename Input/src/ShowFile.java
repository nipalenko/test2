import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ShowFile {
    public static void main(String[] args) throws Exception {

        File fin = new File("D:/text.txt");
        BufferedReader f = new BufferedReader(new FileReader(fin));
        String line;
        while ((line = f.readLine()) != null) System.out.println(line);
        f.close();
    }


}

