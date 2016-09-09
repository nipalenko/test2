import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Created by user on 09.09.16.
 */
public class HenFactory  {

    public static void main (String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

       BelarussianHen BelHen = new BelarussianHen();
        RussianHen RusHen = new RussianHen();
        if (s.contains("Беларусь"))
        System.out.println(BelHen.getDescription());
       else if (s.contains("Россия"))
        System.out.print(RusHen.getDescription());
        else  System.out.print("Введи то , что просят.");
    }


    }



