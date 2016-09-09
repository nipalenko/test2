import java.io.IOException;

/**
 * Created by user on 09.09.16.
 */
public class RussianHen extends Hen{
        int count;
        String s;
    RussianHen()throws IOException {
        count = 0;
        s = "Беларусь";
    }

    int getCountOfEggsPerMonth() {

        return count + 4;
    }

    String getDescription() {


        String a = super.getDescription();
        return a + "Моя страна "+ s + "Я несу " + getCountOfEggsPerMonth() + " яица в месяц.";
    }
}
