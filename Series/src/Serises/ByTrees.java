package Serises;

/**
 * Created by pssmo on 06.09.2016.
 */
public class ByTrees implements Serise {
    int start;
    int val;
    int prev;

    ByTrees(){
        start =0;
        val = 0;
        prev = 0;
    }



    @Override
    public int getNext() {
        prev = val;
        val +=3;

        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val =0;
        prev = 0;
    }

    @Override
    public void setStart(int x) {
        start =x;
        val=x;
        prev = x;
    }

    int getPrevious(){
        val = prev;
        prev -=3;
        return prev;
    }
}
