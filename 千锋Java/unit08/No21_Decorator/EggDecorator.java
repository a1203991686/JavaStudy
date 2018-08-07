package com.unit08.No21_Decorator;

/**
 * 具体的装饰者类
 * Created by littlecorgi_a1203991686 on 2018/08/07 11:20
 */
public class EggDecorator extends Decorator{

    public EggDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public float cost() {
        return super.cost() + 3.0f;
    }

    @Override
    public String description() {
        return super.description() + "+鸡蛋";
    }
}
