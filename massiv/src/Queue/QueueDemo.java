package Queue;

/**
 * Created by pssmo on 08.09.2016.
 */
public class QueueDemo {
    public static void main(String[] args){
        Queue bigQ = new Queue(100);
        Queue smallQ = new Queue(4);
        char ch;

        System.out.println("Использование очереид bigQ для хранения алфавита.");


        for (int i = 0; i < 26 ; i++)   //заполнение массива алфовитом
            bigQ.put((char)('A' + i));

        //Вывод массива на экран
        System.out.print("Содержимое очереди bigQ : ");
        for (int i = 0; i <26 ; i++) {
            ch = bigQ.get();
            if (ch!= (char)0) System.out.print(ch);
        }

        System.out.println("\n");

        //Использование очереди smallQ для генерации ошибок
        for (int i = 0; i <5 ; i++) {
            System.out.print("Попытка сохранения " + (char)('Z' - i));
                smallQ.put((char)('Z'- i));
            System.out.println();
        }
            System.out.println();

        ///Дополнительные ошибки при обращении к очереди smallQ

        System.out.print("Содержимое очереди smallQ: ");
        for (int i = 0; i < 5; i++) {
            ch = smallQ.get();

            if (ch != (char) 0) System.out.print(ch);
            
        }
    }
}
