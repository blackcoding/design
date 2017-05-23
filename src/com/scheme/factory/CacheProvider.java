package com.scheme.factory;

/**
 * Created by andingLJ on 2017/5/23.
 */
public class CacheProvider implements FactoryProvider{

    @Override
    public Repository create() {
        return new CacheRepository();
    }
}
