import Semaphore.SemaphoreImpl;
import Semaphore.Semaphore;
import Car.Car;
import Car.EndlessCar;

import java.util.Date;
import java.util.Timer;

public class Main {




    public static void main(String[] args) {




    test100Thread();


    }

    public static void test100Thread(){
        System.out.println("Hundred Thread Test ");

       final SemaphoreImpl semaphore = new SemaphoreImpl(10);

        for (int i = 0; i <20; i++) {
            new Thread(new Car(semaphore,1000)).start();
        }

    }


}
