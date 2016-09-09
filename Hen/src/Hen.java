import java.io.IOException;

/**
 * Created by user on 09.09.16.
 */
abstract class Hen {



    protected Hen() throws IOException {
    }

    int getCountOfEggsPerMonth(){

        return 0;
    }

    String getDescription(){
        return "Я курица. ";
    }
}
