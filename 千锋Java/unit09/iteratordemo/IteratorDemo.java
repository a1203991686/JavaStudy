package com.unit09.iteratordemo;

import com.unit09.setdemo.Cat;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 集合的输出（迭代）
 * @author littlecorgi_a1203991686@126.com
 * @Date 2018/07/25 16:22
 */
public class IteratorDemo {

    // predicate断言接口
    private static void predicateTest(){
        List<String> list = Arrays.asList("Larry","Moe","Curly","Tom","QF_vince");
        List<String> result = filter(list,(s)->s.contains("o"));
        result.forEach(System.out::println);
    }

    private static List<String> filter(List<String> list, Predicate<String> p){
        List<String> result = new ArrayList<>();
        for ( String s: list ) {
            if (p.test(s)){ //测试是否符合要求
                result.add(s);
            }
        }
        return result;
    }

    // supplier代表结果供应商
    private static void supplierTest(){
        List<Integer> list = getNums(10, ()->(int)(Math.random()*100));
        list.forEach(System.out::println);
    }

    private static List<Integer> getNums(int n, Supplier<Integer> sup){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++){
            list.add(sup.get());
        }
        return list;
    }

    // function表示接受一个参数并产生结果的函数
    private static void functionTest(){
        String s = strToUpper("qf_vince", (str)->str.toUpperCase());
        System.out.println(s);
    }

    public static String strToUpper(String str, Function<String, String> f){
        return f.apply(str);
    }

    /*
     * JDK1.8 新的迭代方法
     */
    private static void foreach(){
        List<String> vs = new ArrayList<>();
        vs.add("tom");
        vs.add("jack");
        vs.add("job");
        vs.add("lily");

        vs.forEach(s-> System.out.println(s));
        vs.forEach(System.out::println);
    }

    private static void enumRation(){
        Vector<String> vs = new Vector<>();
        vs.add("tom");
        vs.add("jack");
        vs.add("job");
        vs.add("lily");

        Enumeration<String> es = vs.elements();
        while (es.hasMoreElements()){
            System.out.println(es.nextElement());
        }
    }

    // foreach
    private static void iterator1(Collection<Cat> c){
        for (Cat cat : c){
            System.out.println(cat);
        }
    }

    // iterator
    private static void iterator2(Collection<Cat> c){
        Iterator<Cat> iter = c.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
    }

    public static void main(String[] args) {
        List<Cat> list = new ArrayList<>();
        Cat c1 = new Cat("miaomiao",5,1);
        Cat c2 = new Cat("huahua",2,2);
        Cat c3 = new Cat("tom",5,3);
        Cat c4 = new Cat("miaomiao",3,1);
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        // iterator1(list);
        // System.out.println();
        // iterator2(list);

        // enumRation();
        // functionTest();
        // supplierTest();
        predicateTest();
    }
}
