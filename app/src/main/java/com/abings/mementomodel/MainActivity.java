package com.abings.mementomodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.abings.mementomodel.Builder.Director;
import com.abings.mementomodel.Builder.Player;
import com.abings.mementomodel.Builder.ZhanShiPlayer;
import com.abings.mementomodel.MementoModel.Caretaker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //创建角色，魔族战士
        Player player = Director.cratePlayer(new ZhanShiPlayer());
        //到了保存记录节点
        Caretaker caretaker = new Caretaker();
        //打boss之前保存状态
        caretaker.setMemento(player.createMemento());
        //打Boss之前的状态
        Log.i("Tag", player.toString());
        //单挑BOSS失败了
        player.fightWithBoss();
        //单挑之后的状态
        Log.i("Tag", player.toString());
        //读取记录，满血复活
        player.setMemento(caretaker.getMemento());
        //读取记录之后的状态
        Log.i("Tag", player.toString());
    }
}
