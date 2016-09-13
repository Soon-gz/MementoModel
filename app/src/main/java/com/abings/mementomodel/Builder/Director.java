package com.abings.mementomodel.Builder;

/**
 * Created by HaomingXu on 2016/9/13.
 */
public class Director {
    public static Player cratePlayer(Builder builder){
        builder.setName();
        builder.setSex();
        builder.setAttack();
        builder.setAttckZB();
        builder.setDefine();
        builder.setDefineZB();
        builder.setLan();
        builder.setLifeZB();
        builder.setLife();
        builder.setStyle();
        return builder.getPlayer();
    }
}
