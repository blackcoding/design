package com.scheme.factory;

/**
 * Created by andingLJ on 2017/5/23.
 */
public class SimpleFactory {

    public Repository create(String classType){
        Repository repository = null;
        switch (classType){
            case "cache":
                repository = new CacheRepository();
                break;
            case "db":
                repository = new DBRespository();
                break;
            case "file":
                repository = new FileRepository();
                break;
        }
        return repository;
    }

}
