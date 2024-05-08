package lab.assignment;

import lab.assignment.beforerefactoring.CoffeeMaker;

public class MochaCoffee extends CoffeeMaker{
    @Override
    public void addIngredients(){
        System.out.println("Adding cocoa powder");
        System.out.println("Adding hot milk");
    }

    @Override
    public void finalTouch(){
        System.out.println("Adding sugar");
    }
}