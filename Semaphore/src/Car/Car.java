package Car;

import Semaphore.SemaphoreImpl;

/**
 * Created by Vadim on 25.03.2016.
 */
public class Car implements Runnable {
    private SemaphoreImpl semaphore;
    private int carCapacity;




    public Car(SemaphoreImpl semaphore,int capacity) {

        this.semaphore = semaphore;
        this.carCapacity= capacity;

    }

    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " Waiting");
            semaphore.acquire();

            System.out.println(Thread.currentThread().getName() + " working ! ");

            synchronized (this) {
                int summ=0;
                for (int i = 0; i < carCapacity; i++) {
                    summ += i;
                }

            }

            System.out.println(Thread.currentThread().getName() + " end !");

            semaphore.release();


        } catch (InterruptedException e) {
            e.printStackTrace();
        }







    }
}
