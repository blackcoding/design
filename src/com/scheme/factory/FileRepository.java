package com.scheme.factory;

/**
 * Created by andingLJ on 2017/5/23.
 */
public class FileRepository implements Repository {
    @Override
    public void save(Object obj) {
        System.out.println(" FileRepository : save");
    }

    @Override
    public void get() {
        System.out.println(" FileRepository : get");
    }
}
