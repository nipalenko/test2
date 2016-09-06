package Serises;

/**
 * Created by pssmo on 06.09.2016.
 */
 class ByTwos implements Serise {
     int start;
     int val;
    ByTwos(){
        start = 0;
        val = 0;
    }
    @Override
    public int getNext() {
        val +=2;
        return val;
    }

    @Override
    public void reset() {
        start = 0;
        val = 0;

    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;

    }
}
