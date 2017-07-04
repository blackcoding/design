package com.scheme.test;


import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by andingLJ on 2017/7/3.
 */
public class ThreadTest {

    private static final ExecutorService pool = Executors.newFixedThreadPool(3);


    public static void main(String[] args) {

        int A = 0;
        int B = 0;
        int C = 0;

        for (Integer start = 1; start <= 4; start++) {
            MyCallable c = new MyCallable(start);
            pool.submit(c);
            Future<Map<String, Integer>> f = pool.submit(c);
            try {
                Map<String, Integer> retMap = f.get();
                A += retMap.get("A");
                B += retMap.get("B");
                C += retMap.get("C");
                System.out.println("======================");
                System.out.println("A======================"+A);
                System.out.println("B======================"+B);
                System.out.println("C======================"+C);

            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    private static Map<String, Integer> process(Integer start) {
        Map<String, Integer> retMap = new HashMap<>();
        retMap.put("A", start);
        retMap.put("B", start);
        retMap.put("C", start);
        return retMap;
    }

    static class MyCallable implements Callable<Map<String, Integer>> {

        private Integer start;

        public MyCallable(Integer start) {
            this.start = start;
        }

        @Override
        public Map<String, Integer> call() throws Exception {
            System.out.println("------"+Thread.currentThread().getName());
            Thread.sleep(1000L);
            return process(start);
        }
    }


}
