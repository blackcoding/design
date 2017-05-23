package com.scheme.strategy;

/**
 * Created by andingLJ on 2017-4-27.
 * 定义各种策略使用的接口
 */
public interface IStrategy {
    //// 对 目标进行算法操作
    int handler(Object o1);

}
