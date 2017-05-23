package com.scheme.factory;

/**
 * Created by andingLJ on 2017/5/23.
 */
public class FactoryMain {
    public static void main(String[] args){
        Repository repository = null;
        SimpleFactory simpleFactory = new SimpleFactory();
        repository = simpleFactory.create("cache");
        repository.save(new Object());
        repository.get();
        repository = simpleFactory.create("db");
        repository.save(new Object());
        repository.get();
        repository = simpleFactory.create("file");
        repository.save(new Object());
        repository.get();
        FactoryProvider provider = null;
        provider = new DBProvider();
        repository = provider.create();
        repository.save(new Object());
        repository.get();
        provider = new CacheProvider();
        repository = provider.create();
        repository.save(new Object());
        repository.get();
        provider = new FileProvider();
        repository = provider.create();
        repository.save(new Object());
        repository.get();
    }
}
