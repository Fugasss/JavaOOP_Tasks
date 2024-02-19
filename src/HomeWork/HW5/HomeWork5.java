package HomeWork.HW5;

import HomeWork.HW5.Task1.*;
import HomeWork.HW5.Task2.*;
import HomeWork.HomeWork;

public class HomeWork5 extends HomeWork {

    public static void Task1(){
        KFC kfc = new KFC();
        kfc.addBasket(1290);
        kfc.addBasket(5000);
        kfc.addBasket(3750);
        kfc.addBasket(8990);
        kfc.addBasket(11890);


        MCDonalds mcDonalds1 = new MCDonalds();
        mcDonalds1.addBurger(1200);
        mcDonalds1.addBurger(2400);
        mcDonalds1.addBurger(1500);
        mcDonalds1.addBurger(4000);
        mcDonalds1.addBurger(3500);

        mcDonalds1.addWorker(1500);
        mcDonalds1.addWorker(3500);
        mcDonalds1.addWorker(1900);


        MCDonalds mcDonalds2 = new MCDonalds();
        mcDonalds2.addBurger(1300);
        mcDonalds2.addBurger(2500);
        mcDonalds2.addBurger(1100);
        mcDonalds2.addBurger(2890);
        mcDonalds2.addBurger(3000);

        mcDonalds2.addWorker(500);
        mcDonalds2.addWorker(1000);
        mcDonalds2.addWorker(1500);

        City city = new City("Almaty");
        city.addRestaurant(mcDonalds1);
        city.addRestaurant(mcDonalds2);
        city.addRestaurant(kfc);

        System.out.printf("Total tax: %.2f\n", city.getTotalTax() );
    }

    public static void Task2(){
        Person[] shooters = {
                new Newbie("A", 15, 1),
                new Experienced("B", 20, 4),
                new Veteran("C", 80, 40),
                new Experienced("D", 35, 5),
                new Newbie("E", 23, 2),
                new Experienced("F", 33, 8),
                new Veteran("G", 69, 33)
        };

        for(Person person : shooters){
            System.out.print(person);

            boolean hit = person.Shoot();

            System.out.printf("Hit the target: %b\n\n", hit);

            if(hit)
                break;
        }

    }
}


