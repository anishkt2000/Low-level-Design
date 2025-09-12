package DesignPattern.Decorator;

import DesignPattern.Decorator.deco.ExtraCheese;
import DesignPattern.Decorator.deco.Mushroom;
import DesignPattern.Decorator.deco.ToppingDecorator;

public class Order {
    public static void main(String[] args) {
        ToppingDecorator extracheese = new ExtraCheese(new Marghrita());
        System.out.println("pizze cost: " + extracheese.cost());

        ToppingDecorator pizza =new Mushroom(new ExtraCheese(new Marghrita()));
        System.out.println("pizze with mushroom cost: " + pizza.cost());

    }
}
