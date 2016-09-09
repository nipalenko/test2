import java.io.*;

/**
 * Created by user on 09.09.16.
 */
class CompFile {
    public static void main(String[] args) throws IOException {


        try {
            File fin = new File("D:/text.txt");
            BufferedReader f = new BufferedReader(new FileReader(fin));
            File fin1 = new File("D:/text2.txt");
            BufferedReader f1 = new BufferedReader(new FileReader(fin1));
            String line;
            String line2;
            line = f.readLine();
            line2 = f1.readLine();

            if (line.equals(line2)) {
                System.out.println("Содержимое файлов одинаковое");
            } else {
                System.out.println("Содержимое файлов разное");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("Файлы не найдены");
        }
    }
}
