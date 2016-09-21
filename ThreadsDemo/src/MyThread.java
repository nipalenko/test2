/**
 * Created by user on 21.09.16.
 */
class MyThread implements Runnable {
    Thread thrd;


    MyThread(String name) {
       thrd = new Thread(this, name);
        thrd.start();
    }


    @Override
    public void run() {
        System.out.println(thrd.getName() + " - запуск.");

        try {
            for (int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("B " + thrd.getName() + "счетчик: " + count);
            }
        }
        catch (InterruptedException e) {
            System.out.println(thrd.getName() + " прерван.");
        }
        System.out.println(thrd.getName() + " завершен.");

    }
}

