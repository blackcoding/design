package com.scheme.test;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * Created by andingLJ on 2017/6/29.
 */
public class MutliMapTest {

    public static void main(String[] args){
        KeyValue2 kv2_1 = new KeyValue2();
        kv2_1.setKey("key1");
        kv2_1.setValue("value1");
        KeyValue2 kv2_2 = new KeyValue2();
        kv2_2.setKey("key1");
        kv2_2.setValue("value1");
        KeyValue2 kv2_3 = new KeyValue2();
        kv2_3.setKey("key3");
        kv2_3.setValue("value3");
        KeyValue2 kv2_4 = kv2_1;
        Multimap<KeyValue2, Integer> map = ArrayListMultimap.<KeyValue2, Integer>create();
        map.put(kv2_1,1);
        map.put(kv2_2,2);
        map.put(kv2_3,3);
        map.put(kv2_4,4);

        for(KeyValue2 k : map.keySet()){
            System.out.println(k);
            System.out.println(map.get(k));
        }
        System.out.println("---------------------------------------------");
        for(KeyValue2 k : map.keys()){
            System.out.println(k);
            System.out.println(map.get(k));
        }

    }
}
