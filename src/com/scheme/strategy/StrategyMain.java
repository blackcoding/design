package com.scheme.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by andingLJ on 2017/5/17.
 */
public class StrategyMain {

    public static void main(String[] args){

        List<String> strList = Arrays.asList("12123","12321","231312");
        List<Integer> intList = Arrays.asList(12123,12321);
        Object o1 = null;
        Object o2 = new Object();
        Long l1 = new Long(1);
        Long l2 = new Long(1);
        List<Object> list =  new ArrayList<>();
        list.add(o1);
        list.add(o2);
        list.add(l1);
        list.add(l2);
        list.addAll(strList);
        list.addAll(intList);

        StringStrategyGood str = new StringStrategyGood();
        StrategyHandler handler = new StrategyHandler();
        System.out.println("String Good : ");
        handler.handlerList(list,str);
        IntegerStrategyGood intSty = new IntegerStrategyGood();
        System.out.println("Integer Good : ");
        handler.handlerList(list,intSty);

        handler.handlerList(list, new IStrategy() {
            @Override
            public int handler(Object o1) {
                System.out.println("handler res : -1");
                return -1;
            }
        });

        handler.handlerList(list, new IStrategy() {
            @Override
            public int handler(Object o1) {
                System.out.println("handler res : 1 ");
                return 1;
            }
        });

    }
}
