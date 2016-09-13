import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 13.09.16.
 */
public  class Help  implements FileHelp {
    int ch;
    String topic, info;
   private String helpfile;


    Help(String fname){
        helpfile = fname;
    }

    @Override
    public boolean helpon(String what) {
        try (BufferedReader hlprdr = new BufferedReader(new FileReader(helpfile))) {
            do {
                ch = hlprdr.read();
                if (ch == '#') {
                    topic = hlprdr.readLine();
                    if (what.compareTo(topic) == 0) {
                        do {
                            info = hlprdr.readLine();
                            if (info != null) System.out.println(info);
                        } while ((info != null) && (info.compareTo("") != 0));
                        return true;
                    }
                }
            } while (ch != -1);
        } catch (IOException ex) {
            System.out.println("Ощибка доступа к файлу справки.");
            return false;
        }
        return false;
    }
    @Override
    public String getSelection(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Укажите тему: ");
        try{
            topic = br.readLine();
        }
        catch(IOException ex){
            System.out.println("Ошибка чтения с консоли.");
        }

        return topic;
    }
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
