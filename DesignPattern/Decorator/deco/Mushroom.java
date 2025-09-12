package DesignPattern.Decorator.deco;

import DesignPattern.Decorator.BasePize;

public class Mushroom extends ToppingDecorator{
    private BasePize basePize;
    public Mushroom(BasePize basePize) {
        this.basePize = basePize;
    }
    @Override
    public int cost() {
        return basePize.cost() + 15;
    }
}
