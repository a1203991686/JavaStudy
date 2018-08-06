package com.unit09.streamdemo;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream接口：不是存储数据结构，数据源可以是一个集合，为了函数式编程创造，
 * 惰式执行，数据只能被消费一次
 *
 * 两种类型的操作方法：
 *  1. 中间操作(生成一个Stream)
 *  2. 结束操作(执行计算操作)
 * @author littlecorgi_a1203991686@126.com on 2018/07/25 17:36
 */
public class StreamDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("good", "good", "study", "day", "day", "up");
        // foreach方法 对此流的每个元素执行操作
        // stream.forEach((str)-> System.out.println(str));
        // stream.forEach(System.out::println);

        // filter 返回由与此给定谓词匹配的此流的元素组成的流
        // stream.filter((s)->s.length()>3).forEach(System.out::println);

        // distinct 返回由该流的不同元素组成的流
        // stream.distinct().forEach(System.out::println);

        // map 返回由给定函数应用于此流的元素的结果组成的流
        // stream.map(s->s.toUpperCase()).forEach((s)-> System.out.println(s));

        // flatMap 返回由通过将提供的映射函数应用于每个元素而产生的映射流的内容来替换该流的每个元素的结果的流
        // Stream<List<Integer>> stream2 = Stream.of(Arrays.asList(1,2,3), Arrays.asList(4, 5));
        // stream2.flatMap(list->list.stream()).forEach(System.out::println);

        // reduce
        // Optional<String> opt = stream.reduce((s1, s2)->s1.length()>=s2.length()?s1:s2);
        // System.out.println(opt.get());

        // collect 使用 Collector对此流的元素执行 mutable reduction Collector
        List<String> list = stream.collect(Collectors.toList());
        list.forEach((s)-> System.out.println(s));

        // :: 方法引用
        // 引用静态方法       Integer::valueOf
        // 引用对象中的方法   list::add
        // 引用构造方法       ArrayList::new
    }
}
