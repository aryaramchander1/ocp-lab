package lab.assignment.beforerefactoring.clientcode;

import lab.assignment.AmericanoCoffee;
import lab.assignment.CapuccinoCoffee;
import lab.assignment.MochaCoffee;
import lab.assignment.beforerefactoring.CoffeeMaker;

public class CoffeeClient {


    public static void main(String[] args) {
        CoffeeMaker mochaMaker = new MochaCoffee();
        CoffeeMaker capuccinoMaker = new CapuccinoCoffee();
        CoffeeMaker americanoMaker = new AmericanoCoffee();

        mochaMaker.prepareCoffee();

        System.out.println("********************");

        capuccinoMaker.prepareCoffee();

        System.out.println("********************");

        americanoMaker.prepareCoffee();

        
    }

}
