import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by user on 13.09.16.
 */
 class RandomAccessDemo {
    public static void main (String[] args) throws IOException {
        double[] data = {11.0, 9.0, 8.0, 11.9, 10.0, 2.0, 3.0};
        double d;
        RandomAccessFile data1 = new RandomAccessFile("direct.dat", "rw");
        for (int i = 0; i < data.length; i++) {
            data1.writeDouble(data[i]);
        }
        for (int i = 0;i < data.length; i++) {
            data1.seek(8*i);
            d = data1.readDouble();
            System.out.print(d + " ");

        }
        data1.close();
    }
    }


