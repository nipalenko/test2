/**
 * Created by user on 13.09.16.
 */
public class Call {
    public static void main(String [] args){
        Help hlpobj = new Help("D:/helpfile.txt");
        String topic;


        System.out.println("Воспользуйтесь справочной системой. \n" + "Для выхода из системы введите 'stop'.");

        do {
            topic = hlpobj.getSelection();

            if(!hlpobj.helpon(topic))
                System.out.println("Тема не найдена. \n");

        } while(topic.compareTo("stop") != 0);


    }
}
