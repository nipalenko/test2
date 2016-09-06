package Serises;

/**
 * Created by pssmo on 06.09.2016.
 */
public class SeriesDemo  {
    public static void main(String[] args){
        ByTwos ob = new ByTwos();
        ByTrees ob1 = new ByTrees();

        for (int i = 0; i <5 ; i++) {
            System.out.println("Следующее значение: " + ob.getNext());
        }
        System.out.println("\nСброс\n");
        ob.reset();
        ob.setStart(100);

        for (int i = 0; i < 5; i++) {
            System.out.println("Предыдущее значение " + ob.getPrevious());

        }
        System.out.println("\nСброс\n");
        ob.reset();
        for (int i = 0; i <5 ; i++) {
            System.out.println("Следующее значение: " + ob1.getNext());
        }
    }


}
