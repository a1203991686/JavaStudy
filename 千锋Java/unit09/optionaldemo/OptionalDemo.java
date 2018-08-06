package com.unit09.optionaldemo;

import java.util.Optional;

/**
 * @author littlecorgi_a1203991686@126.com on 2018/07/26 15:26
 */
public class OptionalDemo {
    public static void main(String[] args) {
        // of:为非null值创建一个Optional
        Optional<String> optional = Optional.of("bin");

        // ofNullable 为指定值创建一个Optional对象，如果值为null，这返回一个空的Optional
        // Optional<String> optional2 = Optional.ofNullable("bin");

        // empty:创建一个空的对象
        Optional<String> optional3 = Optional.empty();

        // isPresent 如果值存在返回true，否则返回false
        // System.out.println(optional.isPresent());

        // get 如果Optional有值，则把值返回，否则抛出
        // System.out.println(optional.get());

        // ifPresent 如果Optional实例有值则为其调用consumer，否则不做处理
        // optional.ifPresent((value)-> System.out.println(value));

        // orElse 如果有值则将其返回，否则返回传入的值
        // System.out.println(optional3.orElse("无值"));

        // orElseGet 与orElse类似，但是可以接受Supplier接口的实现来用来生成默认值
        // System.out.println(optional.orElseGet(()->"default"));

        // orElseThrow 如果有值则将其返回，否则抛出supplier接口创建异常
        // try {
        //     optional3.orElseThrow(Exception::new);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }

        // map 如果有值，则对其进行调用mapping函数得到返回值，否则返回值不为null，则
        // 创建包含mapping返回值的Optional作为map方法返回值，否则为返回空Optional
        // Optional optional4 = optional.map((value)->value.toUpperCase());
        // System.out.println(optional4.orElse("没值"));

        // flatMap 如果有值，为其执行mapping函数返Optional类型返回值，否则返回空Optional
        // optional.flatMap((value)->Optional.of(value.toUpperCase()));

        // filter 如果有值并满足断言条件返回改值的Optional，否则返回空Optional
        Optional<String> optional4 = Optional.of("bin");
        optional4 = optional.filter((value)->value.length()>3);
        System.out.println(optional4.orElse("这个值的长度小于3"));
    }
}
