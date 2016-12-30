package com.softcoaching.ro;

/**
 * Created by adrian on 12/30/16.
 */
public class GenericClass<T> {

    T obj;

    void add(T obj) {
        this.obj = obj;
    }

    T get() {
        return obj;
    }


}
