package com.unit08.No21_Decorator;

/**
 * 具体的被装饰者类
 * 豆浆
 * Created by littlecorgi_a1203991686 on 2018/08/07 11:16
 */
public class SoyaBeenMilk implements Drink{

    @Override
    public float cost() {
        return 10f;
    }

    @Override
    public String description() {
        return "纯豆浆";
    }

}
