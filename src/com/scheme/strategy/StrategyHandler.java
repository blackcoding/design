package com.scheme.strategy;

import java.util.List;

/**
 * Created by andingLJ on 2017/5/17.
 */
public class StrategyHandler {

    public  <T> void handlerList(List<T> list, IStrategy strategy){

        int count = 0;
        for(T t : list){
            int res = strategy.handler(t);
            if(res > 0){
                count ++;
            }else if(res < 0){
                count --;
            }
        }
        if(count > 0){
            System.out.println("============策略得到的正结果数多============");
        }else if(count == 0){
            System.out.println("============策略得到的正负结果数一样多============");
        }else {
            System.out.println("============策略得到的负结果数多============");
        }

    }

}
