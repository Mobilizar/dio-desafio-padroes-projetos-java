package com.company.singleton;

/**
 * Singleton "lazy Holder"
 *
 * @author rayckson
 */

public class SingletonLazyHolder {
    private static class InstanceHolder {
        private static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance() {
        return InstanceHolder.instancia;
    }
}