package DesignPattern.Decorator.deco;

import DesignPattern.Decorator.BasePize;

public class ExtraCheese extends ToppingDecorator{
    private BasePize basePize;
    public ExtraCheese(BasePize basePize) {
        this.basePize = basePize;
    }
    @Override
    public int cost() {
        return basePize.cost() + 10;
    }
}
