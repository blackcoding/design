package com.scheme.test;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;

import java.util.Iterator;

/**
 * Created by andingLJ on 2017/6/8.
 */
public class SpilterTest {
    public static void main(String[] args){
        String s = "1商贷，2公积金，  3组合贷,4全款，5组合，，6组合,,,7商贷";
        Splitter splitter = Splitter.on(",");
        Iterable<String> iter = splitter.split(s.replaceAll("[，|,]+",",").replaceAll("\\s",""));
        Iterator<String> iterator = iter.iterator();
        Iterator<String> iterator2 = iter.iterator();
        Joiner joiner = Joiner.on("####");
        String ss = joiner.join(iterator);
        System.out.println(ss);
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }

    }
}
