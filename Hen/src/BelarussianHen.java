import java.io.IOException;

/**
 * Created by user on 09.09.16.
 */
public class BelarussianHen extends Hen {


        String s ;
    int count;

    BelarussianHen() throws IOException {

        s = "Беларусь";
        count = 0;
    }

    int getCountOfEggsPerMonth() {

        return count + 2;
    }

    String getDescription() {

        String a = super.getDescription();
        return a + "Моя страна"+ s + "Я несу " + getCountOfEggsPerMonth() + " яица в месяц.";
    }
}
