package com.ruuboo.javademo.oop;

/**
 * Created by Administrator on 2017/1/4 0004.
 */
// MyPlane类 继承 Plane类，
public class MyPlane extends Plane implements Weapon {
    public void shoot(){
        System.out.println("我方飞机发射了一发子弹");
    }
    public MyPlane (int liveValue){
        this.liveValue = liveValue;
        System.out.println("");
    }

}
