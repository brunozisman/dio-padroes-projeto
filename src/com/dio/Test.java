package com.dio;

import com.dio.com.dio.singleton.SingletonEager;
import com.dio.com.dio.singleton.SingletonLazy;
import com.dio.com.dio.singleton.SingletonLazyHolder;
import com.dio.facade.Facade;
import com.dio.strategy.*;

public class Test {

    public static void main(String[] args) {

        //  Singleton

        System.out.println("\n=====SINGLETON=====\n");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);



        //  Strategy

        System.out.println("\n=====STRATEGY=====\n");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();

        //  Facade

        System.out.println("\n=====FACADE=====\n");

        Facade facade = new Facade();
        facade.MigrarCliente("Bruno" ,"123125432");

    }
}
