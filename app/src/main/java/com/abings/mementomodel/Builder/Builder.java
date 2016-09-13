package com.abings.mementomodel.Builder;

/**
 * Created by HaomingXu on 2016/9/13.
 */
public abstract class Builder {

    public abstract void setLan() ;


    public abstract void setName() ;


    public abstract void setSex() ;


    public abstract void setStyle() ;


    public abstract void setAttckZB() ;

    public abstract void setDefineZB() ;

    public abstract void setLifeZB() ;


    public abstract void setAttack() ;


    public abstract void setDefine() ;


    public abstract void setLife() ;

    public abstract Player getPlayer();
}
