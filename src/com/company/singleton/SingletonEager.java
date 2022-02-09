package com.company.singleton;

/**
 * Singleton "Apressado"
 *
 * @author rayckson
 */
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance() {
        return instancia;
    }
}
