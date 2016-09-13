package com.abings.mementomodel.Builder;

import com.abings.mementomodel.MementoModel.Memento;

/**
 * Created by HaomingXu on 2016/9/13.
 */
public class Player extends Memento {

    public Player(String name, String sex, String style, String attckZB, String defineZB, String lifeZB, int attack, int define, int life, int lan) {
        super(name, sex, style, attckZB, defineZB, lifeZB, attack, define, life, lan);
    }
    public Player(){

    }

    //创建备忘录
    public Memento createMemento(){
        return (new Memento(name,sex,style,attckZB,defineZB,lifeZB,attack,define,life,lan));
    }
    //恢复状态
    public void setMemento(Memento memento){
        this.name = memento.getName();
        this.sex = memento.getSex();
        this.style = memento.getStyle();
        this.attckZB = memento.getAttckZB();
        this.defineZB = memento.getDefineZB();
        this.lifeZB = memento.getLifeZB();
        this.attack = memento.getAttack();
        this.define = memento.getDefine();
        this.life = memento.getLife();
        this.lan = memento.getLan();
    }

    public void fightWithBoss(){
        this.life = 0;
        this.lan = 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
