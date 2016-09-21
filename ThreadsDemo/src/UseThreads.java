
/**
 * Created by user on 21.09.16.
 */
 class UseThreads  {
    public static void main (String[] args){

        System.out.println("Основной поток запущен.");


        MyThread t = new MyThread("Child 1 ");
        MyThread t1 = new MyThread("Child 2 ");
        MyThread t2 = new MyThread("Child 3 ");


        for (int i = 0; i < 50; i++) {
            System.out.print(".");
            try{
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Прерывание основного потока.");
            }
        }
        System.out.println("Завершение основного потока.");
    }
}
