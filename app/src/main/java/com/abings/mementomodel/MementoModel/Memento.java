package com.abings.mementomodel.MementoModel;

/**
 * Created by HaomingXu on 2016/9/13.
 */
public class Memento {
    public String name;//姓名
    public String sex;//性别
    public String style;//职业
    public String attckZB;//攻击装备
    public String defineZB;//防御装备
    public String lifeZB;//指环装备
    public int attack;//攻击力
    public int define;//防御值
    public int life;//生命值
    public int lan;//法力值

    public Memento(String name, String sex, String style, String attckZB, String defineZB, String lifeZB, int attack, int define, int life, int lan) {
        this.name = name;
        this.sex = sex;
        this.style = style;
        this.attckZB = attckZB;
        this.defineZB = defineZB;
        this.lifeZB = lifeZB;
        this.attack = attack;
        this.define = define;
        this.life = life;
        this.lan = lan;
    }
    public Memento(){

    }

    public int getLan() {
        return lan;
    }

    public void setLan(int lan) {
        this.lan = lan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getAttckZB() {
        return attckZB;
    }

    public void setAttckZB(String attckZB) {
        this.attckZB = attckZB;
    }

    public String getDefineZB() {
        return defineZB;
    }

    public void setDefineZB(String defineZB) {
        this.defineZB = defineZB;
    }

    public String getLifeZB() {
        return lifeZB;
    }

    public void setLifeZB(String lifeZB) {
        this.lifeZB = lifeZB;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefine() {
        return define;
    }

    public void setDefine(int define) {
        this.define = define;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    @Override
    public String toString() {
        return "玩家{" +
                "姓名：'" + name + '\'' +
                "\n 性别：'" + sex + '\'' +
                "\n 职业：'" + style + '\'' +
                "\n 攻击装备：'" + attckZB + '\'' +
                "\n 防御装备：'" + defineZB + '\'' +
                "\n 指环：'" + lifeZB + '\'' +
                "\n 攻击力：" + attack +
                "\n 防御力：" + define +
                "\n 生命值：" + life +
                "\n 魔法值：" + lan +
                '}';
    }
}
