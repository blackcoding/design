package com.scheme.factory;

/**
 * Created by andingLJ on 2017/5/23.
 */

/**
 * 把创建实例化类的创建方法抽象了
 */
public interface FactoryProvider {
    Repository create();
}
