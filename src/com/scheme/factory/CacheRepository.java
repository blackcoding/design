package com.scheme.factory;

/**
 * Created by andingLJ on 2017/5/23.
 */
public class CacheRepository implements Repository{
    @Override
    public void save(Object obj) {
        System.out.println(" CacheRepository : save");
    }

    @Override
    public void get() {
        System.out.println(" CacheRepository : get");
    }
}
