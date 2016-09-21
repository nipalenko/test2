package sumArray;


public class SumArray {
    private int sum;

    synchronized int sumArray(int nums[]){
        sum = 0;

        for (int i = 0; i <nums.length ; i++) {
            sum += nums[i];
            System.out.println("Текущее значение суммы "+ Thread.currentThread().getName()+ ": " + sum);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.print("Прерывание основного потока.");
            }
        }
        return sum;
    }
}
