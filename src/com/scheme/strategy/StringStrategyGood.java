package com.scheme.strategy;

/**
 * Created by andingLJ on 2017/5/17.
 */
public class StringStrategyGood implements IStrategy{

    @Override
    public int handler(Object o1) {
        if(null == o1)return 0;
        if(o1 instanceof String){
            return 1;
        }else if(o1 instanceof Integer){
            return -1;
        }else{
            System.out.println("==============无效的类型==========");
        }
        return 0;
    }
}
