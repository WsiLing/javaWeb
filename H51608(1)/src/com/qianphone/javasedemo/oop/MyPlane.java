package com.qianphone.javasedemo.oop;

/**
 * Created by Admin on 2017/1/4.
 */
public class MyPlane extends Plane implements Weapon{

    public MyPlane(int liveValue){
        this.liveValue = liveValue;
    }

    public void clearScreen(){
        System.out.println("释放全屏伤害的炸弹.");
    }

    public void shoot(){
        System.out.println("我方飞机发射了一发弹药");
    }
}
