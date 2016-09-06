package Serises;

/**
 * Created by pssmo on 06.09.2016.
 */
 class ByTwos implements Serise {
     int start;
     int val;
     int prev;

    ByTwos(){
        start = 0;
        val = 0;
        prev = -2;
    }
    @Override
    public int getNext() {
        prev = val;
        val +=2;
        return val;
    }

    @Override
    public void reset() {

        start = 0;
        val = 0;
        prev = 0;

    }

    @Override
    public void setStart(int x) {
        start = x;
        val = x;
        prev = x;
    }

        int getPrevious(){
            val=prev;
            prev -= 2;
            return prev;
    }


}
