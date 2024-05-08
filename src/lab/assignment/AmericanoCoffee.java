package lab.assignment;

import lab.assignment.beforerefactoring.CoffeeMaker;

public class AmericanoCoffee extends CoffeeMaker {
    
    @Override
    public void addIngredients() {
        System.out.println("Add more hot water");
    }

    @Override
    public void finalTouch() {
        System.out.println("Add sugar and cream");
    }
}
