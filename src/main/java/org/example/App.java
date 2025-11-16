package org.example;

import java.util.Scanner;

/**
 * MANUAL DI – Manual Dependency Injection
 * -----------------------------------------
 * What is DI?
 *  DI = Giving an object’s required dependency from outside.
 *  (Not creating inside)
 *
 *  Your Car needs an engine → engine is a dependency.
 *
 *  You give engine to car like this:
 *
 *  car.setEngine(petrolEngine);  line number 36,41
 *
 *  This is Manual Dependency Injection. *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Starting the Petrol engine
        Scanner scanner=new Scanner(System.in);

        System.out.println("1. Petrol engine");
        System.out.println("2. Diesel engine");
        Car car=new Car();
        int choice=scanner.nextInt();
        switch (choice){

            case 1: PetrolEngine petrolEngine=new PetrolEngine();
                    car.setEngine(petrolEngine);
                    car.drive();
                    break;
            case 2:
                   DieselEngine dieselEngine=new DieselEngine();
                   car.setEngine(dieselEngine);
                   car.drive();
                   break;

            default:
                System.out.println("Invalid input !!");;
        }
        scanner.close();
    }
}
