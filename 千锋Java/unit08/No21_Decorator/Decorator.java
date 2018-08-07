package com.unit08.No21_Decorator;

/**
 * 装饰者的基类
 * Created by littlecorgi_a1203991686 on 2018/08/07 11:18
 */
public abstract class Decorator implements Drink{

    private Drink drink; //要装饰的对象

    public Decorator(Drink drink){
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost();
    }

    @Override
    public String description() {
        return drink.description();
    }

}
