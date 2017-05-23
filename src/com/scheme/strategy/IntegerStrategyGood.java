package com.scheme.strategy;

/**
 * Created by andingLJ on 2017/5/17.
 */
public class IntegerStrategyGood implements IStrategy {
    @Override
    public int handler(Object o1) {
        if(null == o1)return 0;
        if(o1 instanceof Integer){
            return 1;
        }else if(o1 instanceof String){
            return -1;
        }
        return 0;
    }
}
