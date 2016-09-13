package com.abings.mementomodel.Builder;

/**
 * Created by HaomingXu on 2016/9/13.
 */
public class ZhanShiPlayer extends Builder{
    private Player player = new Player();

    @Override
    public void setLan() {
        player.setLan(1500);
    }

    @Override
    public void setName() {
        player.setName("魔尊重楼");
    }

    @Override
    public void setSex() {
        player.setSex("男");
    }

    @Override
    public void setStyle() {
        player.setStyle("魔族战士");
    }

    @Override
    public void setAttckZB() {
        player.setAttckZB("魔族至尊饮血剑");
    }

    @Override
    public void setDefineZB() {
        player.setDefineZB("魔族至尊反甲");
    }

    @Override
    public void setLifeZB() {
        player.setLifeZB("魔族至尊狂澜铠甲");
    }

    @Override
    public void setAttack() {
        player.setAttack(3500);
    }

    @Override
    public void setDefine() {
        player.setDefine(3000);
    }

    @Override
    public void setLife() {
        player.setLife(6000);
    }

    @Override
    public Player getPlayer() {
        return player;
    }
}
